public class Sample {
    
    // Viet ham print, in lan luot cac phan tu cua mang a[]
    // Su dung de quy
    public static void Print1(int[] a, int i){
        if(i >= a.length || i < 0){
            return;
        }
        System.out.print(a[i] + " ");
        Print1(a, i+1);
    }

    public static void Print(int[] a, int i){
        if(i >= a.length || i < 0){
            return;
        }
        Print(a, i+1);
        System.out.print(a[i] + " ");
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};    
        Print(a, 0);
    }

}
