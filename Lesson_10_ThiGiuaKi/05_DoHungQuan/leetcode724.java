package BT.KT;

public class leetcode724 {
    public static int pivotIndex(int[] nums) {

        if(nums.length<1)
            return -1;
        int rsum=0, lsum=0;
        for(int x:nums)
            rsum+=x;
        for(int x=0; x<nums.length; x++)
        {
            rsum-=nums[x];
            if(rsum==lsum)
                return x;
            lsum+=nums[x];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] num = {1,7,3,6,5,6};
        System.out.println(pivotIndex(num));
    }
}
