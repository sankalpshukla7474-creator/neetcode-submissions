class Solution {
    List<List<Integer>> ls = new ArrayList<>() ;
    public List<List<Integer>> permute(int[] nums) {
        if(nums.length == 0) return ls ;
        List<Integer> pb = new ArrayList<>() ;
        boolean[] visit = new boolean[nums.length] ;
        pass(nums,visit,pb) ;
        return ls ;
    }
    public void pass(int[] nums , boolean[] visit , List<Integer> pb){
        if(pb.size() == nums.length){
            ls.add(new ArrayList<>(pb)) ;
            return ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(visit[i]) continue ;
            visit[i] = true ;
            pb.add(nums[i]) ;
            pass(nums,visit,pb) ;
            visit[i] = false ;
            pb.remove(pb.size()-1) ;
        }
    }
}
