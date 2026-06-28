class Solution {
    List<String> ls = new ArrayList<>() ;
    public List<String> generateParenthesis(int n) {
        if(n == 0) return ls ;
        StringBuilder sb = new StringBuilder() ;
        pass(0,0,sb,n) ;
        return ls ;
    }
    public void pass(int l , int r , StringBuilder sb , int n){
        if(l > n || r > n) return ;
        if(l == n && r == n){
            ls.add(sb.toString()) ;
            return ;
        }
        if(l < n){
            sb.append('(') ;
            pass(l+1,r,sb,n) ;
            sb.deleteCharAt(sb.length()-1) ;
        }
        if(r < l){
            sb.append(')') ;
            pass(l,r+1,sb,n) ;
            sb.deleteCharAt(sb.length()-1) ;
        }
    }
}
 