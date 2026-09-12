class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < tokens.length; i++){
            if(tokens[i].equals("+")){
                //pop 2 from stack
                int num1 = stack.pop();
                int num2 = stack.pop();
                int sum = num2 + num1;
                stack.push(sum);

            } else if(tokens[i].equals("-")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                int sum = num2 - num1;
                stack.push(sum);
            } else if(tokens[i].equals("*")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                int sum = num2 * num1;
                stack.push(sum);
            } else if(tokens[i].equals("/")){
                int num1 = stack.pop();
                int num2 = stack.pop();
                int sum = num2 / num1;
                stack.push(sum);
            } else{
                stack.push(Integer.parseInt(tokens[i]));
            }
        }
        return stack.pop();
    }
}
