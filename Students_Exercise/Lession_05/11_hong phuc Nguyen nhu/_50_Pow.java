// package lab1.CTDLGT_Students.Students_Exercise.Lession_05.11_hong phuc Nguyen nhu;

public class _50_Pow {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return x;
        }
        double t = x * myPow(x, n-1);
        return t;
    }
    public static void main(String[] args) {
        double x = 2.00000;
        int n = 2;
        myPow(x, n);
    }
}
