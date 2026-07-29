class Solution {
    List<List<Integer>> adj = new ArrayList<>() ;
    public boolean canFinish(int num, int[][] pre) {
        if(pre.length == 0) return true ;
        for(int i = 0 ; i <= num ; i++){
            adj.add(new ArrayList<>()) ;
        }
        int[] indeg = new int[num+1] ;
        for(int i = 0 ; i < pre.length ; i++){
            int u = pre[i][1] ;
            int v = pre[i][0] ;
            adj.get(u).add(v) ;
            indeg[v]++ ;
        }
        Queue<Integer> q = new ArrayDeque<>() ;
        for(int i = 1 ; i <= num ; i++){
            if(indeg[i] == 0){
                q.offer(i) ;
            }
        }
        int count = 1 ;
        while(!q.isEmpty()){
            int node = q.poll() ;
            for(int neigh : adj.get(node)){
                indeg[neigh]-- ;
                if(indeg[neigh] == 0){
                    count++ ;
                    q.offer(neigh) ;
                }
            }
        }
        return count == num ;
    }
}
