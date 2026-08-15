class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        maxNumConsecutive = 0
        currNumConsecutive = 0
        for num in nums:
            if num == 1:
                currNumConsecutive += 1
            else:
                currNumConsecutive = 0
            maxNumConsecutive = max(maxNumConsecutive, currNumConsecutive)
        return maxNumConsecutive