
public class _1672_Richest_Customer_Wealth {

    public int maximumWealth(int[][] accounts) {

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < accounts.length; i++) {
            int sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                sum+=accounts[i][j];
            }
            if (sum > max) max = sum;
        }

        return max;
    }

    public static void main(String[] args) {

    }
}
