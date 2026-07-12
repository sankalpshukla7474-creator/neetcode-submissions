class Solution {
    public int numDistinct(String s, String t) {
        if (t.length() == 0) return 1;
        return ans(s, t, 0, 0);
    }

    public int ans(String s, String t, int i, int j) {
        if (j == t.length()) return 1;
        if (i == s.length()) return 0;

        int take = 0;
        int not = ans(s, t, i + 1, j);

        if (s.charAt(i) == t.charAt(j)) {
            take = ans(s, t, i + 1, j + 1);
        }

        return take + not;
    }
}