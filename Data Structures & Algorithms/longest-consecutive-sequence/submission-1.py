class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        num = set(nums)
        num = list(num)
        num.sort()
        print(num)
        left = 0
        seq_len = 1
        longest_seq = 1
        for right in range(1, len(num)):
            if num[right] - num[left] == 1:
                seq_len += 1
                longest_seq = max(longest_seq, seq_len)
            else:
                seq_len = 1
            left += 1
        return longest_seq