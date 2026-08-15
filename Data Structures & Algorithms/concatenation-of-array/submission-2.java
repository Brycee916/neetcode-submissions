class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length * 2];
        int n = 0;
        int a = 0;
        while (a < ans.length){
            ans[a++] = nums[n++];
            if (n == nums.length)  
                n = 0;
        }
        return ans;
    }
}