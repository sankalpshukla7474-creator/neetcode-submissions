class Solution {
    List<List<Integer>> ls = new ArrayList<>() ;
    public List<List<Integer>> subsets(int[] nums) {
        if(nums.length == 0) return ls ;
        List<Integer> pb = new ArrayList<>() ;
        find(nums,pb,0) ;
        return ls ;
    }
    public void find(int[] nums , List<Integer> pb , int i){
        if(i == nums.length){
            ls.add(new ArrayList<>(pb)) ;
            return ;
        }
        pb.add(nums[i]) ;
        find(nums,pb,i+1) ;
        pb.remove(pb.size()-1) ;
        find(nums,pb,i+1) ;
    }
}
