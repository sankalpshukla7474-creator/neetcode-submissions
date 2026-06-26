class Solution {
    public void rotate(int[] nums, int k) {
        if(k==nums.length) return ;
        int[] arr = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            arr[(i+k)%nums.length] = nums[i] ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = arr[i] ;
        }
    }
}