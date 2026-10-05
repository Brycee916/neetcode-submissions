class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int min = nums[0];
        while(left <= right){
            int middle = (left+right)/2;
            if(nums[middle] <= nums[right]){
                right = middle;
                min = Math.min(min, nums[left]);
                if(left == right){
                    break;
                }
            } else{
                left = middle+1;
            }
        }
        return min;
    }
}
