class Solution {
    public int minDistance(String w1, String w2) {
        return pass(0,0,w1,w2) ;
    }
    public int pass(int i , int j , String w1 , String w2){
        if(i == w1.length()){
            return w2.length() - j ;
        }
        if(j == w2.length()){
            return w1.length() - i ;
        }
        if(w1.charAt(i) == w2.charAt(j)){
            return pass(i+1,j+1,w1,w2) ;
        }
        else{
            int inst = pass(i,j+1,w1,w2) ;
            int del = pass(i+1,j,w1,w2) ;
            int repl = pass(i+1,j+1,w1,w2) ;
            return 1 + Math.min(inst,Math.min(del,repl)) ;
        }
    }
}
