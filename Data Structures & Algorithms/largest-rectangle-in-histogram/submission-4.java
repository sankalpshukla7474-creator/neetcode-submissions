class Solution {
    public int largestRectangleArea(int[] h) {
        if(h.length == 0) return 0 ;
        int n = h.length , max = 0 ;
        int[] pre = new int[n] ;
        Stack<Integer> st = new Stack<>() ;
        for(int i = 0 ; i < n ; i++){
            int x = h[i] ;
            while(!st.isEmpty() && h[st.peek()] >= x){
                st.pop() ;
            }
            pre[i] = st.isEmpty() ? -1 : st.peek() ;
            st.push(i) ;
        }
        st.clear() ;
        int[] post = new int[n] ;
        for(int i = n-1 ; i >= 0 ; i--){
            int x = h[i] ;
            while(!st.isEmpty() && h[st.peek()] >= x){
                st.pop() ;
            }
            post[i] = st.isEmpty() ? n : st.peek() ;
            st.push(i) ;
        }
        for(int i = 0 ; i < n ; i++){
            int area = post[i] - pre[i] - 1 ;
            max = Math.max(max,area*h[i]) ;
        }
        return max ;
    }
}
