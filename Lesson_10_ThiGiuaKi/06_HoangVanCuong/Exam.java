import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class Exam {
    public static int pivotIndex(int[] nums) {
        int result = -1;

        int sumLeft = 0;
        int sumRigth = 0;
        int curPivot = 0;

        while (curPivot < nums.length) {
            sumLeft = 0;
            sumRigth = 0;

            for (int i = 0; i < curPivot; i++) {
                sumLeft += nums[i];
            }

            for (int j = nums.length - 1; j > curPivot; j--) {
                sumRigth += nums[j];
            }

            if (sumLeft == sumRigth) {
                return curPivot;
            } else {
                curPivot++;
            }
        }

        return result;
    }

    public int minOperations(String[] logs) {
        int result = 0;

        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (result < 0) {
                    result--;
                }
            } else if (logs[i].equals("./")) {
                //do nothing
            } else {
                result++;
            }
        }

        return Math.max(result, 0);
    }

    public int numIdenticalPairs(int[] nums) {
        int result = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    result++;
                }
            }
        }

        return result;
    }

    public static boolean isHappy(int n) {

        if (n < 0) {
            return false;
        }

        int sum = 0;

        Stack<Integer> nums = new Stack<>();

        while (n > 0) {
            nums.push(n % 10);
            n = n / 10;
        }

        while (!nums.isEmpty()) {
            sum += nums.peek() * nums.peek();
            nums.pop();
        }

        System.out.println(sum);

        if (sum == 1) {
            return true;
        } else if (sum == 42) {
            return false;
        }

        return isHappy(sum);
    }

    public boolean isValidSudoku(char[][] board) {

        Set<Character> mySet = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!mySet.contains(board[i][j])) {
                        mySet.add(board[i][j]);
                    } else {
                        return false;
                    }
                }
            }
            mySet.clear();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!mySet.contains(board[j][i])) {
                        mySet.add(board[j][i]);
                    } else {
                        return false;
                    }
                }
            }
            mySet.clear();
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != '.') {
                    if (!mySet.contains(board[i][j])) {
                        mySet.add(board[i][j]);
                    } else {
                        return false;
                    }
                }
            }
            if (i != 0 && i % 3 == 0){
                mySet.clear();
            }
        }

        mySet.clear();

        for (int i = 0; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                if (board[i][j] != '.') {
                    if (!mySet.contains(board[i][j])) {
                        mySet.add(board[i][j]);
                    } else {
                        return false;
                    }
                }
            }
            if (i != 0 && i % 3 == 0){
                mySet.clear();
            }
        }

        mySet.clear();

        for (int i = 0; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                if (board[i][j] != '.') {
                    if (!mySet.contains(board[i][j])) {
                        mySet.add(board[i][j]);
                    } else {
                        return false;
                    }
                }
            }
            if (i != 0 && i % 3 == 0){
                mySet.clear();
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Character myChar = 'a';
        char myChar2 = 'a';

        System.out.println(myChar == myChar2);
    }
}
