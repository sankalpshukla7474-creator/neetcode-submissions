class Solution {
    List<List<Integer>> ls ;
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        ls = new ArrayList<>() ;
        List<Integer> ps = new ArrayList<>() ;
        check(nums,ps,0);
        return ls ;
    }
    public void check(int[] nums , List<Integer> ps , int i ){
        ls.add(new ArrayList<>(ps));
        for(int j = i ; j < nums.length ; j++){
            if (j > i && nums[j] == nums[j - 1]) continue;

            ps.add(nums[j]);
            check(nums, ps, j+1);
            ps.remove(ps.size() - 1);
        }
    }
}
