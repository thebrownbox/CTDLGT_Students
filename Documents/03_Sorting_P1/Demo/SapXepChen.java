public class SapXepChen {


    public static void chen(int index, int dau, int cuoi, int[] a){
        int temp = a[index];
        for (int i = cuoi; i >= dau; i--) {
            if(a[i] > temp){
                a[i+1] = a[i];
            }else{ // a[i] <= temp
                a[i+1] = temp;
                return;
            }
        }
        a[dau] = temp;
    }

    public static void sapXepNoiBot(int[] a)
    {
            // Di tu dau den cuoi, gap 2 phan tu canh nhau, 
            // ma ko dung thu tu
            // Thi doi cho
        // Lap lai n-1 lan
        for (int k = 0; k < a.length-1; k++) {
            for (int i = 0; i < a.length-1; i++) {
                if(a[i] > a[i+1]){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
    }

    public static void sapXepChon(int[] a)
    {
        // 
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                
            }
        }
    }


    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int n = a.length;

        // for (int i = 1; i < n; i++) {
        //     chen(i, 0, i-1, a);
        // }

        sapXepNoiBot(a);

        for (int ai : a) {
            System.out.print(ai + " ");
        }
    }
}
