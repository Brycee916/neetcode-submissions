class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        //if it's not rotated, min will always be indx 0
        if(nums[left] < nums[right]){
            return nums[left];
        }
        while(left <= right){
            int middle = (right + left) / 2;
            if(left == right){
                return nums[middle];
            }
            if(nums[middle] < nums[left]){
                if(nums[middle] < nums[middle-1]){
                    return nums[middle];
                }else{
                    right = middle;
                }
            } else if(nums[middle] > nums[right]){
                if(nums[middle] > nums[middle+1]){
                    return nums[middle+1];
                }else{
                    left = middle;
                }   
            }
        }
        return 0;
    }//[4,0,1,2,3]
}
