class Solution {
    public boolean checkNumber(char a){
        boolean check = true;
        try{
            int number = Integer.parseInt(""+a);
        }catch(Exception e){
            check = false;
        }
        return check;
    }
    
    public boolean checkRow(char[][] board){
        boolean check = true;
        for (int i=0; i<board.length; i++){
            boolean[] checkArr = new boolean[9];
            for (int j=0; j<board[i].length; j++){
                if (checkNumber(board[i][j])){
                    if (!checkArr[Integer.parseInt(""+board[i][j]) - 1]){
                        checkArr[Integer.parseInt(""+board[i][j]) - 1] = true;
                    }
                    else{
                        check = false;
                        break;
                    }
                }
            }
            if (!check){
                break;
            }
        }
        return check;
    }
    
    public boolean checkColumn(char[][] board){
        boolean check = true;
        for (int i=0; i<board.length; i++){
            boolean[] checkArr = new boolean[9];
            for (int j=0; j<board[i].length; j++){
                if (checkNumber(board[j][i])){
                    if (!checkArr[Integer.parseInt(""+board[j][i]) - 1]){
                        checkArr[Integer.parseInt(""+board[j][i]) - 1] = true;
                    }
                    else{
                        check = false;
                        break;
                    }
                }
            }
            if (!check){
                break;
            }
        }
        return check;
    }
    
    public boolean makeAndCheckSquare(char[][] board){
        boolean check = true;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (!makeSquare(board, i, j)){
                    check = false;
                    break;
                }
            }
            if (!check){
                break;
            }
        }
        return check;
    }
    
    public boolean makeSquare(char[][] board, int pos_i, int pos_j){
        char[][] smallArr = new char[3][3];
        for (int i=pos_i*3; i<pos_i*3+3; i++){
            for (int j=pos_j*3; j<pos_j*3+3; j++){
                smallArr[i-pos_i*3][j-pos_j*3] = board[i][j];
            }
        }
        return checkSquare(smallArr);
    }
    
    public boolean checkSquare(char[][] arr){
        boolean[] checkArr = new boolean[9];
        boolean check = true;
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (checkNumber(arr[i][j])){
                    if (!checkArr[Integer.parseInt(""+arr[i][j]) - 1]){
                        checkArr[Integer.parseInt(""+arr[i][j]) - 1] = true;
                    }
                    else{
                        check = false;
                        break;
                    }
                }
            }
            if (!check){
                break;
            }
        }
        return check;
    }
    
    public boolean isValidSudoku(char[][] board) {
        if (checkRow(board) && checkColumn(board) && makeAndCheckSquare(board)){
            return true;
        }
        return false;
    }
}