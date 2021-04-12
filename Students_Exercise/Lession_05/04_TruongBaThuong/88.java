public class 88{
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        while(m-1>=0 && n-1 >=0){
            if(nums[m-1]>= nums2[n-1]){
                nums1[m-1] + n-1 +1 = nums1[m-1];
                m--;
            }
            else{
                nums1[m-1 + n-1 +1] = nums2[n-1];
                n--;
            }
        }
        while(n-1>=0){
            nums1[n-1] = nums2[n-1];
            n--;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int m = 3;
        int[] nums2 = { 2, 5, 6 };
        int n = 3;
        merge(nums1, m, nums2, n);
        System.out.println(Arrays.toString(nums1));

    }
}