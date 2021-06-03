public class HaiTamBa {
    public static void moveZeroes(int[] nums) {

        int hienTai = 0;

        for (int i = 0; i < nums.length; i++) {


            if (nums[i] != 0)
            {
                nums[hienTai] = nums[i];
                hienTai++;
            }


            }


        for (int i = hienTai; i < nums.length; i++) {

            nums[i] = 0;

        }



        }





    public static void main(String[] args) {
       int[] a ={0,1,0,3,12};
        moveZeroes(a);
        for (int i = 0; i < a.length; i++) {
            System.out.printf("%d \t" ,a[i]);
        }
    }
}
