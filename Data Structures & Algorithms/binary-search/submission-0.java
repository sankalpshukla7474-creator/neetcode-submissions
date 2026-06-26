class Solution {
    public int search(int[] n, int t) {
        int i = 0 , j = n.length - 1 ;
        while(i <= j){
            int mid = (i+j) / 2 ;
            if(n[mid] == t) return mid ;
            else if(n[mid] < t) i = mid + 1 ;
            else j = mid - 1 ;
        }
        return -1 ;
    }
}
