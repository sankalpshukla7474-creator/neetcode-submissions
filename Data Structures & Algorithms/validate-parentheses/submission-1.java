class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
           if(ch == '(' || ch == '{' || ch =='['){
              st.add(ch);
           } 
           else{
              if(st.isEmpty()) return false;
              char ph = st.pop();
              if(!match(ch,ph)){
                 return false ;
               }
           } 
        }
        return st.isEmpty() ? true : false ;
    }
    public boolean match(char ch , char ph){
        if(ch == ')' && ph == '('){
            return true ;
        }
        else if(ch == ']' && ph == '['){
            return true ;
        }
        else if(ch == '}' && ph == '{'){
            return true ;
        }
        else{
            return false ;
        }
    } 
}