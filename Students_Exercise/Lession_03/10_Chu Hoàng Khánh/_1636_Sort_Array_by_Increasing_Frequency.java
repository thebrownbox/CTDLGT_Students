
import java.util.ArrayList;
import java.util.Collections;

public class _1636_Sort_Array_by_Increasing_Frequency {
    public static void main(String[] args) {
        int[] a = { 1, 1, 2, 2, 2, 3};

        frequencySort(a);
    }

    private static int[] frequencySort(int[] a) {
        ArrayList<Frequency> list = new ArrayList<>();

        int[] count = new int[100];
        int temp = 0;
        int n = a.length;
        int ADDED_VALUE = 100;

        for (int i = 0; i < n; i++) {
            a[i] += ADDED_VALUE;
            temp = a[i];
            count[temp]++;
        }

        for (int i = 0; i < count.length; i++) {
            if (count[i] != 0) {
                Frequency frequency = new Frequency(count[i], i);
                list.add(frequency);
            }
        }

        Collections.sort(list);

        int k = 0;
        for (Frequency i : list) {
            for (int j = 0; j < i.frequency; j++) {
                a[k] = i.value - ADDED_VALUE;
                k++;
            }
        }

        return a;
    }
    
    /**
     * Frequency
     */ 
    static class Frequency implements Comparable<Frequency>{
        public int frequency;
        public int value;

        public Frequency(int frequency, int value) {
            this.frequency = frequency;
            this.value = value;
        }

        @Override
        public int compareTo(Frequency o) {
            int rs = this.frequency - o.frequency;

            if (rs > 0)
                return 1;
            else if (rs < 0)
                return -1;
            else {
                rs = this.value - o.value;
                if (rs > 0)
                    return -1;
                else if (rs < 0)
                    return 1;
            }
            return 0;
        }
    }
}
