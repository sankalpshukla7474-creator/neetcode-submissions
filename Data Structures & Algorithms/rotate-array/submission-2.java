class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0) return  ;
        k = k % nums.length;
        int arr[] = new int[nums.length * 2 ];
        for(int i = 0 ; i < nums.length ; i++){
            arr[i] = nums[i];
            arr[nums.length + i] = nums[i];
        }
        for(int i = 0 ; i < nums.length ; i++){
            nums[i] = arr[nums.length - k + i];
        }
    }
}