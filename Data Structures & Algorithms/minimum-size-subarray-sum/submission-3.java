class Solution {
    public int minSubArrayLen(int t, int[] n) {
      int min = Integer.MAX_VALUE ;
      int i = 0 , j = 0 , sum = 0 ;
       while(j < n.length){
          if(sum < t){
             sum += n[j] ;
             j++;
            }
            while(sum >= t){
                min = Math.min(min,j-i);
                sum -= n[i] ;
                i++;
            }
        }
        return min==2147483647 ? 0 : min ;
    }
}