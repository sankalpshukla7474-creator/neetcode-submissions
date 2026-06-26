class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> ls = new ArrayList<>();
        int l = 0 , r = arr.length - 1 ;
        while((r-l+1) != k){
            if(Math.abs(arr[l]-x) > Math.abs(arr[r]-x)){
                l++;
            }
            else{
                r--;
            }
        }
        for(int p = l ; p <= r ; p++){
            ls.add(arr[p]);
        }
        return ls ;
    }
}