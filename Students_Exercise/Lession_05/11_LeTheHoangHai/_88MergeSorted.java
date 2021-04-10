public class _88MergeSorted {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int leng1 = nums1.length;
        int leng2 = nums2.length;
        
        if(m == 0){
            for(int i=0;i<leng1;i++){
                nums1[i] = nums2[i];
            }
        } else {
            if(m != leng1){
                for(int i = 0;i < leng2;i++){
                    for(int j = m - 1;j >= 0;j--){
                        if(nums1[j] > nums2[i]){
                            nums1[j+1] = nums1[j];
                            if(j==0){
                                nums1[j] = nums2[i]; 
                                m++; 
                            }
                        } else {
                            nums1[j+1] = nums2[i]; 
                            m++; 
                            break;
                        }
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[]num1 ={0};
        int[]num2 ={1};
        merge(num1, 0, num2, 1);
        System.out.println(num1.toString());

    }
}
