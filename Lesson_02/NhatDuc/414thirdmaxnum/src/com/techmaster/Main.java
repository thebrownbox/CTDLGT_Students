package com.techmaster;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] h={3,2,1};
        System.out.println(thirdMax(h));
    }

    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int[] arr=new int[nums.length];
        int check=nums[0];
        int z=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]) {
                arr=new int[arr.length-1];
            }
        }

        for(int i=1;i<nums.length;i++){
            arr[z]=check;
            if(nums[i]!=check) {
                check=nums[i];
                z++;
            }
            arr[z]=check;
        }

        if(arr.length<3){
            return arr[arr.length-1];
        }else {
            return arr[arr.length-3];
        }
//        if (nums == null || nums.length == 0) return 0;
//        if (nums.length == 1) return nums[0];
//        if (nums.length == 2) return Math.max(nums[0], nums[1]);
//
//        int[] max = new int[3];
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] > max[0] || count == 0) {
//                max[2] = max[1];
//                max[1] = max[0];
//                max[0] = nums[i];
//                count++;
//            } else if ((nums[i] > max[1] || count == 1) && max[0] != nums[i]) {
//                max[2] = max[1];
//                max[1] = nums[i];
//                count++;
//            } else if ((nums[i] > max[2] || count == 2) && max[1] != nums[i] && max[0] != nums[i]) {
//                max[2] = nums[i];
//                count++;
//            }
//        }
//        return count > 2 ? max[2] : max[0];
    }
}
