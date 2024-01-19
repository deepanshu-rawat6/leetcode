class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String check = "(" + board[i][j] + ")";
                    if (!set.add(check + i) || !set.add(j + check) || !set.add(i/3 + check + j /3)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}