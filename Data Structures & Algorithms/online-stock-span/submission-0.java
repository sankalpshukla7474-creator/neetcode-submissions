class StockSpanner {
    Stack<Integer> st ;
    public StockSpanner() {
    st = new Stack<>() ;    
    }
    
    public int next(int price) {
      int c = 0 ; 
      st.push(price);
      Stack<Integer> pt = new Stack<>() ;
      while(!st.isEmpty() && st.peek()<=price){
        pt.push(st.pop());
        c++ ;
      }
      while(!pt.isEmpty()){
        st.push(pt.pop());
      }
      return c ;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */