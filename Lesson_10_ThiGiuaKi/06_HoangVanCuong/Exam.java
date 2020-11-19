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
        } else if (sum == 42){
            return false;
        }

        return isHappy(sum);
    }

    public boolean isValidSudoku(char[][] board) {
        Stack<Character> myStack = new Stack<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                myStack.push(board[i][j]);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(2));
    }
}
