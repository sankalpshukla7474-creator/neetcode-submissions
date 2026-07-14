class Solution {
    int[] dp = new int[101] ;
    public int minCostClimbingStairs(int[] cost) {
        Arrays.fill(dp,-1) ;
        return Math.min(pass(0,cost),pass(1,cost)) ;
    }
    public int pass(int i , int[] cost){
        if(i >= cost.length) return 0 ;
        if(dp[i] != -1) return dp[i] ;
        int one = pass(i+1,cost) ;
        int two = pass(i+2,cost) ;
        return dp[i] = cost[i] + Math.min(one,two) ;
    }
}
