class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        if(grid[0][0] == 1) return -1;
        //dfs-shortest path
        Queue<int[]> q = new LinkedList<>();
        boolean[][] visited = new boolean[grid.length][grid.length];
        int[][] directions = new int[][]{{0,1}, {0,-1}, {1,0}, {-1,0},
                                         {-1,-1},{-1,1},{1,-1},{1,1}};
        q.offer(new int[]{0,0,1});
        visited[0][0] = true;
        while(!q.isEmpty()){
            int[] cell = q.poll();
            int r = cell[0];
            int c = cell[1];
            int path = cell[2];
            //base case where path is found
            if(r == grid.length-1 && c == grid.length-1) return path;
            for(int[] direction: directions){
                int nr = r + direction[0];
                int nc = c + direction[1];
                //if direction is valid, add to queue and visited
                if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length 
                    && !visited[nr][nc] && grid[nr][nc] == 0){

                    q.offer(new int[]{nr,nc,path+1});
                    visited[nr][nc] = true;
                }
            }
        }
        return -1;
    }
}