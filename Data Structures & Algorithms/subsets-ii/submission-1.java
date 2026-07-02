class Solution {
    List<List<Integer>> ls = new ArrayList<>() ;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        if(nums.length == 0) return ls ;
        Arrays.sort(nums) ;
        List<Integer> pb = new ArrayList<>() ;
        pass(nums,0,pb) ;
        return ls ;
    }
    public void pass(int[] nums , int i , List<Integer> pb){
        ls.add(new ArrayList<>(pb)) ;
            for(int j = i ; j < nums.length ; j++){
            if(j > i && nums[j] == nums[j-1]) continue ;
            pb.add(nums[j]) ;
            pass(nums,j+1,pb) ;
            pb.remove(pb.size()-1) ;
        }
    }
}
