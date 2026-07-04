class Solution {
    int n = -1 , m = -1 ;
    public boolean exist(char[][] b, String word) {
        n = b.length ; m = b[0].length ;
        char[] arr = word.toCharArray() ;
        for(int i = 0 ; i < b.length ; i++){
            for(int j = 0 ; j < b[0].length ; j++){
                if(b[i][j] == arr[0]){
                    boolean[][] visit = new boolean[n][m] ;
                    boolean ans = pass(b,arr,i,j,0,visit) ;
                    if(ans){
                        return true ;
                    }
                }
            }
        }
        return false ;
    }
    public boolean pass(char[][] b , char[] arr , int i , int j , int idx,boolean[][] visit){
        if(idx == arr.length) return true ;
        if(i < 0 || i >= n || j < 0 || j >= m || visit[i][j] || b[i][j] != arr[idx]) return false ;
        visit[i][j] = true ;
        boolean q = pass(b,arr,i+1,j,idx+1,visit) ;
        boolean w = pass(b,arr,i,j+1,idx+1,visit) ;
        boolean e = pass(b,arr,i-1,j,idx+1,visit) ;
        boolean r = pass(b,arr,i,j-1,idx+1,visit) ;
        visit[i][j] = false ;
        return (q || w || e || r) ;
    }
}
