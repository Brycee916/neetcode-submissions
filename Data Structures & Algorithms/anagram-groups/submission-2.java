class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        Map<String,List<String>> map = new HashMap<>();
        for (String word: strs){
            int[] count = new int[26];
            for (char ch: word.toCharArray()){
                count[(int)ch - (int)'a'] += 1;
            }
            String countString = Arrays.toString(count);
            //add key value pairs into hashmap
            if(!map.containsKey(countString)){
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(countString, list);
            } else{
                map.get(countString).add(word);
            }
        }
        for (String countWord: map.keySet()){
            result.add(map.get(countWord));
        }
        return result;
    }
}
