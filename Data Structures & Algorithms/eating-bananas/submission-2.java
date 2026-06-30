class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 , high = 0 , ans = -1 ;
        for(int x : piles){
            //low = Math.max(low,x) ;
            high += x ;
        }
        while(low <= high){
            int mid = low + (high-low) / 2 ;
            int test = find(piles,mid) ;
            if(test <= h){
                ans = mid ;
                high = mid - 1;
            }
            else{
                low = mid + 1 ;
            }
        }
        return ans ;
    }
    public int find(int[] piles , int max){
        int sum = 0 ;
        for(int x : piles){
            sum += (x+max-1) / max;
        }
        return sum ;
    }
}
