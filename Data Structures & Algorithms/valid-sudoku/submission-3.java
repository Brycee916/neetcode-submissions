class Solution {
    public boolean isValidSudoku(char[][] board) {
        int row = 9;
        int col = 9;
        Set<Character> set = new HashSet<>();
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                Character value = board[r][c];
                if(!set.contains(value) && value != '.'){
                    set.add(value);
                } else if(set.contains(value) && value != '.'){
                    return false;
                }
            }
            set.clear();
        }
        for(int r = 0; r < row; r++){
            for(int c = 0; c < col; c++){
                Character value = board[c][r];
                if(!set.contains(value) && value != '.'){
                    set.add(value);
                } else if(set.contains(value) && value != '.'){
                    return false;
                }
            }
            set.clear();
        }
        for(int i = 0; i < 9; i++){
            for(int r = 0; r < 3; r++){
                row = (i / 3) * 3 + r;
                for(int c = 0; c < 3; c++){
                    col = (i % 3) * 3 + c;
                    Character value = board[row][col];
                    if(!set.contains(value) && value != '.'){
                        set.add(value);
                    } else if(set.contains(value) && value != '.'){
                        return false;
                    }
                }
            }
            set.clear();
        }
    

        return true;
    }
}
