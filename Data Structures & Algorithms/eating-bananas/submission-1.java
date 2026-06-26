class Solution {
    public int minEatingSpeed(int[] p, int h) {
        int j = Integer.MIN_VALUE ;
        for(int x : p){
            if(x > j) j = x ;
        }
        int i = 1 ;
        int ans = -1 ;
        while(i <= j){
            int mid = (i+j) / 2 ;
            int k = koko(mid , p ) ;
            if( k <= h){
                ans = mid ;
                j = mid - 1 ;
            }
            else{
                i = mid + 1 ;
            }
        }
        return ans ;
    }
    public int koko(int h , int[] p){
        int c = 0;
        for(int x : p){
            c += (x + h - 1) / h;
        }
        return c;

    }
}
