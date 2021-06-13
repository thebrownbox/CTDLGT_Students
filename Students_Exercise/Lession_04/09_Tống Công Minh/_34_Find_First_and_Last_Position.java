package Recursion;

import java.util.*;

public class _34_Find_First_and_Last_Position {

    public static int[] searchRange(int[] nums, int target) {

        int[] result = {-1,-1};
        if (nums.length == 0) {
           return result;
        }

        int l = 0;
        int r = nums.length-1;

        int index=0;

        find(l,r,nums,target,result, index);

        Arrays.sort(result);

        return result;
    }

    public static void find(int l, int r, int[] nums, int target, int[] result, int index){

        if(l > r) return;

        int m = (l+r)/2;

        if (target > nums[m]){
            find(m+1,r,nums,target,result, 0);
        } else if (target < nums[m]){
            find(l,m-1,nums,target,result, 1);
        } else {

            if (result[0] == -1) {
                result[0] = m;
            }

            if (m < result[0]) {
                result[0] = m;
            }

            if (m > result[1]) {
                result[1] = m;
            }
            find(l,m-1,nums,target,result, 0);
            find(m+1,r,nums,target,result, 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {};
        int[] result = searchRange(nums,6);
        System.out.printf(Arrays.toString(result));
    }
}
