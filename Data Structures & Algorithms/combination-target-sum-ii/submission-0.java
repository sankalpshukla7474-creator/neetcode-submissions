class Solution {
    List<List<Integer>> ls;

    public List<List<Integer>> combinationSum2(int[] can, int target) {
        Arrays.sort(can);                
        ls = new ArrayList<>();
        check(can, target, new ArrayList<>(), 0);
        return ls;
    }

    public void check(int[] can, int tar, List<Integer> ps, int i) {
        if (tar == 0) {
            ls.add(new ArrayList<>(ps));
            return;
        }

        if (i >= can.length || tar < 0) return;
        for (int idx = i; idx < can.length; idx++) {
            if (idx > i && can[idx] == can[idx - 1]) continue;

            ps.add(can[idx]);
            check(can, tar - can[idx], ps, idx + 1);
            ps.remove(ps.size() - 1);
        }
    }
}
