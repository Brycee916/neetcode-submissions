class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        my_map = {}
        for i in range(len(nums)):
            targ_num = target - nums[i]
            if targ_num in my_map:
                return [my_map.get(targ_num), i]
            my_map[nums[i]] = i