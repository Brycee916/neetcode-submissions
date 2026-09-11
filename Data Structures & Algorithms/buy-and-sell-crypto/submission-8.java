class Solution {
    public int maxProfit(int[] prices) {
        int mProfit = 0;
        int left = 0;
        for (int right = 1; right < prices.length; right++){
            int profit = prices[right] - prices[left];
            mProfit = Math.max(profit, mProfit);
            if (prices[right] < prices[left]){
                left = right;
            }
        }
        return mProfit;
    }
}
