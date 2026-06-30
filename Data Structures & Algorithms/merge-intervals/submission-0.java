class Solution {
    public int[][] merge(int[][] inter) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.A-b.A) ;
        for(int i = 0 ; i < inter.length ; i++){
            int u = inter[i][0] ;
            int v = inter[i][1] ;
            pq.offer(new Pair(u,v)) ;
        }
        List<Pair> ls = new ArrayList<>() ;
        while(pq.size() > 1){
            Pair one = pq.poll() ;
            Pair second = pq.peek() ;
            if(second.A <= one.B){
                int u = Math.min(one.A,second.A) ;
                int v = Math.max(one.B,second.B) ;
                pq.poll() ;
                pq.offer(new Pair(u,v)) ;
            }
            else{
                ls.add(one) ;
            }
        }
        if(pq.size() == 1){
            ls.add(pq.poll()) ;
        }
        int[][] arr = new int[ls.size()][2] ;
        for(int i = 0 ; i < ls.size() ; i++){
            Pair e = ls.get(i) ;
            arr[i][0] = e.A ;
            arr[i][1] = e.B ;
        }
        return arr ;
    }
    class Pair{
        int A ;
        int B ;
        Pair(int A , int B){
            this.A = A ;
            this.B = B ;
        }
    }
}
