class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0 , max = 0 ;
        Map<Character,Integer> hm = new HashMap<>() ;
        for(int j = 0 ; j < s.length() ; j++){
            char ch = s.charAt(j) ;
            if(hm.containsKey(ch)){
                while(s.charAt(i) != ch){
                    char ph = s.charAt(i) ;
                    hm.put(ph,hm.get(ph)-1) ;
                    if(hm.get(ph) == 0){
                        hm.remove(ph) ;
                    }
                    i++ ;
                }
                i++ ;
            }
            max = Math.max(max,j-i+1) ;
            hm.put(ch,1) ;
        }
        return max ;
    }
}
