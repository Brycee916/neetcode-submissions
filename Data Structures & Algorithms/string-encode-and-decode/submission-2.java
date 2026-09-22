class Solution {

    public String encode(List<String> strs) {
        String encoded = "";
        for(String str: strs){
            int strLen = str.length();
            encoded = encoded + "#" + strLen + "#" + str;
        }
        return encoded;
    }
//5#Hello5#World
    public List<String> decode(String str) {
        List<String> strs = new ArrayList<>();
        int left = 0;
        while(left < str.length()){
            //if it's encoded value
            if(str.charAt(left) == '#'){
                int endNum = left+1;
                while(str.charAt(endNum) != '#'){
                    endNum++;
                }
                String strLenString = str.substring(left+1, endNum);
                int strLen = Integer.parseInt(strLenString);
                int wordStart = endNum+1;
                int wordEnd = endNum+1+strLen;
                strs.add(str.substring(wordStart, wordEnd));
                left = wordEnd;
            } else{
                break;
            }
        }
        return strs;
    }
}
