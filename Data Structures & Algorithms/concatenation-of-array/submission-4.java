class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[] = new int[nums.length * 2];
        int inc = 0;
        for (int i = 0; i < 2; i++){
            for (int n: nums){
                ans[inc++] = n;
            }
        }
        return ans;
    }
}