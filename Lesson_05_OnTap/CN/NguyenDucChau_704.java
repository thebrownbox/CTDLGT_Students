package com.company;

public class NguyenDucChau_704 {
    public static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        for (;left <= right;){
            //Tim vi tri giua vi ket qua se nam giua left va right
            int mid = left + (right - left) /2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] < target){
                //target nam o phia ben phai cua mang nums
                left = mid + 1;
            }else {
                //target nam o phia ben trai cua mang nums
                right = mid - 1;
            }
        }
        return - 1;
    }

    public static void main(String[] args) {
        int[] n = {-1,0,3,5,9,12};
        System.out.println(search(n,9));
    }
}
