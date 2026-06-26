class MinStack {
    Stack<Integer> st ;
    int min ;
    public MinStack() {
      st = new Stack<>();  
      min = Integer.MAX_VALUE ;
    }
    
    public void push(int val) {
        st.push(val);
        min = Math.min(min , val );
    }
    
    public void pop() {
        if(min == st.pop() ){
            min = Integer.MAX_VALUE ;
            for(int sc : st){
                min = Math.min(min , sc );
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
