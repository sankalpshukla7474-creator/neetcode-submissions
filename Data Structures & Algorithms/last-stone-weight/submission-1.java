class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        for(int x : stones){
            pq.offer(x) ;
        }
        while(pq.size() > 1){
            int a = pq.poll() ;
            int b = pq.poll() ;
            int diff = Math.abs(a-b) ;
            if(diff == 0) continue ;
            else{
                pq.offer(diff) ;
            }
        }
        return pq.isEmpty() ? 0 : pq.peek() ;
    }
}