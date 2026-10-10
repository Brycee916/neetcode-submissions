class Solution {
    public int maxSubArray(int[] nums) {
        int maxSubArr = Integer.MIN_VALUE;
        int currSubArr = 0;
        for(int num: nums){
            currSubArr += num;
            maxSubArr = Math.max(currSubArr, maxSubArr);
            if(currSubArr < 0){
                currSubArr = 0;
            }
        }
        return maxSubArr;
    }
}
