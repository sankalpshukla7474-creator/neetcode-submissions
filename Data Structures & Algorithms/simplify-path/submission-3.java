class Solution {
    public String simplifyPath(String path) {
        String[] arr = path.split("/");
        Stack<String> st = new Stack<>() ;
        for(String p : arr){
            if(p.equals("") || p.equals(".")){
                continue ;
            }
            else if(p.equals("..")){
                if(!st.isEmpty()) st.pop() ;
            }
            else{
                st.push(p) ;
            }
        }
        StringBuilder sb = new StringBuilder() ;
        for(String s : st){
            sb.append("/").append(s) ;
        }
        return sb.length() == 0 ? "/" : sb.toString() ;
    }
}