class Solution {
    public int maxArea(int[] h) {
       int max = Integer.MIN_VALUE ;
       for(int i = 0 ; i < h.length ; i++){
            for(int j = i+1 ; j < h.length ; j++){
                int c = Math.min(h[i],h[j]);
                max = Math.max(max,(j-i)*c);
            }
       }  
       return max ;
    }
}
