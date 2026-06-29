class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0 ;
        for(int x : nums){
            sum += x ;
        }
        if(sum % 2 != 0) return false ;
        int tar = sum / 2 ;
        boolean ans = find(nums,tar,nums.length-1) ;
        return ans ;
    }
    public boolean find(int[] nums , int tar , int i){
        if(i < 0){
            if(tar == 0) return true ;
            return false ;
        }
        boolean take = find(nums,tar-nums[i],i-1) ;
        boolean not = find(nums,tar,i-1) ;
        return (take || not) ;
    }
}
