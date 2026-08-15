class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        
        max_profit = 0
        for left in range(len(prices)-1):
            for right in range(left+1, len(prices)):
                curr_profit = prices[right] - prices[left]
                max_profit = max(curr_profit, max_profit)
                right += 1
        return max_profit