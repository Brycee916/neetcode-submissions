class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        left = 0
        max_profit = 0
        for right in range(1, len(prices)):
            curr_profit = prices[right] - prices[left]
            max_profit = max(curr_profit, max_profit)
            if curr_profit < 0:
                left = right
        return max_profit