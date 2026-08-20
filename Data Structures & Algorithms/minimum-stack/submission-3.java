class MinStack {
    //a stack for general
    Stack<Integer> stack;
    //a stack storing the minumum values > smaller values keep adding to stack
    Stack<Integer> minValueStack;
    int min;
    public MinStack() {
        stack = new Stack<>();
        minValueStack = new Stack<>();
        min = Integer.MAX_VALUE;
    }
    
    public void push(int val) {
        if (val <= min){
            min = val;
            minValueStack.push(val);
        }
        stack.push(val);
    }
    
    public void pop() {
        int tmp = stack.pop();
        if (tmp == minValueStack.peek()){
            minValueStack.pop();
            if (!minValueStack.isEmpty()){
                min = minValueStack.peek();
            }
            else{
                min = Integer.MAX_VALUE;
            }
        }
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min;
    }
}
