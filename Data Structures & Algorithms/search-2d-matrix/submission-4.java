class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col - 1;
        while (left <= right){
            int middle = (left + right) / 2;
            row = middle / matrix[0].length;//1,2,1
            col = middle % matrix[0].length;//1,1,0
            if (matrix[row][col] == target){
                return true;
            } else if (matrix[row][col] < target){
                left = ++middle;
            } else{
                right = --middle;
            }
        }
        return false;
    }
}
