class Solution {
    public int longestConsecutive(int[] nums) {
        int max = Integer.MIN_VALUE ;
        Set<Integer> st = new HashSet<>() ;
        for(int x : nums){
            st.add(x) ;
        }
        for(int x : nums){
            int count = 0 ;
            int y = x ;
            while(st.contains(y)){
                count++ ;
                y++ ;
                max = Math.max(max,count) ;
            }
        }
        return max == Integer.MIN_VALUE ? 0 : max ;
    }
}
