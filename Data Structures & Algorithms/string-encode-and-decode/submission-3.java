class Solution {
    StringBuilder sb = new StringBuilder() ;
    public String encode(List<String> strs) {
       for(String s : strs){
           sb.append(s+s.length()+'#') ;
       }
       return sb.toString() ;
    }

    public List<String> decode(String str) {
        List<String> ls = new ArrayList<>() ;
        int l = 0 , r = 0 ;
        while(r < str.length()){
            char ch = str.charAt(r) ;
            if(Character.isDigit(ch) && str.charAt(r+1) == '#'){
               String p = str.substring(l,r) ;
               ls.add(p) ;
               r += 2 ;
               l = r ;
            }
            else{
                r++ ;
            }
        }
        return ls ;
    }
}
