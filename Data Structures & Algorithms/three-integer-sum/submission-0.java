class Solution {
    List<List<Integer>> ls ;
    public List<List<Integer>> threeSum(int[] n) {
       ls = new ArrayList<>();
       Arrays.sort(n);
       for(int i = 0 ; i < n.length-2 ; i++){
          if(i != 0 && n[i]==n[i-1]){
            continue;
          }
          two_sum(-1*n[i] , n , i);
       } 
       return ls ;
    }
    public void two_sum(int tar , int[] arr , int j){
        int l = j+1 ; int r = arr.length-1;
        while(l < r){
            if(arr[l] + arr[r] > tar){
                r--;
            }
            else if(arr[l] + arr[r] < tar){
                l++;
            }
            else{
                while(l < r && arr[l] == arr[l+1]){
                    l++;
                }
                while(r > l && arr[r] == arr[r-1]){
                    r--;
                }
                List<Integer> ps = new ArrayList<>();
                ps.add(arr[j]); ps.add(arr[l]) ; ps.add(arr[r]);
                ls.add(ps);
                l++;r--;
            }
        }
        return;
    }
}