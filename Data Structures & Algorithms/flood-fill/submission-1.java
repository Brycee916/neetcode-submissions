class Solution {
    int[][] image;
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        this.image = image;
        int currColor = image[sr][sc];
        if(currColor == color){
            return image;
        }
        dfs(sr, sc, color, currColor);
        return image;
    }

    public void dfs(int sr, int sc, int color, int currColor){
        if(sr < 0 || sr >= image.length || sc < 0 || 
            sc >= image[0].length || image[sr][sc] != currColor){
                return;
        }
        //change color
        image[sr][sc] = color;
        //dfs
        dfs(sr+1, sc, color, currColor);
        dfs(sr-1, sc, color, currColor);
        dfs(sr, sc+1, color, currColor);
        dfs(sr, sc-1, color, currColor);
    }

}