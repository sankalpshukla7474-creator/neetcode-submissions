class Solution {
    public boolean isHappy(int n) {
        Set<Integer> st = new HashSet<>() ;
        st.add(1) ;
        int check = n ;
        while(!st.contains(n)){
            int ans = pass(n) ;
            check = ans ;
            st.add(ans) ;
            n = ans ;
        }
        return check == 1 ? true : false ;
    }
    public int pass(int n){
        int res = 0 ;
        while(n > 0){
            int a = n % 10 ;
            res += Math.pow(a,2) ;
            n = n / 10 ;
        }
        return res ;
    }
}
