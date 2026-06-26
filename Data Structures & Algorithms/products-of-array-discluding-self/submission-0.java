class Solution {
    public int[] productExceptSelf(int[] nums) {
        int c = 1 ;
        int z = 0 ;
        for(int x : nums){
            if(x == 0 ){
                z++;
                continue ;
            }
            c *= x ;
        }
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < arr.length ; i++){
            if (z > 1) {
                arr[i] = 0;
            } else if (z == 1) {
                arr[i] = (nums[i] == 0) ? c : 0;
            } else {
                arr[i] = c / nums[i];
            }
            
        }
        return arr ;
    }
}  
