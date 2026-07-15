class Solution {
    int[] dp;

    public int jump(int[] nums) {
        dp = new int[nums.length];
        Arrays.fill(dp, -1);

        return pass(nums, 0);
    }

    private int pass(int[] nums, int idx) {
        if (idx >= nums.length - 1) {
            return 0;
        }

        if (dp[idx] != -1) {
            return dp[idx];
        }

        int min = Integer.MAX_VALUE;

        for (int jump = 1; jump <= nums[idx]; jump++) {
            int result = pass(nums, idx + jump);

            if (result != Integer.MAX_VALUE) {
                min = Math.min(min, 1 + result);
            }
        }

        return dp[idx] = min;
    }
}