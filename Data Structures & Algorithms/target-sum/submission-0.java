class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int range = 0 ;
        for(int x : nums){
            range += x ;
        }
        int tar = (range + target) / 2 ;
        return pass(nums,tar,0) ;
    }
    public int pass(int[] nums , int tar , int i){
        if(i == nums.length){
            if(tar == 0) return 1 ;
            else return 0 ;
        }
        int a = pass(nums,tar-nums[i],i+1) ;
        int b = pass(nums,tar,i+1) ;
        return (a+b) ;
    }
}
