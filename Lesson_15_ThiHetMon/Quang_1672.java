package FinalTest;

public class Quang_1672 {
    public static int maximumWealth(int[][] accounts) {
        int[] sums = new int[accounts.length];
        for(int i=0;i<sums.length;i++){
            for(int j=0;j<accounts[i].length;j++)
                sums[i]+=accounts[i][j];
        }
        int max = sums[0];
        for(int i=1;i<sums.length;i++){
            if(sums[i]>=max)
                max = sums[i];
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
}
