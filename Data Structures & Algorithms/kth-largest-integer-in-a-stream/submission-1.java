class KthLargest {
    PriorityQueue<Integer> pq ;
    int y = 0 ;
    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<>() ;
        for(int x : nums){
            pq.offer(x) ;
            if(pq.size() > k){
                pq.poll() ;
            }
        }
        y = k ;
    }
    
    public int add(int val) {
        pq.offer(val) ;
        if(pq.size() > y){
            pq.poll() ;
        }
        return pq.peek() ;
    }
}
