


class _36_Valid_Sudoku {
    public boolean isRowValid(char[][] a, int iRow)
    {
        boolean[] isExist = new boolean[10];
        for (int j = 0; j < 9; j++) {
            char c = a[iRow][j];
            if(c <= '9' && c >= '0'){
                int k = c - '0';
                if(isExist[k] == false){
                    isExist[k] = true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isColValid(char[][] a, int jCol)
    {
        boolean[] isExist = new boolean[10];
        for (int i = 0; i < 9; i++) {
            char c = a[i][jCol];
            if(c <= '9' && c >= '0'){
                int k = c - '0';
                if(isExist[k] == false){
                    isExist[k] = true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isBlockValid(char[][] a, int iRow, int jCol)
    {
        boolean[] isExist = new boolean[10];
        for (int i = iRow; i < iRow+3 ; i++) {
            for (int j = jCol; j < jCol + 3; j++) {
                char c = a[i][j];
                if(c <= '9' && c >= '0'){
                    int k = c - '0';
                    if(isExist[k] == false){
                        isExist[k] = true;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if(isRowValid(board, i) == false)
                return false;
            if(isColValid(board, i) == false)
                return false;
        }

        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j+=3) {
                if(isBlockValid(board, i, j) == false)
                    return  false;
            }
        }

        return true;
    }
}