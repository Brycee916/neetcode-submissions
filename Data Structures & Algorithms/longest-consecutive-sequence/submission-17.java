class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        for (int num: nums){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        for (int i = 0; i < nums.length; i++){
            int longer = 1;
            //if we are at the smallest value consecutively
            if(!set.contains(nums[i]-1)){
                int j = nums[i];
                while(set.contains(j+1)){
                    longer++;
                    j++;
                    set.remove(j);
                }
            }
            longest = Math.max(longer,longest);
        }
        return longest;
    }
}