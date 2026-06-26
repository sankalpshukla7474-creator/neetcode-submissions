class MedianFinder {
    private PriorityQueue<Integer> maxh ;
    private PriorityQueue<Integer> minh ;
    public MedianFinder() {
        maxh = new PriorityQueue<>(Collections.reverseOrder());
        minh = new PriorityQueue<>() ;
    }
    
    public void addNum(int num) {
        if(maxh.isEmpty() || num < maxh.peek()){
            maxh.add(num);
        }
        else{
            minh.add(num) ;
        }

        if(Math.abs(maxh.size() - minh.size()) > 1){
            minh.add(maxh.poll()) ;
        }
        else if(maxh.size() < minh.size()){
            maxh.add(minh.poll()) ;
        }
    }
    
    public double findMedian() {
        if(maxh.size() == minh.size()){
            return (double)(maxh.peek() + minh.peek()) / 2 ;
        }
        else{
            return maxh.peek() ;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */