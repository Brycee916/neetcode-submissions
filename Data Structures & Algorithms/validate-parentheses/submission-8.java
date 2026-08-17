class Solution {
    public boolean isValid(String s) {
        Map<Character,Character> hashmap = new HashMap<>(Map.of(
            ')','(','}','{',']','['
        ));
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()){
            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            }
            else{
                if (hashmap.containsKey(c) && (!stack.empty())){
                    if (stack.peek() == hashmap.get(c)){
                        stack.pop();
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
