class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int range = 0;

        for (int num : nums) {
            range += num;
        }

        if (Math.abs(target) > range) {
            return 0;
        }

        if ((range + target) % 2 != 0) {
            return 0;
        }

        int tar = (range + target) / 2;
        Integer[][] memo = new Integer[nums.length][tar + 1];

        return countSubsets(nums, tar, 0, memo);
    }

    private int countSubsets(
        int[] nums,
        int tar,
        int index,
        Integer[][] memo
    ) {
        if (index == nums.length) {
            return tar == 0 ? 1 : 0;
        }

        if (memo[index][tar] != null) {
            return memo[index][tar];
        }

        int skip = countSubsets(nums, tar, index + 1, memo);
        int take = 0;

        if (nums[index] <= tar) {
            take = countSubsets(
                nums,
                tar - nums[index],
                index + 1,
                memo
            );
        }

        return memo[index][tar] = take + skip;
    }
}