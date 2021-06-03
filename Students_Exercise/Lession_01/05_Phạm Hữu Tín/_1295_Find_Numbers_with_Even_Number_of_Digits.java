public class _1295_Find_Numbers_with_Even_Number_of_Digits {
    public static int findNumbers(int[] nums) {
        int biendem = 0;
        for ( int a : nums) {
            int Soluongchuso = TinhSoChuSo(a);
            if( Soluongchuso % 2 == 0){
                biendem++;
            }
        }
        return biendem;
    }
    private static int TinhSoChuSo(int a) {
        int biendem = 0;
        int kq = a;
        while( kq != 0){
            kq = a / 10;
            a = kq;
            biendem++;
        }
        return biendem;
    }
    public static void main(String[] args) {
        int [] nums = {1, 22, 3, 4444, 5} ;
     
       
       System.out.println(findNumbers(nums));
       
    }
    
}
