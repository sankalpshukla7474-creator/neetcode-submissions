class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m] ;
        int k = 0 ;
        for(int i = 0 ; i < nums1.length ; i++){
            if(nums1[i] != 0){
                arr[k] = nums1[i] ;
                k++ ;
            }
        }
        Arrays.sort(arr) ;
        int i = 0 , j = 0 ;
        int u = 0 ;
        while(i < arr.length && j < nums2.length){
            if(arr[i] <= nums2[j]){
                nums1[u] = arr[i] ;
                u++;i++;
            }
            else{
                nums1[u] = nums2[j] ;
                u++ ; j++ ;
            }
        }
        while(i < arr.length ){
            nums1[u] = arr[i] ;
            u++;i++;
        }
        while(j < nums2.length){
            nums1[u] = nums2[j] ;
            u++ ; j++ ;
        }
    }
}