class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ls = new ArrayList<>() ;
        Map<Map<Character,Integer>,List<String>> hm = new HashMap<>() ;
        for(String s : strs){
            Map<Character,Integer> pm = new HashMap<>() ;
            for(char ch : s.toCharArray()){
                pm.put(ch,pm.getOrDefault(ch,0)+1) ;
            }
            if(hm.containsKey(pm)){
                List<String> u = hm.get(pm) ;
                u.add(s) ;
                hm.put(pm,u) ;
            }
            else{
                List<String> u = new ArrayList<>() ;
                u.add(s) ;
                hm.put(pm,u) ;
            }
        }
        for(Map<Character,Integer> dq : hm.keySet()){
            ls.add(new ArrayList<>(hm.get(dq))) ;
        }
        return ls ;
    }
}
