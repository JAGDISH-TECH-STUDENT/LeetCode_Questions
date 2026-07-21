class Solution {
    public boolean isValidSudoku(char[][] board) {
       
        for (int i = 0; i < 9; i++) {
            Set<Character> rowSet = new HashSet<>();
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c != '.') {
                    if (rowSet.contains(c)) return false;
                    rowSet.add(c);
                }
            }
        }

    
        for (int j = 0; j < 9; j++) {
            Set<Character> colSet = new HashSet<>();
            for (int i = 0; i < 9; i++) {
                char c = board[i][j];
                if (c != '.') {
                    if (colSet.contains(c)) return false;
                    colSet.add(c);
                }
            }
        }

        for (int boxRow = 0; boxRow < 3; boxRow++) {
            for (int boxCol = 0; boxCol < 3; boxCol++) {
                Set<Character> boxSet = new HashSet<>();
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        char c = board[boxRow * 3 + i][boxCol * 3 + j];
                        if (c != '.') {
                            if (boxSet.contains(c)) return false;
                            boxSet.add(c);
                        }
                    }
                }
            }
        }

        return true;
    }
}
