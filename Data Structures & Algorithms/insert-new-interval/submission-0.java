class Solution {
    public int[][] insert(int[][] inter, int[] newInterval) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.A - b.A) ;
        for(int i = 0 ; i < inter.length ; i++){
            int a = inter[i][0] ;
            int b = inter[i][1] ;
            Pair q = new Pair(a,b) ;
            pq.offer(q) ;
        }
        Pair q = new Pair(newInterval[0],newInterval[1]) ;
        pq.offer(q) ;
        List<Pair> ls = new ArrayList<>() ;
        while(pq.size() > 1){
            Pair one = pq.poll() ;
            Pair second = pq.peek() ;
            if(second.A <= one.B){
                int r = Math.min(one.A,second.A) ;
                int t = Math.max(second.B,one.B) ;
                pq.poll() ;
                Pair o = new Pair(r,t) ;
                pq.offer(o) ;
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
            Pair t = ls.get(i) ;
            int u = t.A ; int v = t.B ;
            arr[i][0] = u ; arr[i][1] = v ;
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
