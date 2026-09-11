class Solution {
    public int maxProfit(int[] prices) {
        int mProfit = 0;
        int left = 0;
        for (int right = 0; right < prices.length; right++){
            mProfit = Math.max(prices[right] - prices[left], mProfit);
            if (prices[right] < prices[left]){
                left = right;
            }
        }
        return mProfit;
    }
}
