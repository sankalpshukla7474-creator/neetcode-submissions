class MedianFinder {
    PriorityQueue<Integer> pq ;
    PriorityQueue<Integer> dq ;
    public MedianFinder() {
        pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        dq = new PriorityQueue<>() ;
    }
    
    public void addNum(int num) {
        if(pq.isEmpty() || num < pq.peek()){
            pq.offer(num) ;
        }
        else{
            dq.offer(num) ;
        }
        if(Math.abs(pq.size()-dq.size()) > 1){
            if(pq.size() > dq.size()){
                dq.offer(pq.poll()) ;
            }
            else{
                pq.offer(dq.poll()) ;
            }
        }
    }
    
    public double findMedian() {
        if(pq.size() > dq.size()){
            return (double)pq.peek() ;
        }
        else if(dq.size() > pq.size()){
            return (double)dq.peek() ;
        }
        else{
            double ans = pq.peek() + dq.peek() ;
            return ans / 2 ;
        }
    }
}
