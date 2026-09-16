class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col -1;
        while (left <= right){
            // int middle = left + (right - left) / 2;
            int middle = (right + left) / 2;
            row = middle / matrix[0].length; // 6 / 4 = 1 row
            col = middle % matrix[0].length; //6 % 4 = 2 col
            if (matrix[row][col] == target){
                return true;
            } else if (target > matrix[row][col]){
                left = middle + 1;
            } else {//target < matrix[row][col]
                right = middle - 1;
            }

        }

        return false;
    }
}
