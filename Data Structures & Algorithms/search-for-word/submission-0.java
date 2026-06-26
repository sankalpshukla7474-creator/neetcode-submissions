class Solution {
    int l , m , n ;
    int[][] dir = {{0,1},{0,-1},{1,0},{-1,0}} ;

    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        l = word.length();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0) && find(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean find(char[][] b, int i, int j, String w, int idx) {

        // If full word matched
        if (idx == l) return true;

        // Out of bounds or mismatch
        if (i < 0 || i >= m || j < 0 || j >= n || b[i][j] != w.charAt(idx)) {
            return false;
        }

        // Save original char and mark visited
        char original = b[i][j];
        b[i][j] = '#'; // mark visited

        // Explore neighbors
        for (int[] d : dir) {
            int i_ = i + d[0];
            int j_ = j + d[1];

            if (find(b, i_, j_, w, idx + 1)) {
                b[i][j] = original; // restore before returning
                return true;
            }
        }

        // Backtrack → restore
        b[i][j] = original;
        return false;
    }
}
