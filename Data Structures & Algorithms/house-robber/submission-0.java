class Solution {
    int max = 0 ;
    public int rob(int[] nums) {
        int n = nums.length ;
        if(n == 0) return max ;
        return broke(nums,n-1) ;
    }
    public int broke(int[] nums , int i ){
        if(i < 0) return 0 ;
        int a = nums[i] + broke(nums,i-2) ;
        int b = broke(nums,i-1) ;
        return Math.max(a,b) ;
    }
}
