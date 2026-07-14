class Solution {
    Boolean[] dp = new Boolean[102];

    public boolean wordBreak(String s, List<String> wordDict) {
        return pass(s, 0, wordDict);
    }

    public boolean pass(String s, int i, List<String> wD) {
        if (i == s.length()) return true;
        if (i > s.length()) return false;

        if (dp[i] != null) return dp[i];

        for (int j = i; j < s.length(); j++) {
            String ptr = s.substring(i, j + 1);

            if (wD.contains(ptr)) {
                if (pass(s, j + 1, wD)) {
                    return dp[i] = true;
                }
            }
        }

        return dp[i] = false;
    }
}