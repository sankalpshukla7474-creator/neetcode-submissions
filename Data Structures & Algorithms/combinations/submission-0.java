class Solution {
    List<List<Integer>> ls ;
    public List<List<Integer>> combine(int n, int k) {
        ls = new ArrayList<>() ;
        List<Integer> pb = new ArrayList<>() ;
        check(pb,1,k,n);
        return ls ;
    }
    public void check(List<Integer> pb , int i , int k , int n){
        if(pb.size() == k){
            ls.add(new ArrayList<>(pb)); 
            return ;
        }
        if(i > n){
            return ;
        }
        pb.add(i) ;
        check(pb,i+1,k,n) ;
        pb.remove(pb.size()-1);
        check(pb,i+1,k,n);
        return ;
    }
}