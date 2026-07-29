class Solution {
    public boolean validTree(int n, int[][] ed) {
        List<List<Integer>> adj = new ArrayList<>() ;
        for(int i = 0 ; i < n ; i++){
            adj.add(new ArrayList<>()) ;
        }
        for(int i = 0 ; i < ed.length ; i++){
            int u = ed[i][0] ;
            int v = ed[i][1] ;
            if(adj.get(u).size() == 0 || adj.get(v).size() == 0){
                adj.get(u).add(v) ;
                adj.get(v).add(u) ;
            }
            else{
                return false ;
            }
        }
        return true ;
    }
}
