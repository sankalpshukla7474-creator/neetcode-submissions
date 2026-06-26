class Solution {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character,Integer> hm = new HashMap<>() ;
        for(char ch : s1.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1) ;
        }
        Map<Character,Integer> pm = new HashMap<>() ;
        int i = 0 ;
        for(int j = 0 ; j < s2.length() ; j++){
            char ch = s2.charAt(j) ;
            pm.put(ch,pm.getOrDefault(ch,0)+1) ;
            if(j-i+1 == s1.length()){
                if(hm.equals(pm)){
                    return true ;
                }
                char ph = s2.charAt(i) ;
                pm.put(ph,pm.get(ph)-1) ;
                if(pm.get(ph) == 0){
                    pm.remove(ph) ;
                }
                i++ ;
            }
        }
        return false ;
    }
}
