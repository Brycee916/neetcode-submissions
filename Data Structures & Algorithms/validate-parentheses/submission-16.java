class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false; 
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
        //if it's an open bracket, add to the stack
        //if it's a closed bracket, pop from the stack
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '(' || c == '{' || c == '[') stack.push(c);
            if(stack.isEmpty()) return false;
            if(map.containsKey(c)){
                if(stack.peek() == map.get(c)){
                    stack.pop();
                }else{
                    return false;
                }
            } 
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
