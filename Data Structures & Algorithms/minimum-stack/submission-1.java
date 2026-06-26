class MinStack {
    int min ;
    Stack<Integer> st ;
    public MinStack() {
        st = new Stack<>() ;
        min = Integer.MAX_VALUE ;
    }
    
    public void push(int val) {
        st.push(val) ;
        min = Math.min(min,val) ;
    }
    
    public void pop() {
        int c = st.pop() ;
        if(min == c){
            min = Integer.MAX_VALUE ;
            for(int x : st){
                min = Math.min(x,min) ;
            }
        }
    }
    
    public int top() {
        return st.peek() ;
    }
    
    public int getMin() {
        return min ;
    }
}
