class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        //[-4, -1, -1, 0, 1, 2]
        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i-1]) continue;
            int left = i+1;
            int right = nums.length-1;
            while(left < right){
                if((nums[i]+nums[left]+nums[right]) == 0){
                    List<Integer> triplet = new ArrayList<>();
                    triplet.add(nums[i]);
                    triplet.add(nums[left]);
                    triplet.add(nums[right]);
                    result.add(triplet);
                    left++;
                    right--;
                } else if(nums[i]+nums[left]+nums[right] < 0){
                    left++;
                } else{
                    right--;
                }
            } 

        }
        HashSet<List<Integer>> set = new HashSet<>();
        for (List<Integer> list: result){
            if (!set.contains(list)){
                set.add(list);
            }
        }
        List<List<Integer>> ret = new ArrayList<>();
        for (List<Integer> list: set){
            ret.add(list);
        }
        return ret;
    }
}
