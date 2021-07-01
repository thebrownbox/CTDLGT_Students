import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Sample{
    /**
     * In ra cac phan tu khac biet trong day
     */
    public static void usingSet()
    {
        int[] a = {1, 2, 3, 1, 2, 3, 4, 5, 3};
        //output: 1,2,3,4,5
        Set<Integer> mySet = new HashSet<>();
        // O(k*n)
        for (Integer x : a) {
            boolean result = mySet.add(x);//hashFunc =>k 
            System.out.println(x + " push: " + result);
        }

        List<Integer> list = new ArrayList<>();
        // O(n^2)
        for (Integer x : a) {
            if(list.contains(x) == false){
                list.add(x);
            }
        }

        System.out.print("Kq: ");
        for (Integer k : list) {
            System.out.print(k + " ");
        }
    }

    /**
     * Dem so lan xuat hien cua cac phan tu
     */
    public static void usingMap()
    {
        String[] a = {"Cong", "Phuc", "Cong", "Phuc", "Dat", "Bich", "Dat"};
        //Cong-2, Phuc-2, Dat-2, Bich-1
        Map< String, Integer> myMap = new HashMap<>();
        myMap.put("Cong", 0);

        for (String name : a) {
            String key = name;
            if(myMap.containsKey(key) == false){
                //chua co
                myMap.put(key, 1);
            }else{
                // co roi
                int currentValue = myMap.get(key);
                int updatedValue = currentValue + 1;
                myMap.put(key, updatedValue);
            }
        }

        for (Map.Entry entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }


    public static void main(String[] args) {
        // usingSet();
        usingMap();
    }
}