class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length() == 0) return 0 ;
        int[] fre = new int[26] ;
        char[] arr = s.toCharArray() ;
        int window = 0 , max = 0 , l = 0 ; 
        for(int right = 0 ; right < arr.length ; right++){
            fre[arr[right]-'A']++ ;
            max = Math.max(max,fre[arr[right]-'A']) ;
            if((right-l+1) - max > k){
                fre[arr[l]-'A']-- ;
                l++ ;
            }
            window = Math.max(window,right-l+1) ;
        }
        return window ;
    }
}
