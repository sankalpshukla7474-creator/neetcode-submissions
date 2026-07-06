class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0) return 0 ;
        return pass(nums,0,Integer.MIN_VALUE) ;
    }
    public int pass(int[] nums , int i , int prev){
        if(i == nums.length) return 0 ;
        int take = 0 ;
        int not = pass(nums,i+1,nums[i]) ;
        if(nums[i] > prev){
            take = 1 + pass(nums,i+1,nums[i]) ;
        }
        return Math.max(take,not) ;
    }
}
