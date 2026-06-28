class Solution {
    List<List<Integer>> ls = new ArrayList<>() ;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        if(nums.length == 0) return ls ;
        List<Integer> pb = new ArrayList<>() ;
        pass(nums,pb,target,0) ;
        return ls ;
    }
    public void pass(int[] nums , List<Integer> pb , int tar , int i){
        if(tar < 0) return ;
        if(i == nums.length){
            if(tar == 0){
                ls.add(new ArrayList<>(pb)) ;
            }
            return ;
        }
        pb.add(nums[i]) ;
        pass(nums,pb,tar-nums[i],i) ;
        pb.remove(pb.size()-1) ;
        pass(nums,pb,tar,i+1) ;
    }
}
