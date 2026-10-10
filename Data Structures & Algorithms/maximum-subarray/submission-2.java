class Solution {
    public int maxSubArray(int[] nums) {
        int maxSubArr = nums[0];
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
