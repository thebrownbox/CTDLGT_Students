import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class _1636_Sort_Array {

    /**
     * Node
     */
    public static class Node implements Comparable{
        public int value;
        public int freq;
        public Node(int val, int freq){
            this.value = val;
            this.freq = freq;
        }

        @Override
        public int compareTo(Object o) {
            if(o instanceof Node){
                Node other = (Node)o;
                // So sanh freq => Sap xep theo chieu tang dan
                if(this.freq != other.freq){
                    return Integer.compare(this.freq, other.freq);
                }else{ // Neu bang freq => Xap xep theo value | chieu giam dan
                    return -Integer.compare(this.value, other.value);
                }
            }
            return 0;
        }
    }

    public static int[] frequencySort(int[] a) {
        //B1: Đếm tần xuất xuất hiện của các giá trị
        int ADDED_VALUE = 100;
        int[] count = new int[201];
        // int[] result = new int[a.length];
        int[] resultList = new int[a.length];
        List<Node> listNode = new ArrayList<>();

        // 0-based index| 200: 0-199, 201: 0-200
        for (int i = 0; i < a.length; i++) {
            a[i] += ADDED_VALUE;
        }

        // count[i] = Số lần xuất hiện (số phần tử) có giá trị là i
        for (int i = 0; i < a.length; i++) {
            int k = a[i];
            count[k]++;
        }

        for (int i = 0; i < count.length; i++) {
            if(count[i] != 0){
                listNode.add(new Node(i, count[i]));
            }
        }

        //B2: Sắp xếp lại theo yêu cầu:
        // - Theo tần số (tăng dần)
        // - Theo giá trị (giảm dần)
        Collections.sort(listNode);


        // B3: Trả về mảng mới như trên
        int index = 0;
        for (int i = 0; i < listNode.size(); i++) {
            Node x = listNode.get(i);
            int k = x.freq;
            int value = x.value;
            for (int j = 0; j < k; j++) {
                System.out.print(value + " ");
                // resultList.add(value);
                resultList[index] = value-ADDED_VALUE;
                index++;
            }
        }

        
        return resultList;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3,3};
        frequencySort(arr);
        // 3 3 2 2 1 1 1
    }
}
