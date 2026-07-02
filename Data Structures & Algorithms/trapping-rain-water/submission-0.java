class Solution {
    public int trap(int[] h) {
        if(h.length == 0) return 0 ;
        int n = h.length ;
        int[] pre = new int[n] ;
        pre[0] = h[0] ;
        for(int i = 1 ; i < n ; i++){
            pre[i] = Math.max(pre[i-1],h[i]) ;
        }
        int[] post = new int[n] ;
        post[n-1] = h[n-1] ;
        for(int i = n-2 ; i >= 0 ; i--){
            post[i] = Math.max(post[i+1],h[i]) ;
        }
        int sum = 0 ;
        for(int i = 0 ; i < n ; i++){
            int bound = Math.min(pre[i],post[i]) ;
            sum += (bound-h[i]) ;
        }
        return sum ;
    }
}
