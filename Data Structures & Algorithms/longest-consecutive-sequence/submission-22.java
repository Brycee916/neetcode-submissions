class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        for(int num: nums){
            set.add(num);
        }
        for(int i = 0; i < nums.length; i++){
            int smallest = nums[i];
            int currLongest = 1;
            if(set.contains(smallest-1)){
                continue;
            }
            while(set.contains(smallest+1)){
                smallest++;
                currLongest++;
            }
            longest = Math.max(longest, currLongest);
        }
        return longest;
    }
}
