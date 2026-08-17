class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> bracketMap = new HashMap<>(Map.of(')','(','}','{',']','['));
        Stack<Character> stack = new Stack<>();
        
        for (char c: s.toCharArray()){
            if (bracketMap.containsKey(c)){//closed bracket
                if (!stack.empty() && (stack.peek() == bracketMap.get(c))){
                    stack.pop();
                }
                else{//stack is empty
                    return false;
                }
            }
            else{//open bracket
                stack.push(c);
            }
        }
        if (stack.empty()){
            return true;
        } 
        else {
            return false;
        }
    }
}
