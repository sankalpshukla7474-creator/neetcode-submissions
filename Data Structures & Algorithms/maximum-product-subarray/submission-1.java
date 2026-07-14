class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0] ;
        int min = nums[0] ;
        int ans = nums[0] ;
        for(int i = 1 ; i < nums.length ; i++){
            int curr = nums[i] ;
            int pm = max ;
            int pmin = min ;
            max = Math.max(curr,Math.max(curr*pm,curr*pmin)) ;
            min = Math.min(curr,Math.min(curr*pm,curr*pmin)) ;
            ans = Math.max(ans,max) ;
        }
        return ans ;
    }
}
