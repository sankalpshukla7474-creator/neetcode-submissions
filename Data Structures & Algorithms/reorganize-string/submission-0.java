class Solution {
    public String reorganizeString(String u) {
        Map<Character , Integer> hm = new HashMap<>() ;
        for(char d : u.toCharArray()){
            int c = hm.getOrDefault(d,0)+1 ;
            if(c > (u.length()+1)/2){
                return "" ;
            }
            hm.put(d,c) ;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) ->b[0] - a[0]);
        for(char c : hm.keySet()){
            pq.add(new int[] {hm.get(c) , c} ) ;
        }
        StringBuilder sb = new StringBuilder() ;
        while(pq.size() >= 2){
            int[] f = pq.poll() ;
            int[] s = pq.poll() ;
            sb.append((char)f[1]);
            sb.append((char)s[1]) ;
            f[0]-- ; s[0]--;
            if(f[0] > 0 ){
                pq.add(f) ;
            }
            if(s[0] > 0){
                pq.add(s) ;
            }
        }
        if(!pq.isEmpty()){
            int[] f = pq.poll() ;
            sb.append((char)f[1]);
        }
        return sb.toString() ;
    }
}