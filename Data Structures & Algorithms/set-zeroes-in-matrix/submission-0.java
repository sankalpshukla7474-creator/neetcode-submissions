class Solution {
    public void setZeroes(int[][] mat) {
        List<Pair> ls = new ArrayList<>() ;
        for(int i = 0 ; i < mat.length ; i++){
            for(int j = 0 ; j < mat[0].length ; j++){
                if(mat[i][j] == 0){
                    ls.add(new Pair(i,j)) ;
                }
            }
        }
        for(Pair p : ls){
            int i = p.a ;
            int j = p.b ;
            fill(mat,i,j) ;
        }
    }
    public void fill(int[][] mat , int row , int col){
        for(int i = 0 ; i < mat[0].length ; i++){
            mat[row][i] = 0 ;
        }
        for(int i = 0 ; i < mat.length ; i++){
            mat[i][col] = 0 ;
        }
    }
    class Pair{
        int a ;
        int b ;
        Pair(int a , int b){
            this.a = a ;
            this.b = b ;
        }
    }
}
