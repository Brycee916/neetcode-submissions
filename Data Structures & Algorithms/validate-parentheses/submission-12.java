class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('{','}');
        map.put('[',']');
        //if it's an open bracket, add to the stack
        //if it's a closed bracket, pop from the stack
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                stack.push(s.charAt(i));
            }
            else if(s.charAt(i) == ')'){
                if(stack.isEmpty()) return false;
                if(stack.peek() == '('){
                    stack.pop();
                }else{
                    return false;
                }
            } else if(s.charAt(i) == '}'){
                if(stack.isEmpty()) return false;
                if(stack.peek() == '{'){
                    stack.pop();
                }else{
                    return false;
                }
            } else if(s.charAt(i) == ']'){
                if(stack.isEmpty()) return false;
                if(stack.peek() == '['){
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
