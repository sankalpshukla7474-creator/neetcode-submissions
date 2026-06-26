class Solution {
    public int evalRPN(String[] t) {
      Stack<Integer> st = new Stack<>() ;
      for(String ch : t){
        if(ch.equals("+")){
            int a = st.pop() ;
            int b = st.pop() ;
            st.push(a+b) ;
         }
        else if(ch.equals("-")){
            int a = st.pop() ;
            int b = st.pop() ;
            st.push(b-a) ;
         }
        else if(ch.equals("*")){
            int a = st.pop() ;
            int b = st.pop() ;
            st.push(a*b) ;
        }
        else if(ch.equals("/")){
            int a = st.pop() ;
            int b = st.pop() ;
            st.push(b/a) ;
        }
        else {
            int a = Integer.parseInt(ch) ;
            st.push(a) ;
        }

      }
      return st.peek() ;
    }
}
