class Solution {
    public int[] productExceptSelf(int[] nums) {
       if(nums.length == 1) return nums ;
       int[] pre = new int[nums.length];
       int[] suff = new int[nums.length] ;
       int p = 1 ;
       pre[0] = 1 ;
       for(int i = 1 ; i < nums.length ; i++){
            p *= nums[i-1];
            pre[i] = p ;
        } 
        p = 1 ;
        suff[nums.length - 1 ]  = 1 ;
        for(int j = nums.length -2 ; j >= 0 ; j--){
            p *= nums[j+1] ;
            suff[j] = p ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = (pre[i] * suff[i]);
        }
        return nums ;
    }
}  
