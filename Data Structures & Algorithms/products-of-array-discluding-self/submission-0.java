class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        //calculate prefix sum [1,2,8,48]
        for(int i = 0; i < nums.length; i++){
            if(i == 0) {
                prefix[i] = nums[i];
            } else{
                prefix[i] = prefix[i-1] * nums[i];
            }
        }
        //calculate postfix sum [48,48,24,6]
        for(int i = nums.length-1; i >= 0; i--){
            if(i == nums.length-1) {
                postfix[i] = nums[i];
            } else{
                postfix[i] = postfix[i+1] * nums[i];
            }
        }
        //calculate output [48,24,12,8]
        for(int i = 0; i < nums.length; i++){
            if(i == 0){
                output[i] = postfix[i+1];
            } else if(i == nums.length-1){
                output[i] = prefix[i-1];
            } else{
                output[i] = prefix[i-1] * postfix[i+1];
            }
        }
        return output;
    }
}  
