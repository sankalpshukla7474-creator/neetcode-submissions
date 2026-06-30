class Solution {
    public int search(int[] nums, int target) {
        int low = 0 , high = nums.length - 1 ;
        while(low <= high){
            int idx = low + (high - low) / 2 ;
            if(nums[idx] == target){
                return idx ;
            }
            else if(nums[idx] > target){
                high = idx - 1 ;
            }
            else{
                low = idx + 1 ;
            }
        }
        return -1 ;
    }
}
