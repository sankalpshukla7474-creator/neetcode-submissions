class Solution {
    public boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = 0;
        for (int x : nums) sum += x;

        if (sum % k != 0) return false;

        int tar = sum / k;
        boolean[] used = new boolean[nums.length];

        return check(nums, k, tar, 0, 0, used);
    }

    public boolean check(int[] nums, int k, int tar, int res, int start, boolean[] used) {
        if (k == 1) return true;

        if (res == tar)
            return check(nums, k - 1, tar, 0, 0, used);

        for (int i = start; i < nums.length; i++) {
            if (used[i] || res + nums[i] > tar) continue;

            used[i] = true;
            if (check(nums, k, tar, res + nums[i], i + 1, used))
                return true;
            used[i] = false;
        }

        return false;
    }
}
