class Solution {
    public int characterReplacement(String s, int k) {
        int[] fre = new int[26] ;
        int l = 0 , max = 0 , fr = 0 ;
        for(int r = 0 ; r < s.length() ; r++){
            char ch = s.charAt(r) ;
            fre[ch-'A']++ ;
            fr = Math.max(fr,fre[ch-'A']) ;
            while((r-l+1) - fr > k){
                char ph = s.charAt(l) ;
                fre[ph-'A']-- ;
                l++ ;
            }
            max = Math.max(max,r-l+1) ;
        }
        return max ;
    }
}
