class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < a.length ; i++){
            int x = a[i] ;
            boolean fired = false ;
            while(!st.isEmpty() && st.peek() > 0 && x < 0){
                if(st.peek() < -x){
                    st.pop() ;
                    continue ;
                }
                else if(st.peek() == -x){
                    st.pop() ;
                    fired = true ;
                    break ;
                }
                else{
                    fired = true ;
                    break ;
                }
            }
            if(!fired){
                st.push(x) ;
            }
        }
        int[] arr = new int[st.size()] ;
        for(int i = arr.length - 1 ; i >= 0 ; i--){
            arr[i] = st.pop() ;
        }
        return arr ;
    }
}