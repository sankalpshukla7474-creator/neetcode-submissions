class Solution {
    public int change(int amount, int[] c) {
        int n = c.length ;
        if(n == 0) return 0 ;
        return track(amount,c,n-1) ;
    }
    public int track(int tar , int[] c , int i){
        if(tar < 0) return 0 ;
        if(i < 0){
            if(tar == 0) return 1 ;
            return 0 ;
        }
        int a = track(tar-c[i],c,i) ;
        int b = track(tar,c,i-1) ;
        return (a+b) ;
    }
}
