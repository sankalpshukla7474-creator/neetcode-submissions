class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26] ;
        int left = 0 ;
        int mf = 0 ;
        int ml = 0 ;

        for(int right = 0 ; right < s.length() ; right++){

            char ch = s.charAt(right) ;
            count[ch-'A']++ ;
            mf = Math.max(mf , count[ch-'A']) ;
            int ws = right - left + 1 ;
            int rn = ws - mf ;
            if(rn > k){
                char lc = s.charAt(left) ;
                count[lc - 'A']--;
                left++ ;
            }
            ml = Math.max(ml , right - left + 1 ) ;
        } 
        return ml ;
    }
}
