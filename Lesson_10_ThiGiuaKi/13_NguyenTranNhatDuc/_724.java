package com.techmaster;

public class _724 {
    public int pivotIndex(int[] nums) {
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                sum1+=nums[j];
            }
            for(int z=0;z<i;z++){
                sum2+=nums[z];
            }
            if(sum1==sum2){
                return i;
            }else{
                sum1=0;
                sum2=0;
            }
        }
        return -1;
    }
}
