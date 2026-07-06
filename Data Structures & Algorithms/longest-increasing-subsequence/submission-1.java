class Solution {
    int[] dp = new int[nums.length] ;
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0) return 0 ;
        Arrays.fill(dp,-1) ;
        return pass(nums,0,Integer.MIN_VALUE) ;
    }
    public int pass(int[] nums , int i , int prev){
        if(i == nums.length) return 0 ;
        if(dp[i] != -1) return dp[i] ;
        int take = 0 ;
        int not = pass(nums,i+1,nums[i]) ;
        if(nums[i] > prev){
            take = 1 + pass(nums,i+1,nums[i]) ;
        }
        return dp[i] = Math.max(take,not) ;
    }
}
