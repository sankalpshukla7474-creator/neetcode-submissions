class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int n = temp.length ;
        int[] arr = new int[n] ;
        Stack<Integer> st = new Stack<>() ;
        for(int i = n-1 ; i >= 0 ; i--){
            while(!st.isEmpty() && temp[st.peek()] <= temp[i]){
                st.pop() ;
            }
            arr[i] = st.isEmpty() ? 0 : st.peek() - i ;
            st.push(i) ;
        }
        return arr ;
    }
}
