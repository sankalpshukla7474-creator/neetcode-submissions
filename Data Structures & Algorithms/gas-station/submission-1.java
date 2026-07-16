class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sG = 0 , sC = 0 ;
        for(int x : gas){
            sG += x ;
        }
        for(int x : cost){
            sC += x ;
        }
        if(sG < sC) return -1 ;
        for(int i = 0 ; i < gas.length ; i++){
            int prev = 0 ;
            if(gas[i] - cost[i] >= 0 ){
                if(valid(gas,cost,i)){
                    return i ;
                }
            }
        }
        return -1 ;
    }
    public boolean valid(int[] g , int[] c , int idx){
        int ret = idx , prev = 0 ;
        for(int j = idx ; j < g.length ; j++){
            int curr = prev + g[j] ;
            if(curr >= c[j]){
                prev = curr - c[j] ;
                ret++ ;
            }
            else{
                break ;
            }
        }
        return g.length == ret ? true : false ;
    }
}
