package finalexam;

public class Duy_LeetCode_1672 {
    public int maximumWealth(int[][] accounts) {
        int res = 0;
        for (int[] account : accounts) {
            int asset = 0;
            for (int i = 0; i < account.length; i++) {
                asset += account[i];
            }

            res = Math.max(res, asset);
        }
        return res;
    }


}
