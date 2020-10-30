import java.util.*;

public class JavaBasicCollections {

    public static void howToUseMap()
    {
        Map<String, Integer> countStringMap = new HashMap<>(); //TreeMap<>(); //
        // 1. Check whether string is exist or not
        System.out.println("countStringMap.containsKey(\"Hello\"): " + countStringMap.containsKey("Hello"));

        // 2. Add element to map
        System.out.println("countStringMap.put(\"Hello\", 1): " + countStringMap.put("Hello", 1));
        System.out.println("countStringMap.put(\"Hello\", 2): " + countStringMap.put("Hello", 2));
        System.out.println("countStringMap.put(\"Hello\", 3): " + countStringMap.put("Hello", 3));

        // 3. Check number element of map
        System.out.println("countStringMap.size(): " + countStringMap.size());

        // 1. Check whether string is exist or not
        System.out.println("countStringMap.containsKey(\"Hello\"): " + countStringMap.containsKey("Hello"));

        // 4. Iterate/Loop a map
        countStringMap.put("C", 0);
        countStringMap.put("A", 0);
        countStringMap.put("B", 0);
        for (Map.Entry e : countStringMap.entrySet()) {
            System.out.println(" <"+e.getKey() + " : " + e.getValue() + ">" );
        }
    }

    public static void howToUseSet()
    {
        Set<Integer> integerSet = new HashSet<>(); //new TreeSet<>();
        // 1. Check whether is an element exist or not
        System.out.println("integerSet.contains(1): " + integerSet.contains(1));

        // 2. Add a new element to set
        System.out.println("integerSet.add(1): " + integerSet.add(1));

        // 3. Add an already exist element to set
        System.out.println("integerSet.add(1): " + integerSet.add(1));

        // 1. Check whether is an element exist or not
        System.out.println("integerSet.contains(1): " + integerSet.contains(1));

        // 4. Iterate a set
        integerSet.add(-2);
        integerSet.add(3);
        for (Integer i: integerSet) {
            System.out.println("i : " + i);
        }

    }

    public static void main(String[] args) {
//        howToUseSet();
        howToUseMap();
    }
}
