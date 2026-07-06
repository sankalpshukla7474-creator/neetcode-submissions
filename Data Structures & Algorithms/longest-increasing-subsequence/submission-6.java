class Solution {
    int[][] dp;

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) return 0;

        dp = new int[nums.length][nums.length + 1];

        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return pass(nums, 0, -1);
    }

    public int pass(int[] nums, int i, int prev) {
        if (i == nums.length) return 0;

        if (dp[i][prev + 1] != -1) {
            return dp[i][prev + 1];
        }

        int take = 0;

        int not = pass(nums, i + 1, prev);

        if (prev == -1 || nums[i] > nums[prev]) {
            take = 1 + pass(nums, i + 1, i);
        }

        return dp[i][prev + 1] = Math.max(take, not);
    }
}