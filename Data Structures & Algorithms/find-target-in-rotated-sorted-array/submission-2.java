class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        //find min/pivot
        while(left < right){
            int middle = (left+right)/2;
            if(nums[middle] < nums[right]){
                right = middle;
            }else{
                left = middle+1;
            }
        }
        int pivotIdx = left;
        int pivotVal = nums[left];
        left = 0;
        right = nums.length-1;
        if(target >= pivotVal && target <= nums[right]){
            left = pivotIdx;
        }else if(target > nums[right])
        {
            right = pivotIdx-1;
        }
        //binary search
        while(left <= right){
            int middle = (left+right)/2;
            if(nums[middle] == target){
                return middle;
            }else if(nums[middle] > target){
                right = middle-1;
            }else{
                left = middle+1;
            }
        }
        return -1;
    }
}
