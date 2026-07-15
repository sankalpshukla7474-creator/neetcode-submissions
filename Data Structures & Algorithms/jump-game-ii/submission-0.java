class Solution {
    int min = Integer.MAX_VALUE ;
    public int jump(int[] nums) {
        pass(nums,0,0) ;
        return min ;
    }
    public void pass(int[] nums , int idx , int step){
        if(idx >= nums.length-1){
            min = Math.min(min,step) ;
            return ;
        }
        for(int i = 1 ; i <= nums[idx] ; i++){
            pass(nums,idx+i,step+1) ;
        }
    }
}
