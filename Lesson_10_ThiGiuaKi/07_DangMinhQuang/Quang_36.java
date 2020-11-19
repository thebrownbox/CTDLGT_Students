package lesson10;

public class Quang_36 {
    public static void main(String[] args) {
        char[][] board = {
                            {'4','5','6','.','1','2','9','.','.'},
                            {'1','2','3','4','.','.','.','.','.'},
                            {'9','7','2','.','.','5','8','.','.'},
                            {'8','6','1','5','.','6','7','.','.'},
                            {'2','1','4','6','2','8','.','.','5'},
                            {'5','7','2','.','.','5','8','.','.'},
                            {'6','4','2','.','.','6','5','.','.'},
                            {'2','.','2','.','.','.','.','.','.'},
                            {'.','.','.','.','.','2','3','.','.'},
        };

        System.out.println(isValidSudoku(board));


    }


    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (!valid(board, i, j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static  boolean valid(char[][] board, int r, int c) {
        if (board[r][c] == '.') {
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if (j != c && board[r][j] == board[r][c]) {
                return false;
            }
        }
        for (int i = 0; i < board.length; i++) {
            if (i != r && board[i][c] == board[r][c]) {
                return false;
            }
        }
        int smi = r / 3 * 3;
        int smj = c / 3 * 3;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((smi + i != r && smj + j != c) && board[smi + i][smj + j] == board[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

}



