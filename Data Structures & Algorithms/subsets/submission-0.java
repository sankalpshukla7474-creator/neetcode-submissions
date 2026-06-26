class Solution {
    List<List<Integer>> ls = new ArrayList<>() ;
    public List<List<Integer>> subsets(int[] nums) {
       List<Integer> pb = new ArrayList<>() ;
       ls.add(pb) ;
       check(pb,nums,0) ; 
       return ls ;
    }
    public void check(List<Integer> pb , int[] nums , int i){
        if(i == nums.length) return ;
        pb.add(nums[i]) ;
        ls.add(new ArrayList<>(pb)) ;
        check(pb,nums,i+1) ;
        pb.remove(pb.size() - 1) ;
        check(pb,nums,i+1) ;
        return ;
    }
}
