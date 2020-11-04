/**
 * DeQuy
 */
public class DeQuy {

    private static void F(String s, int i) {
        System.out.println(s.charAt(i));

        F(s,i+1);

    }

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        String s = "1234";
        F(s, 0);
    }
}