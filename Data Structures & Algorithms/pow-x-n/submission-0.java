class Solution {
    int MOD = 1000000008 ;
    public double myPow(double x, int n) {
        if(n == 0) return 1 ;
        if(n > 0){
            return pass(x,n) ;
        }
        else{
            return pass(1/x,n) ;
        }
    }
    public double pass(double x , int n){
        if(n == 0) return 1 ;
        double a = (pass(x,n/2))%MOD ;
        if(n % 2 == 0){
            return (a*a) % MOD ;
        }
        else{
            return ((a*a) % MOD * x ) % MOD ;
        }
    }
}
