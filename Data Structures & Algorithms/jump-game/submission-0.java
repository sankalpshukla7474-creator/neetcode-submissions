class Solution {
    Boolean[] dp = new Boolean[1001] ;
    public boolean canJump(int[] nums) {
        Arrays.fill(dp,null) ;
        return pass(nums, 0);
    }

    private boolean pass(int[] nums, int i) {
        if (i >= nums.length - 1) {
            return true;
        }
        if(dp[i] != null) return dp[i] ;
        for (int jump = 1; jump <= nums[i]; jump++) {
            if (pass(nums, i + jump)) {
                return true;
            }
        }

        return dp[i] = false;
    }
}