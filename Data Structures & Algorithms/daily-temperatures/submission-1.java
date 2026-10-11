class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        //store increasing temps
        Stack<int[]> stack = new Stack<>();
        stack.push(new int[]{0,temperatures[0]});
        //top[30,25,20]
        for(int i = 1; i < temperatures.length; i++){
            int[] tmp = stack.peek();
            int temp = tmp[1];
            while(!stack.isEmpty() && temperatures[i] > temp){
                stack.pop();
                int idx = tmp[0];
                res[idx] = i - idx;
                if(!stack.isEmpty()){
                    tmp = stack.peek();
                    temp = tmp[1];
                }
            }

            stack.push(new int[]{i,temperatures[i]});
        }

        while(!stack.isEmpty()){
            int[] tmp = stack.pop();
            int idx = tmp[0];
            res[idx] = 0;
        }
        return res;
    }
}
