class Solution {
    public int[] twoSum(int[] num, int target) {
        int i = 0 , j = num.length - 1 ; 
        int[] arr = new int[2] ;
        while(i < j){
            int sum = num[i] + num[j] ;
            if(sum == target){
                arr[0] = i+1 ;
                arr[1] = j+1 ;
                return arr ;
            }
            else if(sum > target){
                j-- ;
            }
            else{
                i++ ;
            }
        }
        return arr ;
    }
}
