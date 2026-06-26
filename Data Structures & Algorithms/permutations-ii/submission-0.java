class Solution {
    List<List<Integer>> ls;

    public List<List<Integer>> permuteUnique(int[] nums) {
        ls = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] used = new boolean[nums.length];
        check(new ArrayList<>(), nums, used);
        return ls;
    }

    public void check(List<Integer> ps, int[] nums, boolean[] used) {
        if (ps.size() == nums.length) {
            ls.add(new ArrayList<>(ps));
            return;
        }

        for (int j = 0; j < nums.length; j++) {
            if (used[j]) continue;
            if (j > 0 && nums[j] == nums[j - 1] && !used[j - 1]) continue;

            used[j] = true;
            ps.add(nums[j]);
            check(ps, nums, used);
            ps.remove(ps.size() - 1);
            used[j] = false;
        }
    }
}
