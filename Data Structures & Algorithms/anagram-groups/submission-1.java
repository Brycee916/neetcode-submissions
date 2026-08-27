class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word: strs){
            int[] countChar = new int[26];

            for (char ch : word.toCharArray()){
                char lower = Character.toLowerCase(ch);
                countChar[(int)lower - (int)'a'] += 1;
            }
            String key = Arrays.toString(countChar);
    
            if(!map.containsKey(key)){
                List<String> list = new ArrayList<>();
                list.add(word);
                map.put(key, list);
            }
            else{//hashmap already contains key
                List<String> list = new ArrayList<>();
                map.get(key).add(word);
            }
        }

        List<List<String>> result = new ArrayList<>();
        for (List<String> list : map.values()){
            result.add(list);
        }
        
        return result;
    }
}
