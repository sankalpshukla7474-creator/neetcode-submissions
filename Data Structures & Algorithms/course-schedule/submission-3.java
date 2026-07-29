class Solution {
    public boolean canFinish(int num, int[][] pre) {
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
        for(int i = 0 ; i < num ; i++){
            if(indeg[i] == 0){
                q.offer(i) ;
            }
        }
        int count = 0 ;
        while(!q.isEmpty()){
            int node = q.poll() ;
            count++ ;
            for(int neigh : adj.get(node)){
                indeg[neigh]-- ;
                if(indeg[neigh] == 0){
                    q.offer(neigh) ;
                }
            }
        }
        return count == num ;
    }
}
