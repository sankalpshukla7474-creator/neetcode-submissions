class Solution {
    public int numDistinct(String s, String t) {
        if (t.length() == 0) return 1;
        int[][] dp = new int[s.length()+1][t.length()+1] ;
        for(int i = 0 ; i < dp.length ; i++){
            Arrays.fill(dp[i],-1) ;
        }
        return ans(s, t, 0, 0,dp);
    }

    public int ans(String s, String t, int i, int j,int[][] dp) {
        if (j == t.length()) return 1;
        if (i == s.length()) return 0;
        if(dp[i][j] != -1) return dp[i][j] ;
        int take = 0;
        int not = ans(s, t, i + 1, j,dp);

        if (s.charAt(i) == t.charAt(j)) {
            take = ans(s, t, i + 1, j + 1,dp);
        }

        return dp[i][j] = take + not;
    }
}