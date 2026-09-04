class Solution {
    public int numIslands(char[][] grid) {

        int m = grid.length, n = grid[0].length,cnt=0;
        int[][] vis = new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j] == '1' && vis[i][j] == 0){
                    cnt++;
                    dfs(grid,vis,i,j,m,n);
                }
            }
        }

        return cnt;
    }

    public void dfs(char[][] grid, int[][] vis, int i, int j, int m, int n){
        vis[i][j] = 1;

        int[] di = {0,1,0,-1}, dj = {1,0,-1,0};

        for(int a=0;a<4;a++){
                int ni = i+di[a];
                int nj = j+dj[a];

                if(ni>=0 && ni<m && nj>=0 && nj<n && grid[ni][nj] == '1' && vis[ni][nj]==0)
                    dfs(grid,vis,ni,nj,m,n);
            }
    }
}