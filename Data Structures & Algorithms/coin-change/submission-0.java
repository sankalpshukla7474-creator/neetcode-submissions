class Solution {
    public int coinChange(int[] c, int amount) {
        if(c.length == 0) return -1 ;
        int ans = take(c,amount,c.length-1) ;
        return ans == Integer.MAX_VALUE ? -1 : ans ;
    }
    public int take(int[] c , int sum , int i){
        if(sum < 0 || i < 0) return Integer.MAX_VALUE ;
        if(sum == 0) return 0 ;
        int a = take(c,sum-c[i],i) ;
        int b = take(c,sum,i-1) ;
        if(c[i] <= sum && a != Integer.MAX_VALUE){
            a += 1 ;
        }
        return Math.min(a,b) ;
    }
}
