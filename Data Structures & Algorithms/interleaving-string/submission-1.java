class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if((s1.length() + s2.length()) != s3.length()) return false ;
        return pass(0,0,0,s1,s2,s3) ;
    }
    public boolean pass(int k, int i, int j , String s1 , String s2 , String s3 ){
        if(i == s1.length() && j == s2.length() && k == s3.length()) return true ;
        if(k >= s3.length() || i > s1.length() || j > s2.length()) return false ;
        if(s1.charAt(i) == s3.charAt(k) && s2.charAt(i) == s3.charAt(k)){
            boolean a = pass(k+1,i+1,j,s1,s2,s3) ;
            boolean b = pass(k+1,i,j+1,s1,s2,s3) ;
            return (a || b) ;
        }
        else{
            if(s1.charAt(i) == s3.charAt(k)){
                return pass(k+1,i+1,j,s1,s2,s3) ;
            }
            if(s2.charAt(j) == s3.charAt(k)){
                return pass(k+1,i,j+1,s1,s2,s3) ;
            }
        }
        return false ;
    }
}
