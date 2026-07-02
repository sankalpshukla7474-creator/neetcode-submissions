class Solution {
    public String minWindow(String s, String t) {
        Map<Character,Integer> hm = new HashMap<>() ;
        for(char ch : t.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1) ;
        }
        Map<Character,Integer> pm = new HashMap<>() ;
        String o = "" ;
        int min = Integer.MAX_VALUE , count = 0 , n = t.length() , l = 0;
        for(int r = 0 ; r < s.length() ; r++){
            char ph = s.charAt(r) ;
            pm.put(ph,pm.getOrDefault(ph,0)+1) ;
            if(hm.containsKey(ph) && pm.get(ph) <= hm.get(ph)){
                count++ ;
            }
            while(count == n){
                if(r-l+1 < min){
                    min = Math.min(r-l+1,min) ;
                    o = s.substring(l,r+1) ;
                }
                char y = s.charAt(l) ;
                pm.put(y,pm.get(y)-1) ;
                if(hm.containsKey(y) && pm.get(y) < hm.get(y)){
                    count-- ;
                }
                if(pm.get(y) == 0){
                    pm.remove(y) ;
                }
                l++ ;
            }
        }
        return o ;
    }
}
