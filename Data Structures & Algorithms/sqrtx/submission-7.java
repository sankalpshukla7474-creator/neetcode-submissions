class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1) return x ;
        int i = 1 , j = x/2 ;
        while(i<=j){
            int mid = i + (j-i)/ 2;
            long c = (long)mid*mid;
            if(c==x) return mid ;
            else if (c > x) j = mid - 1 ;
            else i = mid + 1 ;
        }
        return j ; 
    }
}