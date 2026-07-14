class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        return pass(s,0,wordDict) ;
    }
    public boolean pass(String s , int i , List<String> wD){
        if(i == s.length()) return true ;
        if(i > s.length()) return false ;
        for(int j = i ; j < s.length() ; j++){
            String ptr = s.substring(i,j+1) ;
            if(wD.contains(ptr)){
                return pass(s,j+1,wD) ;
            }
        }
        return false ;
    }
}
