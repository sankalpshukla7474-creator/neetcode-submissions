class Solution {
    public int maxAreaOfIsland(int[][] g) {
        int max = 0 ;
        boolean[][] visit = new boolean[g.length][g[0].length] ;
        for(int i = 0 ; i < g.length ; i++){
            for(int j = 0 ; j < g[0].length ; j++){
                if(g[i][j] == 1){
                    int check = dfs(g,i,j) ;
                    max = Math.max(max,check) ;
                }
            }
        }
        return max ;
    }
    public int dfs(int[][] g , int i , int j){
        if(i < 0 || j < 0 || i >= g.length || j >= g[0].length || g[i][j] == 0){
            return 0 ;
        }
        g[i][j] = 0 ;
        int a = dfs(g,i+1,j) ;
        int b = dfs(g,i,j+1) ;
        int c = dfs(g,i-1,j) ;
        int d = dfs(g,i,j-1) ;
        return 1 + (a+b+c+d) ;
    }
}
