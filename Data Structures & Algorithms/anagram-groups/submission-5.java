class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new LinkedList<>();
        Map<String,List<String>> map = new HashMap<>();
        for(String word: strs){
            int[] count = new int[26];
            for(int i = 0; i < word.length(); i++){
                count[word.charAt(i) - 'a']++;
            }
            String key = Arrays.toString(count);
            if(!map.containsKey(key)){
                List<String> listWord = new LinkedList<>();
                listWord.add(word);
                map.put(key, listWord);
            }else{
                map.get(key).add(word);
            }
        }
        // for(Map.Entry<String,List<String>> m: map.entrySet()){
        //     System.out.println(m);
        // }
        for(Map.Entry<String,List<String>> m : map.entrySet()){
            List<String> v = m.getValue();
            res.add(v);
        }
        // System.out.println(map.keySet());
        // for(String count: map.keySet()){
        //     res.add(map.get(count));
        // }
        return res;
    }
}
