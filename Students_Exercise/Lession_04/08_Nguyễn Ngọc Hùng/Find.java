public class Find {
    public static int find(int x, int[] a, int i) {
        // Co van de
        int temp = 0;
        if (i == 0) {
            if (temp == 0) {
                return -1;
            }else{

            }
        } else {
            if (a[i] == x) {
                temp = i;
            } else {
                return find(x, a, i - 1);
            }
        }
        
        return temp;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5, 10, 7, 8, 9 };
        int i = a.length - 1;
        System.out.println(find(10, a, i));
    }
}
