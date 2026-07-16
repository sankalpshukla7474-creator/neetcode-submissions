class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character,Integer> hm = new HashMap<>() ;
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i) ;
            hm.put(ch,i) ;
        }
        List<Integer> ls = new ArrayList<>() ;
        int idx = 0 ;
        while(idx < s.length()){
            int strt = idx , tar = hm.get(s.charAt(idx)) , curr = idx ;
            while(curr != tar){
                tar = Math.max(tar,hm.get(s.charAt(curr))) ;
                curr++ ;
            }
            int pos = curr - strt + 1 ;
            ls.add(pos) ;
            idx = curr + 1 ;
        }
        return ls ;
    }
}
