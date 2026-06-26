class Solution {
    public String longestCommonPrefix(String[] strs) {
        int m = Integer.MAX_VALUE ;
        String s = "";
        int n = strs.length ;
        for(int i = 0 ; i < n ; i++){
            if(strs[i].length() == 0){
                return "";
            }
            if(strs[i].length() < m){
                m = Math.min(m,strs[i].length()) ;
                s = strs[i] ;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < m ; i++){
            char ch = s.charAt(i) ;
            for(int j = 0 ; j < n ; j++){
                if(strs[j].charAt(i) != ch){
                    return sb.toString();
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}