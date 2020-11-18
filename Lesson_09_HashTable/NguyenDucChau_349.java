package LeetCode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NguyenDucChau_349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> mySet1 = new HashSet<>();//Chua phan tu nums1
        Set<Integer> mySet2 = new HashSet<>();//Chua phan tu nums2


        for (int i = 0; i <nums1.length ; i++) {
            //Kiem tra xem da co phan tu nums[i] trong mang chua
            if(mySet1.contains(nums1[i]) == false){
                mySet1.add(nums1[i]);
            }
        }

        for (int i = 0; i <nums2.length ; i++) {
            //Kiem tra xem da co phan tu nums[i] trong mang chua
            if(mySet2.contains(nums2[i]) == false){
                mySet2.add(nums2[i]);
            }
        }

        Set<Integer> intersectionArr = new HashSet<>(mySet1);

        intersectionArr.retainAll(mySet2);

        int []result = intersectionArr.stream().mapToInt(Integer::intValue).toArray();//return set as int array java

       return result;
    }

    public static void main(String[] args) {
        int[]s1 = {1,2,2,1};
        int[] s2 = {2,2};
        System.out.println(Arrays.toString(intersection(s1,s2)));
    }
}
