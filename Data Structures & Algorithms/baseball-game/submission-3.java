class Solution {
    public int calPoints(String[] o) {
        if(o.length == 0) return 0 ;
        Stack<Integer> st = new Stack<>() ;
        for(int i = 0 ; i < o.length ; i++){
            String ch = o[i] ;
            if(ch.equals("+")){
                int a = st.pop() ;
                int b = st.pop() ;
                st.push(b) ;
                st.push(a) ;
                st.push(a+b) ;
            }
            else if(ch.equals("D")){
                st.push(st.peek()*2) ;
            }
            else if(ch.equals("C")){
                st.pop() ;
            }
            else{
                st.push(Integer.parseInt(ch)) ;
            }
        }
        int sum = 0 ;
        while(!st.isEmpty()){
            sum += st.pop() ;
        }
        return sum ;
    }
}