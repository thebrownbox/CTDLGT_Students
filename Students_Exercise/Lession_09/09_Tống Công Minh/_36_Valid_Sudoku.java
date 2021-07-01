
public class _36_Valid_Sudoku {

    public static boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {

                if (board[i][j] != '.') {
                    // Check valid data
                    if (board[i][j] > '9' || board[i][j] < '1'){
                        return false;
                    }
                    // Check ngang
                    for (int k = j + 1; k < 9; k++) {
                        if (board[i][k] == board[i][j]) return false;
                    }

                    // Check doc
                    for (int k = i + 1; k < 9; k++) {
                        if (board[k][j] == board[i][j]) return false;
                    }

                    // Check trong o vuong
                    int rowBox = (i / 3);
                    int colBox = (j / 3);
                    for (int k = 0; k < 3; k++) {
                        for (int l = 0; l < 3; l++) {
                            int tempr = rowBox*3 + k;
                            int tempc = colBox*3 + l;
                            if (tempr != i && tempc != j) {
                                if (board[tempr][tempc] == board[i][j]) return false;
                            }
                        }
                    }
                }
             }
        }

        return true;
    }


    public static void main(String[] args) {
        char[][] board = {{'8','3','.','.','7','.','.','.','.'}
                        ,{'6','.','.','1','9','5','.','.','.'}
                        ,{'.','9','8','.','.','.','.','6','.'}
                        ,{'8','.','.','.','6','.','.','.','3'}
                        ,{'4','.','.','8','.','3','.','.','1'}
                        ,{'7','.','.','.','2','.','.','.','6'}
                        ,{'.','6','.','.','.','.','2','8','.'}
                        ,{'.','.','.','4','1','9','.','.','5'}
                        ,{'.','.','.','.','8','.','.','7','9'}};

        System.out.println(isValidSudoku(board));
        for (int i = 0; i < 9; i++) {
            System.out.println(i/3);
        }
    }
}
