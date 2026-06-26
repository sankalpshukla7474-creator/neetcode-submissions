class Solution {
    public boolean isValidSudoku(char[][] b) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            Set<Integer> row = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = b[i][j];
                if (c == '.') continue;  // skip empty
                int val = c - '0';
                if (val < 1 || val > 9 || !row.add(val)) return false;
            }
        }

        // Check columns
        for (int i = 0; i < 9; i++) {
            Set<Integer> col = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = b[j][i];
                if (c == '.') continue;
                int val = c - '0';
                if (val < 1 || val > 9 || !col.add(val)) return false;
            }
        }

        // Check 3x3 sub-boxes
        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                Set<Integer> box = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = b[boxRow*3 + i][boxCol*3 + j];
                        if (c == '.') continue;
                        int val = c - '0';
                        if (val < 1 || val > 9 || !box.add(val)) return false;
                    }
                }
            }
        }

        return true; // valid Sudoku
    }
}
