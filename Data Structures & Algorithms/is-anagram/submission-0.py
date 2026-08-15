class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #create two hashmaps where each will contain key=character and value=number of times they show up 
        if len(s) != len(t):
            return False
        my_dict_s = {}
        my_dict_t = {}
        for char in s:
            if char not in my_dict_s:
                my_dict_s[char] = 1
            else: 
                my_dict_s[char] += 1
        for char in t:
            if char not in my_dict_t:
                my_dict_t[char] = 1
            else:
                my_dict_t[char] += 1
            
        print("dict_s: ", my_dict_s)
        print("dict_t: ", my_dict_t)

        values = my_dict_t.values()
        for key,value in my_dict_s.items():
            if key not in my_dict_t:
                return False
            else:#key is in dictionary
                if value not in values:
                    return False
        return True