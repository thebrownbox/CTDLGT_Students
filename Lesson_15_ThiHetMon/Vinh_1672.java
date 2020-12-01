public class Vinh_1672 {

    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < accounts.length; i++) {
            int res = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                res += accounts[i][j];
                max = Math.max(max, res);
            }
        }
        return max;
    }

}
