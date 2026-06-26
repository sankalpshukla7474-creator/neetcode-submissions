class Solution {
    public int maxProfit(int[] p) {
        int min = p[0] ;
        int max = 0 ;
        for(int i = 1 ; i < p.length ; i++){
            if(p[i] < min){
                min = p[i] ;
            }
            max = Math.max(max,p[i]-min) ;
        }
        return max ;
    }
}
