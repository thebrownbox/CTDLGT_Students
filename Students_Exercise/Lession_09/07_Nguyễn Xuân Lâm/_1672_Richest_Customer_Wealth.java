public class _1672_Richest_Customer_Wealth {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int max = 0;
        int n = accounts.length;
        for(int i=0; i<n; i++){
            sum = 0;
            for(int j=0; j<accounts[i].length; j++){
                sum += accounts[i][j];
            }
            if(max < sum) max = sum;
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] arr = new int[4][3];
        System.out.println(arr[0].length);
    }
}
