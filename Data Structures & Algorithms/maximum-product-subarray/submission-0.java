class Solution {
    public int maxProduct(int[] nums) {
        int curr = nums[0] ;
        int total = nums[0] ;
        for(int i = 1 ; i < nums.length ; i++){
            curr = Math.max(nums[i],curr*nums[i]) ;
            total = Math.max(curr,total) ;
        }
        return total ;
    }
}
