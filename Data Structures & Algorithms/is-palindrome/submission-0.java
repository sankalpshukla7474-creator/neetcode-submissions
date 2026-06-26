class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder t = new StringBuilder() ;
        for(char ch : s.toCharArray()){
            if(ch == ' '){
                continue ;
            }
            if(Character.isLetterOrDigit(ch)){
                t.append(ch);
            }
        }
        String p = t.toString().toLowerCase() ;

        int i = 0 , j = p.length() - 1 ;

        while(i <= j){
            if(p.charAt(i) == p.charAt(j)){
                i++;
                j--;
            }
            else{
                return false ;
            }
        }
        return true ;
    }
}
