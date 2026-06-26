class Solution {
    public String mergeAlternately(String x, String y) {
        int f = x.length() , s = y.length() ;
        int i = 0 , j = 0 ;
        StringBuilder sb = new StringBuilder();
        while(i < f && j < s){
            sb.append(x.charAt(i));
            sb.append(y.charAt(j));
            i++; j++;
        }
        while(i < f){
            sb.append(x.charAt(i));
            i++;
        }
        while(j < s){
            sb.append(y.charAt(j));
            j++;
        }
        return sb.toString() ;
    }
}