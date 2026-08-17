class Solution {
    public boolean isValid(String s) {
        Stack<Character> openBracket = new Stack<>();
        Boolean result = false;
        if (s.length() == 1)
            return result;
        for (char c: s.toCharArray()){
            //if open bracket, add to stack
            if (c == '(' || c == '{' || c == '['){
                openBracket.push(c);
            }
            //if closed bracket, remove from stack
            else if (c == ')' || c == '}' || c == ']'){
                if (openBracket.empty()){
                    return result;
                }
                if (openBracket.peek() == '(' && c == ')'){
                    openBracket.pop();
                }
                else if(openBracket.peek() == '{' && c == '}'){
                    openBracket.pop();
                }
                else if(openBracket.peek() == '[' && c == ']'){
                    openBracket.pop();
                }
                else{
                    return result;
                }
            }
        }
        if (!openBracket.empty()){
            return result;
        }
        else{
            result = true;
            return result;
        }
    }
}
