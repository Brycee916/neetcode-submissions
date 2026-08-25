class Solution {
    public boolean isAnagram(String s, String t) {
        int[] countChars = new int[26];//[a, b, c, d, ...]

        for (int i = 0; i < s.length(); i++){
            countChars[(int)s.charAt(i) - (int)'a'] += 1;
        }
        for (int i = 0; i < t.length(); i++){
            countChars[(int)t.charAt(i) - (int)'a'] -= 1;
        }
        for (int i : countChars){
            if (i != 0){
                return false;
            }
        }
        return true;
    }
}
