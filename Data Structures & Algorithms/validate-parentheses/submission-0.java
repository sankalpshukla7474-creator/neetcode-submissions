class Solution {
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
