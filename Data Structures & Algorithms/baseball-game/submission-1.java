
class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> scoresTracker = new Stack<>();
        scoresTracker.push(Integer.valueOf(operations[0]));
        for (int i = 1; i < operations.length; i++){
            if (operations[i].equals("D")){
                int peekScoresTracker = Integer.valueOf(scoresTracker.peek());
                scoresTracker.push(2 * peekScoresTracker);
            }
            else if (operations[i].equals("C")){
                scoresTracker.pop();
            }
            else if (operations[i].equals("+")){
                //pop 2, add them, reinsert them back in order with added
                int firstPopScore = Integer.valueOf(scoresTracker.pop());
                int secondPopScore = Integer.valueOf(scoresTracker.pop());
                int sumScore = firstPopScore + secondPopScore;
                scoresTracker.push(secondPopScore);
                scoresTracker.push(firstPopScore);
                scoresTracker.push(sumScore);
            }
            else {//a number
                // System.out.println(operations[i]);
                int currScore = Integer.valueOf(operations[i]);
                scoresTracker.push(currScore);
            }
            System.out.println(scoresTracker);
        }
        //find total sum of stack integers
        int sumStack = 0;
        while (!scoresTracker.isEmpty()){
            sumStack += scoresTracker.pop();
        }
        return sumStack;
    }
}