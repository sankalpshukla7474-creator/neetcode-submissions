class Solution {
    int[][] dp = new int[1001][1001] ;
    public int jump(int[] nums) {
        for(int i = 0 ; i < dp.length ; i++){
            Arrays.fill(dp[i],-1) ;
        }
        return pass(nums,0,0) ;

    }
    public int pass(int[] nums , int idx , int step){
        if(idx >= nums.length-1){
            return 0 ;
        }
        if(dp[idx][step] != -1) return dp[idx][step] ;
        int min = Integer.MAX_VALUE ;
        for(int i = 1 ; i <= nums[idx] ; i++){
            int a = 1 + pass(nums,idx+i,step+1) ;
            min = Math.min(min,a) ;
        }
        return dp[idx][step] =min ;
    }
}
