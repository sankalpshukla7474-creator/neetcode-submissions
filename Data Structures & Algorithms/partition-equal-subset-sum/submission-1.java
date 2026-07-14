class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0 ;
        for(int x : nums){
            sum += x ;
        }
        if(sum % 2 != 0) return false ;
        int tar = sum / 2 ;
        int[][] dp = new int[nums.length+1][tar+1] ;
        // for(int i = 0 ; i < dp.length ; i++){
        //     Arrays.fill(dp[i],-1) ;
        // }
        return pass(0,nums,dp,tar) ;
    }
    public boolean pass(int i , int[] nums ,int[][] dp , int tar){
        if(i == nums.length){
            if(tar == 0) return true ;
            return false ;
        }
        if(tar < 0) return false ;
        //if(dp[i][tar] != -1) return dp[i][tar] ;
        boolean take = pass(i+1,nums,dp,tar-nums[i]) ;
        boolean not = pass(i+1,nums,dp,tar) ;
        return (take || not) ;
    }
}
