class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> hm = new HashMap<>() ;
        for(char ch : tasks){
            hm.put(ch,hm.getOrDefault(ch,0)+1) ;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->b.B - a.B) ;
        for(char ch : hm.keySet()){
            Pair p = new Pair(ch,hm.get(ch)) ;
            pq.offer(p) ;
        }
        Pair p = pq.poll() ;
        int max = p.B , count = 1 ;
        while(!pq.isEmpty()){
            Pair q = pq.poll() ;
            if(q.B == max){
                count++ ;
            }
            else{
                break ;
            }
        }
        count-- ;
        int ans = ((max) * (n+1)) - n + count ;
        return ans ;
    }
    class Pair{
        char A ;
        int B ; 
        Pair(char A , int B){
            this.A = A ;
            this.B = B ;
        }
    }
}
