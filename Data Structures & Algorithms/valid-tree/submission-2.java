class Solution {
    public boolean validTree(int n, int[][] ed) {
        if (ed.length != n - 1) {
            return false;
        }
        int[] par = new int[n] ;
        int[] rank = new int[n] ;
        for(int i = 0 ; i < n ; i++){
            par[i] = i ;
        }
        for(int i = 0 ; i < ed.length ; i++){
            int u = ed[i][0] ;
            int v = ed[i][1] ;
            int pu = parent(par,u) ;
            int pv = parent(par,v) ;
            if(pu == pv){
                return false ;
            }
            union(rank,par,u,v) ;
        }
        return true ;
    }
    public int parent(int[] par , int x){
        if(par[x] == x){
            return x ;
        }
        return par[x] = parent(par,par[x]) ;
    }
    public void union(int[] rank , int[] par , int u , int v){
        int pu = par[u] ;
        int pv = par[v] ;
        if(pu == pv) return ;
        if(rank[pu] > rank[pv]){
            par[pv] = pu ;
        }
        else if(rank[pu] < rank[pv]){
            par[pv] = pu ;
        }
        else{
            par[pu] = pv ;
            rank[pv]++ ;
        }
    }
}
