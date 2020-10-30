import java.util.HashSet;
import java.util.Set;

public class JavaBasicCollections {

    public static void howToUseSet()
    {
        // #A.
        Set<Integer> integerSet = new HashSet<>();
        // 1. Check whether is an element exist or not
        System.out.println("integerSet.contains(1): " + integerSet.contains(1));
        // 2. Add a new element to set
        System.out.println("integerSet.add(1): " + integerSet.add(1));
        // 3. Add an already exist element to set
        System.out.println("integerSet.add(1): " + integerSet.add(1));
        // 1. Check whether is an element exist or not
        System.out.println("integerSet.contains(1): " + integerSet.contains(1));
        // 4. Tra
    }

    public static void main(String[] args) {
        howToUseSet();
    }
}
