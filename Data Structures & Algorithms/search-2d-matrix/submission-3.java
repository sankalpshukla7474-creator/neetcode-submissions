class Solution {
    public boolean searchMatrix(int[][] mat, int target) {
        int row = -1 ;
        int m = mat.length-1 , n = mat[0].length-1 ;
        int i = 0 ;
        while(i <= m){
            if(target >= mat[i][0] && target <= mat[i][n]){
                row = i ;
                break ;
            }
            i++ ;
        }
        int u = 0 , v = n ;
        while(u <= v){
            int mid = u + (v-u) / 2 ;
            if(mat[row][mid] == target){
                return true ;
            }
            else if(mat[row][mid] > target){
                v = mid - 1 ;
            }
            else{
                u = mid + 1 ;
            }
        }
        return false ;
    }
}
