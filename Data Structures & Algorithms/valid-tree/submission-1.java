class Solution {
    public boolean validTree(int n, int[][] ed) {
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
            else{
                union(rank,par,u,v) ;
            }
        }
        Set<Integer> st = new HashSet<>() ;
        for(int i = 0 ; i < n ; i++){
            st.add(par[i]) ;
        }
        if(st.size() > 1) return false ;
        return n-1 == ed.length ;
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
