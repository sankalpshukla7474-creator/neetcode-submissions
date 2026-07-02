class Solution {
    List<List<Integer>> ls = new ArrayList<>() ;
    public List<List<Integer>> combinationSum2(int[] c, int target) {
        if(c.length == 0) return ls ;
        Arrays.sort(c) ;
        List<Integer> pb = new ArrayList<>() ;
        pass(c,target,0,pb) ;
        return ls ;
    }
    public void pass(int[] c , int tar , int i , List<Integer> pb){
        if(tar == 0){
            ls.add(new ArrayList<>(pb)) ;
            return ;
        }
        if(tar < 0) return ; 
        for(int j = i ; j < c.length ; j++){
            if(j > i && c[j] == c[j-1]) continue ;
            if (c[j] > tar) break;
            pb.add(c[j]) ;
            pass(c,tar-c[j],j+1,pb) ;
            pb.remove(pb.size()-1) ;
        }
    }
}
