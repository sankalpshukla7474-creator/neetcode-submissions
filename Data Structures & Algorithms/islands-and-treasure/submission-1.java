class Solution {
    public void islandsAndTreasure(int[][] g) {
        for(int i = 0 ; i < g.length ; i++){
            for(int j = 0 ; j < g[0].length ; j++){
                if(g[i][j] == 2147483647 ){
                    boolean[][] visit = new boolean[g.length][g[0].length] ;
                    int pass = bfs(i,j,visit,g) ;
                    if(pass != -1){
                        g[i][j] = pass ;
                    }
                }
            }
        }
    }
    public int bfs(int i , int j , boolean[][] visit , int[][] g){
        Queue<int[]> q = new ArrayDeque<>() ;
        q.offer(new int[]{i,j}) ;
        visit[i][j] = true ;
        int count = 0 ;
        while(!q.isEmpty()){
            int size = q.size() ;
            for(int k = 0 ; k < size ; k++){
                int[] arr = q.poll() ;
                int row = arr[0] , col = arr[1] ;
                if(g[row][col] == 0){
                    return count ;
                }
                if(valid(row+1,col,g) && !visit[row+1][col] && g[row+1][col] != -1 ){
                    visit[row+1][col] = true ;
                    q.offer(new int[]{row+1,col}) ;
                }
                if(valid(row,col+1,g) && !visit[row][col+1] && g[row][col+1] != -1 ){
                    visit[row][col+1] = true ;
                    q.offer(new int[]{row,col+1}) ;
                }
                if(valid(row-1,col,g) && !visit[row-1][col] && g[row-1][col] != -1  ){
                    visit[row-1][col] = true ;
                    q.offer(new int[]{row-1,col}) ;
                }
                if(valid(row,col-1,g) && !visit[row][col-1] && g[row][col-1] != -1  ){
                    visit[row][col-1] = true ;
                    q.offer(new int[]{row,col-1}) ;
                }
            }
            count++ ;
        }
        return 2147483647 ;
    }
    public boolean valid(int i , int j , int[][] g){
        if(i < 0 || j < 0 || i >= g.length || j >= g[0].length){
            return false ;
        }
        return true ;
    }
}
