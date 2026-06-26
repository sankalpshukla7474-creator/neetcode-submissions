class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        for(int c : nums){
            pq.add(c) ;
        }
        while(k != 1){
            pq.poll() ;
            k-- ;
        }
        return pq.poll() ;
    }
}
