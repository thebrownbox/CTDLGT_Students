package com.company;


import java.util.Arrays;

public class SontBT_Leetcode1051 {
    public static int heightChecker(int[] heights) {
        int a = heights.length;
        int arr[] = Arrays.copyOf(heights,heights.length);
        int b = arr.length;
        for (int i = 0; i < a; i++) {
           for(int j = 0; j < a-i-1; j++){
               if(heights[j]>heights[j+1]){
                   int t = heights[j];
                   heights[j]=heights[j+1];
                   heights[j+1]=t;
               }
           }

        }
            System.out.println(Arrays.toString(arr));
            System.out.println(Arrays.toString(heights));


        int count=0;
        for(int k = 0; k < b ; k++){
            if(arr[k]!=heights[k]){
                count++;
            }
        }
        System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
	int[] group = {5,1,2,3,4};
	heightChecker(group);
    }
}
