class Solution {
    int[] dp = new int[101] ;
    public int rob(int[] nums) {
        int n = nums.length ;
        if(n == 0) return 0;
        Arrays.fill(dp,-1) ;
        return broke(nums,n-1) ;
    }
    public int broke(int[] nums , int i ){
        if(i < 0) return 0 ;
        if(dp[i] != -1) return dp[i] ;
        int a = nums[i] + broke(nums,i-2) ;
        int b = broke(nums,i-1) ;
        return dp[i] = Math.max(a,b) ; 
    }
}
