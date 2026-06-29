class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1] ;
        for(int i = 0 ; i <= m ; i++){
            Arrays.fill(dp[i],-1) ;
        }
        return find(dp,m-1,n-1) ;
    }
    public int find(int[][] dp , int i , int j){
        if(i < 0 || j < 0) return 0 ;
        if(i == 0 && j == 0) return 1 ;
        if(dp[i][j] != -1) return dp[i][j] ;
        int take = find(dp,i,j-1) ;
        int not = find(dp,i-1,j) ;
        return dp[i][j] = (take+not) ;
    }

}
