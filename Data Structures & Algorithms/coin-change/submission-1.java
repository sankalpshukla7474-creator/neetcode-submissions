class Solution {
    int[][] dp;

    public int coinChange(int[] coins, int amount) {
        int n = coins.length;
        dp = new int[n][amount + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -2);
        }

        int ans = solve(coins, amount, n - 1);

        return ans >= 1_000_000_000 ? -1 : ans;
    }

    private int solve(int[] coins, int sum, int i) {
        if (sum == 0) return 0;
        if (sum < 0 || i < 0) return 1_000_000_000;

        if (dp[i][sum] != -2) return dp[i][sum];

        int take = 1 + solve(coins, sum - coins[i], i);
        int skip = solve(coins, sum, i - 1);

        return dp[i][sum] = Math.min(take, skip);
    }
}