class Solution {
    public int longestIncreasingPath(int[][] m) {
        int max = 0 ;
        for(int i = 0 ; i < m.length ; i++){
            for(int j = 0 ; j < m[0].length ; j++){
                boolean[][] visit = new boolean[m.length][m[0].length] ;
                int th = ans(m,i,j,-1,visit) ;
                max = Math.max(max,th) ;
            }
        }
        return max ;
    }
    public int ans(int[][] m , int i , int j , int prev, boolean[][] visit){
        if(i < 0 || i >= m.length || j < 0 || j >= m[0].length) return 0;
        if(m[i][j] <= prev || visit[i][j]) return 0 ;
        visit[i][j] = true ;
        int a = ans(m,i+1,j,m[i][j],visit) ;
        int b = ans(m,i-1,j,m[i][j],visit) ;
        int c = ans(m,i,j+1,m[i][j],visit) ;
        int d = ans(m,i,j-1,m[i][j],visit) ;
        visit[i][j] = false ;
        return 1 + Math.max(a,Math.max(b,Math.max(c,d))) ;
    }
}
