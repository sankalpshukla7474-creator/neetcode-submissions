class Solution {
    public int maxProfit(int[] p) {
        if(p.length <= 1) return 0 ;
        return ans(p,0,0) ;
    }
    public int ans(int[] p , int i , int turn ){
        if(i >= p.length) return 0 ;
        int take = 0 ;
        int not = 0 ;
        if(turn == 0){
            take = -p[i] + ans(p,i+1,1) ; 
            not = ans(p,i+1,0) ;
        }
        else{
            take = (p[i]) + ans(p,i+2,0) ;
            not = ans(p,i+1,1) ;
        }
        return Math.max(take,not) ;
    }
}
