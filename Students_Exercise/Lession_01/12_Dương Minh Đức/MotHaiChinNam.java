 public class MotHaiChinNam {
    
       public static int findNumbers(int[] nums) {
           int dem = 0;
           int count = 0;
              for (int i = 0; i < nums.length; i++)
              {
                      int c = nums[i];
                      int k = 0;
                      while(c>0) {
                          k = c % 10;
                          c = c / 10;
                          dem++;
                      }
                    if(dem % 2 == 0 )
                    {
                        count++;
                    }
                    dem = 0;         
              }
              return count;
       }

       
       public static void main(String[] args) {
              int[] a = { 4370,315,322,431,686,264,442};
              System.out.println(findNumbers(a));
    }
}

