class Solution {
    List<List<String>> ls = new ArrayList<>() ;
    public List<List<String>> partition(String s) {
        if(s.length() == 0) return ls ;
        List<String> pb = new ArrayList<>() ;
        pass(s,pb) ;
        return ls ;
    }
    public void pass(String s , List<String> pb){
        if(s.length() == 0){
            ls.add(new ArrayList<>(pb)) ;
            return ;
        }
        for(int i = 0 ; i < s.length() ; i++){
            String q = s.substring(0,i+1) ;
            if(valid(q)){
                pb.add(q) ;
                pass(s.substring(i+1),pb) ;
                pb.remove(pb.size()-1) ;
            }
        }
    }
    public boolean valid(String q){
        int i = 0 , j = q.length()-1 ;
        while(i < j){
            if(q.charAt(i) != q.charAt(j)){
                return false ;
            }
            i++ ; j-- ;
        }
        return true ;
    }
}
