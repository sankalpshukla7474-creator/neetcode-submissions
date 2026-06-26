class Solution {
    public boolean validPalindrome(String s) {
        int i = 0 , j = s.length()-1;
        while(i<=j){
            if(s.charAt(i)==s.charAt(j)){
                i++;
                j--;
            }
            else{
                return is(s,i+1,j) || is(s,i,j-1) ;
            }
        }
        return true ;
    }
    public boolean is(String s , int i , int j){
        int q = i , w = j ;
        while(q <= w){
            if(s.charAt(q) == s.charAt(w)){
                q++ ;
                w-- ;
            }
            else{
                return false ;
            }
        }
        return true ;
    }
}