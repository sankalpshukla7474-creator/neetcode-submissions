class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int i = m.length , j = m[0].length ;
        int[] arr = new int[i*j];
        int p = 0 ; 
        for(int q = 0 ; q < i ; q++){
            for(int w = 0 ; w < m[q].length ; w++){
                arr[p] = m[q][w];
                p++ ;
            }
        }
        i = 0 ; j = arr.length - 1 ;
        while(i <= j){
            int mid = i + (j-i)/2 ;
            if(arr[mid] == t) return true;
            else if(arr[mid] > t) j = mid - 1 ;
            else i = mid + 1 ;
        }
        return false ;
    }
}
