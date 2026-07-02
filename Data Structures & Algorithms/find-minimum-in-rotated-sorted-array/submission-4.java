class Solution {
    public int findMin(int[] nums) {
        if(nums.length == 1 ) return nums[0] ;
        int l = 0 , r = nums.length - 1 , ans = -1 ;
        while(l < r){
            int mid = l + (r - l) / 2 ;
            if(nums[mid] < nums[r]){
                ans = nums[mid] ;
                r = mid ;
            }
            else{
                l = mid + 1 ;
            }
        }
        return ans ;
    }
}
