class Solution {
    public boolean isInterleave(String s1, String s2, String s3) {
        if (s1.length() + s2.length() != s3.length()) {
            return false;
        }

        return pass(0, 0, s1, s2, s3);
    }

    public boolean pass(int i, int j, String s1, String s2, String s3) {
        int k = i + j;

        if (k == s3.length()) {
            return i == s1.length() && j == s2.length();
        }

        boolean result = false;

        if (i < s1.length() && s1.charAt(i) == s3.charAt(k)) {
            result = pass(i + 1, j, s1, s2, s3);
        }

        if (!result && j < s2.length() && s2.charAt(j) == s3.charAt(k)) {
            result = pass(i, j + 1, s1, s2, s3);
        }

        return result;
    }
}