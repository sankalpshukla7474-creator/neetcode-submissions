class Solution {
    public int[] sortArray(int[] nums) {
        if(nums.length == 0 ) return nums ;
        merge_sort(0,nums.length -1 ,nums) ;
        return nums ;
    }
    public void merge_sort(int i , int j , int[] nums){
        if( i< j){
            int mid =( i + j ) / 2 ;
            merge_sort(i,mid,nums);
            merge_sort(mid+1,j,nums);
            merge(i,mid,j,nums) ;
        }
    }
    public void merge(int i , int mid , int j , int[] nums){
        int n1 = mid - i + 1 ;
        int n2 = j - mid ;
        int[] l = new int[n1];
        int[] r = new int[n2];
        for(int q = 0 ; q < n1 ; q++){
            l[q] = nums[q+i] ;
        }
        for(int q = 0; q < n2 ; q++){
            r[q] = nums[mid+q+1] ;
        }
        int v = 0 , b = 0 , k = i ;
        while (v < n1 && b < n2) {
            if (l[v] <= r[b]) {
                nums[k] = l[v];
                v++;
            } else {
                nums[k] = r[b];
                b++;
            }
            k++;
        }

        while (v < n1) {
            nums[k] = l[v];
            v++;
            k++;
        }

        while (b < n2) {
            nums[k] = r[b];
            b++;
            k++;
        }
        

    }
}