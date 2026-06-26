class FreqStack {
    Map<Integer , Integer> fm ;
    Map<Integer , Stack<Integer>> fs ;
    int mf ;
    public FreqStack() {
       fm = new HashMap<>() ;
       fs = new HashMap<>() ;
       mf = 0 ;  
    }
    
    public void push(int val) {
       int fre = fm.getOrDefault(val,0)+1;
       fm.put(val,fre);
       if(fre>mf) mf = fre ;
       fs.computeIfAbsent(fre,f->new Stack()).push(val) ;
    }
    
    public int pop() {
       Stack<Integer> st = fs.get(mf);
       int top = st.pop();
       if(st.isEmpty()) mf-- ;
       fm.put(top,fm.get(top)-1);
       return top ; 
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */