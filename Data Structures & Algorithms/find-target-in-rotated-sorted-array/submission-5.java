class Solution {
    public int search(int[] nums, int tar) {
        int l = 0 , r = nums.length - 1 ;
        while(l <= r){
            int mid = l + (r-l) / 2 ;
            if(nums[mid] == tar) return mid ;
            if(nums[mid] <= nums[r]){
               if(tar > nums[mid] && tar <= nums[r]){
                 l = mid + 1 ;
               }
               else{
                r = mid - 1 ;
                }
            }
            else{
                if(tar < nums[mid] && tar >= nums[l]){
                    r = mid - 1 ;
                }
                else{
                    l = mid + 1 ;
                }
            }
        }
        return -1 ;
    }
}
