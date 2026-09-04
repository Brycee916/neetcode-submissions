class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int lo = 0;
        int l = 0;
        int r = 0;
        while(r < s.length()){
            if (!set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                lo = Math.max(set.size(), lo);
                r++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
        }
        return lo;
    }
}
