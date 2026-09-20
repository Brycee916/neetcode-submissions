class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        int size = row * col - 1;
        Set<Character> set = new HashSet<>();
        //check whole board rows
        for(int i = 0; i < size; i++){
            row = i / board[0].length;
            col = i % board[0].length;
            //if it's a new row
            if(col == 0){
                set.clear();
            }
            if(!set.contains(board[row][col]) && board[row][col] != '.'){
                set.add(board[row][col]);
            } else if(set.contains(board[row][col]) && board[row][col] != '.'){
                return false;
            }
        }
        set.clear();
        //check whole board cols
        for(int i = 0; i < size; i++){
            row = i % board[0].length;
            col = i / board[0].length;
            //if it's a new col
            if(row == 0){
                set.clear();
            }
            if(!set.contains(board[row][col]) && board[row][col] != '.'){
                set.add(board[row][col]);
            } else if(set.contains(board[row][col]) && board[row][col] != '.'){
                return false;
            }
        }
        set.clear();
        //check whole board 3x3 boxes
        //[0,0] [0,1] [0,2]
        //[1,0] [1,1] [1,2]
        //[2,0] [2,1] [2,2]
        for(int i = 0; i < 9; i++){ 
            for(int r = 0; r < 3; r++){
                row = (i / 3) * 3 + r;
                for(int c = 0; c < 3; c++){
                    col = (i % 3) * 3 + c;
                    if(!set.contains(board[row][col]) && board[row][col] != '.'){
                        set.add(board[row][col]);
                    } else if(set.contains(board[row][col]) && board[row][col] != '.'){
                        return false;
                    }
                }
            }
            set.clear();
        }




        return true;
    }
}
