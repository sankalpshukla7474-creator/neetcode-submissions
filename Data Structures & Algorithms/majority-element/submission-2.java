class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0] ;
        }
        Arrays.sort(nums);
        int n = nums.length ;
        int num = nums[0] ;
        int fre = 1 ;
        for(int i = 1 ; i < n ; i++){
            if(nums[i] == num){
                fre++ ;
                if(fre > n/2){
                    return num ;
                }
            }
            else{
                num = nums[i];
                fre = 1 ;
            }
        }
        return 0 ;
    }
}