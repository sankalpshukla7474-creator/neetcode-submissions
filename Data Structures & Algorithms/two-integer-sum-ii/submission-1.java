class Solution {
    public int[] twoSum(int[] num, int target) {
        int[] arr = new int[2];
        for(int i = 0 ; i < num.length ; i++){
            for(int j = i+1 ; j < num.length ; j++){
                if(num[i]+num[j] == target){
                    arr[0] = i+1 ;
                    arr[1] = j+1 ;
                    return arr ;
                }
            }
        }
        return arr ;
    }
}
