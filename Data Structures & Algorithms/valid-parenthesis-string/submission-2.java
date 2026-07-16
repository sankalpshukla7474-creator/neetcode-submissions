class Solution {
    public boolean checkValidString(String s) {
        Stack<Character> st = new Stack<>() ;
        int count = 0 ;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                st.push(ch) ;
            }
            else if(ch == '*'){
                count++ ;
            }
            else{
                if(st.isEmpty()) return false ;
                char ph = st.peek() ;
                if(ph == '(' ){
                    continue ;
                }
                else if(count > 0){
                    count-- ;
                }
                else{
                    return false ;
                }
            }
        }
        if(st.isEmpty()) return true ;
        return count >= st.size() ? true : false ;
    }
}
