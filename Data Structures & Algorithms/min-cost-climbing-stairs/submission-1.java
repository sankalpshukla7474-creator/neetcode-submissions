class Solution {
    int[] dp = new int[1001] ;
    public int minCostClimbingStairs(int[] c) {
        Arrays.fill(dp,-1) ;
        return Math.min(pass(c,0),pass(c,1)) ;
    }
    public int pass(int[] c , int i){
        if(i >= c.length ) return 0 ;
        if(dp[i] != -1) return dp[i] ;
        int one = pass(c,i+1) ;
        int two = pass(c,i+2) ;
        return dp[i] = c[i] + Math.min(one,two) ;
    }
}
 