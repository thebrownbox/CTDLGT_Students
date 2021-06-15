package FinalTest;

import java.util.ArrayList;
import java.util.List;

public class Quang_442 {
    public static List<Integer> findDuplicates(int[] nums) {
        int[] counts = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            counts[nums[i]-1]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(counts[i]>1)
                list.add(i+1);
        }
        return list;
    }

    public static void main(String[] args) {
        int[] numbers = {2,1,4,3,2,1,2,3};
        List<Integer> list = findDuplicates(numbers);
        for(var nums:list)
            System.out.print(nums+" ");
    }
}
