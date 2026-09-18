class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col - 1;
        while(left <= right){
            int middle = (right + left) / 2;
            row = middle / matrix[0].length;
            col = middle % matrix[0].length;
            if(target == matrix[row][col]){
                return true;
            } else if(target > matrix[row][col]){
                left = ++middle;
            } else{
                right = --middle;
            }
        }
        return false;
    }
}
