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
    public bfs(int i , int j , boolean[][] visit , int[][] g){
        Queue<int[]> q = new ArrayQueue<>() ;
        q.push(new int[]{i,j}) ;
        visit[i][j] = true ;
        count = 1 ;
        while(!q.isEmpty()){
            int size = q.size() ;
            for(int k = 0 ; k < size ; k++){
                int[] arr = q.poll() ;
                int row = arr[0] , col = arr[1] ;
                if(g[row][col] == 0){
                    return count ;
                }
                if(!visit[row+1][col] && g[row+1][col] != -1 && valid(row+1,col,g)){
                    vist[row+1][col] = true ;
                    q.offer(new int[]{row+1,col}) ;
                }
                if(!visit[row][col+1] && g[row][col+1] != -1 && valid(row,col+1,g)){
                    vist[row][col+1] = true ;
                    q.offer(new int[]{row,col+1}) ;
                }
                if(!visit[row-1][col] && g[row-1][col] != -1 && valid(row-1,col,g)){
                    vist[row-1][col] = true ;
                    q.offer(new int[]{row-1,col}) ;
                }
                if(!visit[row][col-1] && g[row][col-1] != -1 && valid(row,col-1,g)){
                    vist[row][col-1] = true ;
                    q.offer(new int[]{row,col-1}) ;
                }
            }
        }
    }
    public boolean valid(int i , int j , int[][] g){
        if(i < 0 || j < 0 || i >= g.length || j >= g[0].length){
            return true ;
        }
        return false ;
    }
}
