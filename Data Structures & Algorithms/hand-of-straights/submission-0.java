class Solution {
    public boolean isNStraightHand(int[] hand, int gS) {
        if(hand.length % gS != 0) return false ;
        TreeMap<Integer,Integer> hm = new TreeMap<>() ;
        for(int x : hand){
            hm.put(x,hm.getOrDefault(x,0)+1) ;
        }
        while(!hm.isEmpty()){
            int curr = hm.firstKey() ;
            for(int i = 1 ; i <= gS ; i++){
                if(hm.isEmpty() || !hm.containsKey(curr)) return false ;
                hm.put(curr,hm.get(curr)-1) ;
                if(hm.get(curr) == 0){
                    hm.remove(curr) ;
                }
                curr++ ;
            }
        }
        return true ;
    }
}
