class Solution {
    public int lastStoneWeight(int[] s) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        for(int i : s){
            pq.add(i) ;
        }
        while(pq.size() > 1){
            int x = pq.poll() ;
            int y = pq.poll() ;
            if(x == y){
                continue ;
            }
            else{
                int c = Math.abs(x-y);
                pq.add(c) ;
            }
        }
        return pq.isEmpty()? 0 : pq.poll() ;
    }
}