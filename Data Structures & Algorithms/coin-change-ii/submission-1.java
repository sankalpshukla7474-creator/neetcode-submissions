class Solution {
    public int change(int amount, int[] c) {
        int n = c.length ;
        int[][] dp = new int[n+1][amount+1] ;
        for(int i = 0 ; i <= n ; i++){
            Arrays.fill(dp[i],-1) ;
        }
        if(n == 0) return 0 ;
        return track(amount,c,n-1,dp) ;
    }
    public int track(int tar , int[] c , int i , int[][] dp){
        if(tar < 0) return 0 ;
        if(i < 0){
            if(tar == 0) return 1 ;
            return 0 ;
        }
        if(dp[i][tar] != -1) return dp[i][tar] ;
        int a = track(tar-c[i],c,i,dp) ;
        int b = track(tar,c,i-1,dp) ;
        return dp[i][tar] = (a+b) ; 
    }
}
