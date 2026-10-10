class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length-1;
        while(left < right){
            int l = numbers[left];
            int r = numbers[right];
            if((l+r) == target) return new int[]{left+1, right+1};
            if((l+r) > target){
                right--;
            } else{
                left++;
            }
        }
        return new int[]{0,0};
    }
}
