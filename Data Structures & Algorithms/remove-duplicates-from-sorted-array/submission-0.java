class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 1) return nums.length ;
        int k = 0 ;
        for(int i = 0 ; i < nums.length-1 ; i++){
            if(nums[i] != nums[i+1]){
                nums[k] = nums[i] ;
                k++ ;
            }
        }
        int n = nums.length ;
        nums[k] = nums[n-1] ;
        
        return ++k;
    }
}