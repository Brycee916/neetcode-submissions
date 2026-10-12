class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ret = new LinkedList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String word: strs){
            int[] count = new int[26];
            for(int i = 0; i < word.length(); i++){
                count[word.charAt(i) - 'a']++;
            }    
            String c = Arrays.toString(count);
            if(!map.containsKey(c)){
                List<String> w = new LinkedList<>();
                w.add(word);
                map.put(c,w);
            } else {
                map.get(c).add(word);
            }
        }
        for(String words: map.keySet()){
            ret.add(map.get(words));
        }
        return ret;
    }
}
