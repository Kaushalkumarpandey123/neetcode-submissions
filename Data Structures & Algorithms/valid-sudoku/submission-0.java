class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] oneToNine = new int[9];
        
        // check for the row wise
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (oneToNine[board[i][j] - '1'] == 1) {
                        return false;
                    }
                    oneToNine[board[i][j] - '1']++;
                }
            }
            Arrays.fill(oneToNine, 0);
        }

        // check for the column wise
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[j][i] != '.') {
                    if (oneToNine[board[j][i] - '1'] == 1) {
                        return false;
                    }
                    oneToNine[board[j][i] - '1']++;
                }
            }
            Arrays.fill(oneToNine, 0);
        }

        // check for the block wise
        for (int i = 0; i < 9; i+=3) {
            for (int j = 0; j < 9; j+=3) {
                
                for (int l = 0; l < 3; l++) {
                    for (int m = 0; m < 3; m++) {
                        if (board[i + l][j + m] != '.') {
                            if (oneToNine[board[i + l][j + m] - '1'] == 1) {
                                return false;
                            }
                            oneToNine[board[i + l][j + m] - '1']++;
                        }        
                    }
                }
                Arrays.fill(oneToNine, 0);
            }
        }

        return true;
    }

}
