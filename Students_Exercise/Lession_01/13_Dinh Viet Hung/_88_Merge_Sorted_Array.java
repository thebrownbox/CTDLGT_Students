public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
     
        for (int ai : nums2) {
            chenPhanTuVaoMang(ai, nums1, m);
            m++;
        }

    }

    private static void chenPhanTuVaoMang(int x, int [] a, int m) {
        boolean isCheck = false;
        for (int k = 0; k < m; k++) {
            if(a[k] > x){
                isCheck = true;
                for (int i = m-1; i >=k; i--) {
                    a[i+1] = a[i];
                }
                a[k] = x;
                break;
            }
        }

        if(isCheck == false){
            a[m] = x;
        }
    }

    public static void main(String[] args) {
        int [] nums1 = {3,4,5,7,0,0,0};
        int [] nums2 = {4,0,8};

        merge(nums1, 4, nums2, 3);
        System.out.println("Success");
    }
}
