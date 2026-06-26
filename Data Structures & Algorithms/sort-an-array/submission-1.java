class Solution {
    public int[] sortArray(int[] nums) {
       merge(0,nums.length-1,nums) ;
       return nums ; 
    }
    public void merge(int p , int q , int[]nums){
            if(p >= q) return ;
            int m = (p + q) / 2 ;
            merge(p,m,nums);
            merge(m+1,q,nums);
            merge_sort(p,m,q,nums);
    }
    public void merge_sort(int p , int m , int q , int[] nums){
        int n1 = m-p+1 ;
        int n2 = q-m ;
        int[] l = new int[n1];
        int[] r = new int[n2] ;
        for(int i = 0 ; i < n1 ; i++){
            l[i] = nums[p+i];
        }
        for(int i = 0 ; i < n2 ; i++){
            r[i] = nums[m+i+1];
        }
        int i = 0 , j = 0 , k = p ;
        while (i < n1 && j < n2) {
            if (l[i] <= r[j]) nums[k++] = l[i++];
            else nums[k++] = r[j++];
        }

        while (i < n1) nums[k++] = l[i++];
        while (j < n2) nums[k++] = r[j++];
    }
}