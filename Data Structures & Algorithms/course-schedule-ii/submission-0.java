class Solution {
    public int[] findOrder(int num, int[][] pre) {
        int[] arr = new int[num] ;
        int[] indeg = new int[num] ;
        List<List<Integer>> adj = new ArrayList<>() ;
        for(int i = 0 ; i < num ; i++){
            adj.add(new ArrayList<>()) ;
        }
        for(int i = 0 ; i < pre.length ; i++){
            int u = pre[i][1] ;
            int v = pre[i][0] ;
            adj.get(u).add(v) ;
            indeg[v]++ ;
        }
        Queue<Integer> q = new ArrayDeque<>() ;
        int k = 0 ;
        for(int i = 0 ; i < num ; i++){
            if(indeg[i] == 0){
                q.offer(i) ;
            }
        }
        while(!q.isEmpty()){
            int node = q.poll() ;
            arr[k] = node ;
            k++ ;
            for(int neigh : adj.get(node)){
                indeg[neigh]-- ;
                if(indeg[neigh] == 0){
                    q.offer(neigh) ;
                }
            }
        }
        if(k != num){
            return new int[0] ;
        }
        return arr ;
    }
}
