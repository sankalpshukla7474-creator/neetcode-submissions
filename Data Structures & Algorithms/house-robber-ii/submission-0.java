class Solution {
    int[] dp1 = new int[101] ;
    int[] dp2 = new int[101] ;
    public int rob(int[] nums) {
        int n = nums.length ;
        if(n == 0) return 0;
        Arrays.fill(dp1,-1) ;
        int first =  broke(nums,n-1) ;
        Arrays.fill(dp2,-1) ;
        int second = brok(nums,n-2) ;
        return Math.max(first,second) ;
    }
    public int broke(int[] nums , int i ){
        if(i <= 0) return 0 ;
        if(dp1[i] != -1) return dp1[i] ;
        int a = nums[i] + broke(nums,i-2) ;
        int b = broke(nums,i-1) ;
        return dp1[i] = Math.max(a,b) ; 
    }
    public int brok(int[] nums , int i ){
        if(i < 0) return 0 ;
        if(dp2[i] != -1) return dp2[i] ;
        int a = nums[i] + brok(nums,i-2) ;
        int b = brok(nums,i-1) ;
        return dp2[i] = Math.max(a,b) ; 
    }
}
