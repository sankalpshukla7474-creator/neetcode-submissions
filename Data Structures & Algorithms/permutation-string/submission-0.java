class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length() > s2.length()) return false ;

        int[] s1c = new int[26];
        int[] s2c = new int[26];

        for(int i = 0 ; i < s1.length() ; i++){
            s1c[s1.charAt(i)-'a']++;
        }

        for(int i = 0 ; i < s1.length() ; i++){
            s2c[s2.charAt(i)-'a']++;
        }

        if(match(s1c,s2c)){
            return true ;
        }

        for(int i = s1.length() ; i < s2.length() ; i++){
            s2c[s2.charAt(i) - 'a']++ ;
            s2c[s2.charAt(i-s1.length()) - 'a']--;
            if(match(s1c,s2c)){
                return true ;
            }
        }
        return false ;
    }
    private boolean match(int[] s1c , int[] s2c){
        for(int i = 0 ; i < 26 ; i++){
            if(s1c[i] != s2c[i]){
                return false ;
            }
        }
        return true ;
    }
}
