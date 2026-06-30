class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        List<Integer> ls = new ArrayList<>() ;
        int m = mat.length , n = mat[0].length ;
        int top = 0 , bottom = m-1 , left = 0 , right = n-1 ;
        int dir = 0 ;
        while(top <= bottom && left <= right){
            if(dir == 0){
               for(int i = left ; i <= right ; i++){
                   ls.add(mat[top][i]) ;
               }
               top++ ;
            }
            if(dir == 1){
               for(int i = top ; i <= bottom ; i++){
                   ls.add(mat[i][right]) ;
               }
               right-- ;
            }
            if(dir == 2){
                for(int i = right ; i >= left ; i--){
                    ls.add(mat[bottom][i]) ;
                }
                bottom-- ;
            }
            if(dir == 3){
                for(int i = bottom ; i >= top ; i--){
                    ls.add(mat[i][left]) ;
                }
                left++ ;
            }
            dir++ ;
            if(dir == 4){
                dir = 0 ;
            }
        }
        return ls ;
    }
}
