
import java.util.Comparator;
import java.util.PriorityQueue;

public class _1046_Last_Stone_Weight {
    public static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new myComparator());
        for (Integer st : stones) {
            pq.add(st);
        }
        while (pq.size() > 1) {
            int y = pq.poll();
            int x = pq.poll();
            if (y != x) {
                pq.add(y - x);
            }
        }
        if (pq.isEmpty()) {
            return 0;
        } else {
            return pq.element();
        }
    }

    public static class myComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            int value = o1.compareTo(o2);
            if (value > 0) {
                return -1;
            } else if (value < 0) {
                return 1;
            } else {
                return 0;
            }
        }
    }

    public static void main(String[] args) throws Exception {
        int[] arr = { 2, 7, 4, 1, 8, 1 };
        System.out.println(lastStoneWeight(arr));
    }
}
