class Solution {
    public int[] dailyTemperatures(int[] t) {
     Stack<Integer> st = new Stack<>();
     int[] res = new int[t.length] ; 
     for(int i = t.length-1 ; i >=0 ; i--){
        int val = t[i] ;
        while(!st.isEmpty() && t[st.peek()] <= val){
            st.pop() ;
        }
        res[i] = st.isEmpty() ? 0 : st.peek()-i;
        st.push(i) ;
     }  
     return res ;
    }
}
