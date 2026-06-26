class Solution {
    public int leastInterval(char[] tasks, int p) {
        int[] fre = new int[26] ;
        for(char ch : tasks){
            fre[ch - 'A']++;
        }
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for(int i = 0 ; i < 26 ; i++){
            if(fre[i] > 0){
                pq.offer(fre[i]);
            }
        }
        int time = 0 ;
        while(!pq.isEmpty()){
            int cycle = p + 1 ;
            List<Integer> store = new ArrayList<>();
            int tc = 0 ;
            while(cycle-- > 0 && !pq.isEmpty()){
                int cf = pq.poll() ;
                if(cf > 1){
                    store.add(cf-1);
                }
                tc++ ;
            }
            store.forEach(pq::offer);
            time += (pq.isEmpty() ? tc : p+1) ;
        }
        return time ;
    }
}
