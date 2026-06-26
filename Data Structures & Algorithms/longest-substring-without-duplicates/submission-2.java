class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0 , j = 0 ; 
        Set<Character> st = new HashSet<>() ;
        int max = 0 ;
        while( i < s.length() && j <s.length()){
            if(st.isEmpty() || !st.contains(s.charAt(j))){
                max = Math.max(max,j-i+1);
                st.add(s.charAt(j));
            }
            else{
                while(s.charAt(i) != s.charAt(j)){
                    st.remove(s.charAt(i));
                    i++;
                }
                i++;
            }
            j++;
        }
        return max ;
    }
}
