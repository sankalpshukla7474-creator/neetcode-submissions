class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums) ;
        int max = 0 ;
        if(nums.length == 1) return 1 ;
        int count = 0 ;
        Set<Integer> st = new HashSet<>() ;
        for(int i = 0 ; i < nums.length ; i++){
            if(st.isEmpty() || !st.contains(nums[i]-1)){
                count = 1 ;
            }
            else if(st.contains(nums[i])){
                continue ;
            }
            else{
                count++;
            }
            st.add(nums[i]);
            max = Math.max(max,count);
            
        }
        return max ;
    }
}
