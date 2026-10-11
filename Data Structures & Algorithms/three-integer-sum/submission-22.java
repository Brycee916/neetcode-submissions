class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();
        List<List<Integer>> ret = new LinkedList<>();
        Arrays.sort(nums);
        //[-4,-1,-1,0,1,2]
        for(int left = 0; left < nums.length; left++){
            if(nums[left] > 0) break;
            if(left > 0 && nums[left] == nums[left-1]) continue;//skips duplicates
            int middle = left+1;
            int right = nums.length-1;
            while(middle < right){
                if(nums[left] + nums[middle] + nums[right] == 0){
                    List<Integer> sumZeroes = new LinkedList<>();
                    sumZeroes.add(nums[left]);
                    sumZeroes.add(nums[middle]);
                    sumZeroes.add(nums[right]);
                    result.add(sumZeroes);
                    middle++;
                } else if(nums[left] + nums[middle] + nums[right] < 0){
                    middle++;
                } else{//nums[left] + nums[middle] + nums[right] > 0)
                    right--;
                }
            }
        }
        for(List<Integer> ll : result){
            ret.add(ll);
        }
        return ret;
    }
}
