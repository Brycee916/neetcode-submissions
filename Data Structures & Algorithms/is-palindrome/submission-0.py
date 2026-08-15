class Solution:
    def isPalindrome(self, s: str) -> bool:
        #two pointer approach, uses O(n) time complexity and O(1) Space
        left, right = 0, len(s)-1
        while left < right:
            while left < right and not self.isAlphaNum(s[left]):
                left += 1
            while left < right and not self.isAlphaNum(s[right]):
                right -= 1
            #turn compare the lowercase of it
            if s[left].lower() != s[right].lower():
                return False
            left += 1
            right -= 1
        return True

    #is alphanumeric, a number or letter
    def isAlphaNum(self, c):
        return (ord('A') <= ord(c) <= ord('Z') or 
                ord('a') <= ord(c) <= ord('z') or 
                ord('0') <= ord(c) <= ord('9'))