class Solution {
    public String mergeAlternately(String w1, String w2) {
        String s = "";
        int i = 0 , j = 0 ;
        while(i < w1.length() && j < w2.length()){
            s += w1.charAt(i) ;
            s += w2.charAt(j) ;
            i++ ;
            j++ ;
        }
        while(i < w1.length()){
            s += w1.charAt(i) ;
            i++ ;
        }
        while(j < w2.length()){
            s += w2.charAt(j) ;
            j++;
        }
        return s ;
    }
}