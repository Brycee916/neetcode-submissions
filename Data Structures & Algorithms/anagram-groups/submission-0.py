class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #create dictionary with values being a list
        #create a list of 26 values
        res = defaultdict(list)
        
        for s in strs:
            count = [0] * 26 

            for c in s: #for every character in each string
                count[ord(c) - ord("a")] += 1 #ascii value of character and subtract ascii of a
            
            res[tuple(count)].append(s)
        print(res)
        return res.values()
                