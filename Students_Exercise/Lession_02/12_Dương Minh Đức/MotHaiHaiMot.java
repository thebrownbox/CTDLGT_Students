public class MotHaiHaiMot {

    public static int balancedStringSplit(String s) {

        int result = 0;
        int countR = 0;
        int countL = 0;

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'R')
            {
                countR++;
            }
            else if(s.charAt(i) == 'L')
            {
                countL++;
            }

            if(countL == countR)
            {
                result++;
            }
        }




        return result;




    }

    public static void main(String[] args) {

        String s =  "RLLLLRRRLR";
        System.out.println(balancedStringSplit(s));

    }

}
