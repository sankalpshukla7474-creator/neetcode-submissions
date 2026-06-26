class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> ls = new ArrayList<>();
       generate(ls,n,"");
       return ls ; 
    }
    public void generate(List<String> ls , int n ,String s){
        if(s.length() == 2*n){
            if(isValid(s)){
                ls.add(s);
            }
            return ;
        }
        generate(ls,n,s+"(");
        generate(ls,n,s+")");        
    }

    public boolean isValid(String s) {

    Stack<Character> st = new Stack<>() ;
    for (char op : s.toCharArray()) {
            if (op == '(' || op == '[' || op == '{') {
                st.push(op);
            } 
            else if (op == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } 
            else if (op == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } 
            else if (op == '}' && !st.isEmpty() && st.peek() == '{') {
                st.pop();
            } 
            else {
                return false;
            }
        }
    return st.isEmpty() ;
    }

}