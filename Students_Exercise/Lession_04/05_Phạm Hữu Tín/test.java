import java.util.Scanner;
public class test {
    public static int sumOfArray(int [] a , int i) {
		if (i == 1) return a[0];
        int t = a[i - 1] + sumOfArray(a, i - 1);
	    return t;
	}

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println(" số phần tử trong mảng " + n);
		int[] a = new int[n];
		for(int i=0;i<n;i++) {
			a[i] = sc.nextInt();
		}
		//int []a = {1, 2, 3, 4, 5, 6, 7};
		System.out.print(sumOfArray(a, n));
	}
    
}
