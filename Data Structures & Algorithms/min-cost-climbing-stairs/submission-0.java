class Solution {
    public int minCostClimbingStairs(int[] c) {
        return Math.min(pass(c,0),pass(c,1)) ;
    }
    public int pass(int[] c , int i){
        if(i >= c.length ) return 0 ;
        int one = pass(c,i+1) ;
        int two = pass(c,i+2) ;
        return c[i] + Math.min(one,two) ;
    }
}
