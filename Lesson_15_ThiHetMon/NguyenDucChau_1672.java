package Final;

public class NguyenDucChau_1672 {
    public static int maximumWealth(int[][] a) {
        int result = 0;
        int n = a.length;
        for (int []account : a){
           int sum1 = 0;
            for (int j = 0; j < account.length; j++) {
                sum1+= account[j];
            }
            result = Math.max(sum1, result);

        }
        return result;
    }
    public static void main(String[] args) {
        int[][] a = {{1,5},{7,3},{3,5}};
        System.out.println(maximumWealth(a));
    }

}
