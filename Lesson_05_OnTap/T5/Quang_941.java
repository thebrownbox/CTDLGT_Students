public class Quang_941 {

    public static boolean validMountainArray(int[] A){
        if(A.length<3)
            return false;

        boolean ans = false;
        for(int i=1;i<A.length-1;i++){
            boolean res1 = true;
            boolean res2 = true;
            for(int j=0;j<i;j++){
                if(A[j]>=A[j+1]){
                    res1 = false;
                    break;
                }
            }
            for(int j=i;j<A.length-1;j++){
                if(A[j]<=A[j+1]){
                    res2 =false;
                    break;
                }
            }
            ans = res1&&res2;
            if(ans)
                break;
        }
        return ans;
    }

//    public static boolean validMountainArray2(int[] arr){
//
//        int i = 0;
//        while(i<arr.length-1 && arr[i]<arr[i+1])
//            i++;
//        if(i==0 || i==arr.length-1)
//            return false;
//        while(i<arr.length-1 && arr[i]>arr[i+1])
//            i++;
//        return i == arr.length-1;
//    }
    public static void main(String[] args) {
        int[] nums = {0,2,3,4,5,2,1,0};
        System.out.println("This array is " + (validMountainArray(nums)?"a mountainArray":"not a mountainArray"));
    }
}
