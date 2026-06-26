class Solution {
    int sum = 0 ;
    public int subsetXORSum(int[] nums) {
        if(nums.length == 0) return 0 ;
        check(nums,0,0);
        return sum ;
    }
    public void check(int[] nums , int i , int res){
        if(i >= nums.length){
            sum += res ;
            return ;
        }
        
        check(nums,i+1,res^nums[i]);
        check(nums,i+1,res);
    }
}