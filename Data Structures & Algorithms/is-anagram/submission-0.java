class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false ;
        int[] arr = new int[26];
        int[] prr = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        for(int i = 0 ; i < s.length() ; i++){
            char ch = t.charAt(i);
            prr[ch - 'a']++;
        }
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] != prr[i]){
                return false ;
            }
        }
        return true ;
    }
}
