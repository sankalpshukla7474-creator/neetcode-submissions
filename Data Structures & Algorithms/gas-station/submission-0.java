class Solution {
    public int canCompleteCircuit(int[] g, int[] c) {
        int max = Integer.MIN_VALUE , idx = -1 ;
        for(int i = 0 ; i < g.length ; i++){
            if(g[i]-c[i] > max){
                max = g[i] - c[i] ;
                idx = i ;
            }
        }
        if(idx == -1) return -1 ;
        boolean flag = true ;
        boolean[] visit = new boolean[g.length] ;
        int prev = 0 ;
        for(int i = idx ; i < g.length ; i++){
            int curr = prev + g[i] ;
            if(curr >= c[i]){
                visit[i] = true ;
                prev = curr - c[i];
            }
            else{
                flag = false ;
                break ;
            }
        }
        if(!flag) return -1 ;
        for(int i = 0 ; i < idx ; i++){
            int curr = prev + g[i] ;
            if(curr >= c[i]){
                visit[i] = true ;
                prev = curr - c[i];
            }
            else{
                flag = false ;
                break ;
            }
        }
        if(!flag) return -1 ;
        return idx ;
    }
}
