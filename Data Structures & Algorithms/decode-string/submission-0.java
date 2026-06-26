class Solution {
    public String decodeString(String s) {
       Stack<Integer> ns = new Stack<>();
       Stack<String> ss = new Stack<>() ;

       String cs = "" ;
       int cn = 0 ;

       for(char ch : s.toCharArray()){
         if(Character.isDigit(ch)){
            cn = cn * 10 + (ch-'0') ;

         }
         else if(ch == '['){
            ns.push(cn);
            ss.push(cs);
            cn = 0 ; 
            cs = "" ;
         }
         else if(ch == ']'){
            int rt = ns.pop() ;
            StringBuilder str = new StringBuilder(ss.pop());
            for(int i = 0 ; i < rt ; i++){
                str.append(cs);
            }
            cs = str.toString();
         }
         else{
            cs += ch ;
         }
       } 
       return cs ;
    }
}