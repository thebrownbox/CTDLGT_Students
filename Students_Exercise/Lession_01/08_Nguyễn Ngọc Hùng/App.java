import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        ArrayList <Integer> number = new ArrayList<Integer>();
        for (int i = 0; i <= 100; i++) {
            number.add(i);
            System.out.print(number.get(i) + ",");
        }
        System.out.println(number);
        
        for (int i = 0; i <= 100; i+=2) {
            number.add(i);
            System.out.print(number.get(i)+",");
        }
    }
}
