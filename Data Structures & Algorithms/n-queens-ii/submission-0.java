class Solution {
    int w = 0 ;
    private List<List<String>> res = new ArrayList<>();
    public int totalNQueens(int n) {
        if (n == 0) return 0;

        List<String> board = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) sb.append('.');
            board.add(sb.toString());
        }

        solve(board, 0, n);
        return w;
    }
    public void solve(List<String> board, int row, int n) {
        if (row == n) {
            w++;
            return;
        }

        for (int col = 0; col < n; col++) {
            if (isValid(board, row, col)) {
                StringBuilder sb = new StringBuilder(board.get(row));
                sb.setCharAt(col, 'Q');
                board.set(row, sb.toString());

                solve(board, row + 1, n);

                sb.setCharAt(col, '.');
                board.set(row, sb.toString());
            }
        }
    }
        private boolean isValid(List<String> board, int row, int col) {
        for (int i = row - 1; i >= 0; i--) {
            if (board.get(i).charAt(col) == 'Q') return false;
        }

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board.get(i).charAt(j) == 'Q') return false;
        }

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.size(); i--, j++) {
            if (board.get(i).charAt(j) == 'Q') return false;
        }

        return true;
    }
    
}