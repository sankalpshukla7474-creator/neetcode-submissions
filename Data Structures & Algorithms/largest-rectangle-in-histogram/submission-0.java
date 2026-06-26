class Solution {
    public int largestRectangleArea(int[] h) {
        if(h.length == 0) return 0 ;
        int[] pre = new int[h.length] ;
        int[] post = new int[h.length] ;
        Stack<Integer> st = new Stack<>() ;
        int n = h.length ;
        for(int i = 0 ; i < n ; i++){
            while(!st.isEmpty() && h[st.peek()] >= h[i]){
                st.pop() ;
            }
            pre[i] = st.isEmpty() ? -1 : st.peek() ;
            st.push(i) ;
        }
        st.clear() ;
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.isEmpty() && h[st.peek()] >= h[i]){
                st.pop() ;
            }
            post[i] = st.isEmpty() ? n : st.peek() ;
            st.push(i) ;
        }
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i < n ; i++){
            int area = post[i] - pre[i] - 1 ;
            max = Math.max(max,area*h[i]) ;
        }
        return max ;
    }
}
