class MinStack {
    Stack<int[]> st ;
    public MinStack() {
        st = new Stack<>() ;
    }
    
    public void push(int val) {
        if(st.isEmpty()){
            st.push(new int[]{val,val}) ;
        }
        else{
            int[] arr = st.peek() ;
            st.push(new int[]{val,Math.min(arr[1],val)}) ;
        }
    }
    
    public void pop() {
        if(!st.isEmpty()){
            st.pop() ;
        }
    }
    
    public int top() {
        int[] arr = st.peek() ;
        return arr[0] ;
    }
    
    public int getMin() {
            int[] arr = st.peek() ;
            return arr[1] ;
        
    }
}
