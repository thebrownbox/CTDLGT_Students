package binary_search;

public class _70_Climbing_Stairs {

    static int[] temp = new int[46];

    public static int climbStairs(int n) {

        for (int i = 0; i < temp.length; i++) {
            temp[i] = 0;
        }

        temp[1] = 1;
        temp[2] = 2;

        if (n == 1)
            return 1;

        int i = n;

        return myclimbStairs(n, i);

    }

    public static int myclimbStairs(int n, int i) {

        int result = 0;

        if (i == 1) {
            return 1;
        } else if (i == 2) {
            return 2;
        } else {
            if (temp[i] == 0) {
                result = myclimbStairs(n, i - 1) + myclimbStairs(n, i - 2);
                temp[i] = result;
                return result;
            } else {
                result = temp[i - 1] + temp[i - 2];
                return result;
            }
        }

    }

    public static void main(String[] args) {
        System.out.println(climbStairs(4));
    }

}
