class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() == 0 && t.length()==0){
            return true ;
        }
        Map<Character,Integer> hm = new HashMap<>();
        if(s.length() == 0 || t.length()==0){
            return false ;
        }
        for(char ch : s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(char ch : t.toCharArray()){
            if(!hm.containsKey(ch)){
                return false ;
            }
            else{
                hm.put(ch,hm.get(ch)-1);
                if(hm.get(ch) == 0){
                    hm.remove(ch) ;
                }
            }
        }
        return hm.size() == 0 ? true : false ;
    }
}
