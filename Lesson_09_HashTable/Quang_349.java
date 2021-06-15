import java.util.HashSet;
import java.util.Set;
public class Quang_349 {
    public static void main(String[] args) {
        int[] nums1 = {2,3,4,4,5,6};
        int[] nums2 = {3,5,5,6,7};
        int[] res = intersection(nums1,nums2);
        for(int val:res)
            System.out.print(val + " ");
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int i=0;i< nums1.length;i++)
            set1.add(nums1[i]);
        for(int i=0;i<nums2.length;i++)
            set2.add(nums2[i]);
        Set<Integer> set = new HashSet<>(set1);
        set.retainAll(set2);
        int[] res = new int[set.size()];
        int ct = 0;
        for(int val:set){
            res[ct++] = val;
        }
        return res;
    }
}
