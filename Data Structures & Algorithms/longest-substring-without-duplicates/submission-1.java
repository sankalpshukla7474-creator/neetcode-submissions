class Solution {
    public int lengthOfLongestSubstring(String s) {
       Map<Character,Integer> hm = new HashMap<>();
       int max = 0 ;
       char[] ch = s.toCharArray() ;
       for(int i = 0 ; i <ch.length ; i++){
            hm.clear() ;
            for(int j = i ; j < ch.length ; j++){
                if(!hm.containsKey(ch[j])){
                    max = Math.max(max,j-i+1) ;
                    hm.put(ch[j],1);
                }
                else{
                    break ;
                }
            }
       } 
       return max ;
    }
}
