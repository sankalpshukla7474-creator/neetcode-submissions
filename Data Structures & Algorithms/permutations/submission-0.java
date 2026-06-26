class Solution {
    List<List<Integer>> ls ;
    public List<List<Integer>> permute(int[] nums) {
        ls = new ArrayList<>() ;
        List<Integer> ps = new ArrayList<>() ;
        check(nums,ps) ;
        return ls ;
    }
    public void check(int[] nums , List<Integer> ps) {
        if(ps.size() == nums.length){
            ls.add(new ArrayList<>(ps)) ;
            return ;
        }
        for(int i = 0 ; i < nums.length ; i++){
            if(!ps.contains(nums[i])){
                ps.add(nums[i]) ;
                check(nums,ps) ;
                ps.remove(ps.size() - 1) ;
            }
        }

    }
}
