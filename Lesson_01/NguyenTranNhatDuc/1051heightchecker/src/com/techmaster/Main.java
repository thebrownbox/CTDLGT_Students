package com.techmaster;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] n={5,1,2,3,4};
        System.out.println(heightChecker(n));
    }

    public static int heightChecker(int[] heights) {
        int z=0;
        int check=0;
        int[] arr=new int[heights.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=heights[i];
        }

        for(int i=0;i<heights.length;i++){
            for(int j=heights.length-1;j>=0;j--){
                if(i<j){
                    if(heights[i]>heights[j]){
                        check=heights[j];
                        heights[j]=heights[i];
                        heights[i]=check;
                    }
                }else{
                    if(heights[j]>heights[i]){
                        check=heights[i];
                        heights[i]=heights[j];
                        heights[j]=check;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=heights[i]){
                z++;
            }
        }
        return z;
    }
}
