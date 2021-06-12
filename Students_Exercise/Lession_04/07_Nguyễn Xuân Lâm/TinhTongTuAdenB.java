public class TinhTongTuAdenB {
    public static int sum2(int[] a, int startIndex, int endIndex){
        int n = a.length;
        int sum = 0;
        if(startIndex <0 || endIndex >n) return sum;
        else{
            if(endIndex==startIndex) return a[startIndex];
            else{
                return a[endIndex] + sum2(a,startIndex,endIndex-1);
                
            }
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9};
        System.out.println(sum2(a, 0, 10));
    }
}
