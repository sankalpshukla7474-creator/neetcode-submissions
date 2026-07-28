class Solution {
    public int orangesRotting(int[][] g) {
        Queue<int[]> q = new ArrayDeque<>() ;
        for(int i = 0 ; i < g.length ; i++){
            for(int j = 0 ; j < g[0].length ; j++){
                if(g[i][j] == 2){
                    q.offer(new int[]{i,j}) ;
                }
            }
        }
        boolean[][] visit = new boolean[g.length][g[0].length] ;
        int count = 0 ;
        while(!q.isEmpty()){
            int size = q.size() ;
            for(int i = 0 ; i < size ; i++){
                int[] arr = q.poll() ;
                int row = arr[0] ;
                int col = arr[1] ;
                if(valid(row+1,col,g) && !visit[row+1][col] && g[row+1][col] == 1 ){
                    visit[row+1][col] = true ;
                    g[row+1][col] = 2 ;
                    q.offer(new int[]{row+1,col}) ;
                }
                if(valid(row,col+1,g) && !visit[row][col+1] && g[row][col+1] == 1 ){
                    visit[row][col+1] = true ;
                    g[row][col+1] = 2 ;
                    q.offer(new int[]{row,col+1}) ;
                }
                if(valid(row-1,col,g) && !visit[row-1][col] && g[row-1][col] == 1  ){
                    visit[row-1][col] = true ;
                    g[row-1][col] = 2 ;
                    q.offer(new int[]{row-1,col}) ;
                }
                if(valid(row,col-1,g) && !visit[row][col-1] && g[row][col-1] == 1  ){
                    visit[row][col-1] = true ;
                    g[row][col-1] = 2 ;
                    q.offer(new int[]{row,col-1}) ;
                }
            }
            count++ ;
        }
        for(int i = 0 ; i < g.length ; i++){
            for(int j = 0 ; j < g[0].length ; j++){
                if(g[i][j] == 1){
                    return -1 ;
                }
            }
        }
        return count - 1;
    }
    public boolean valid(int row , int col , int[][] g){
        if(row < 0 || row >= g.length || col < 0 || col >= g[0].length){
            return false ;
        }
        return true ;
    }
}
