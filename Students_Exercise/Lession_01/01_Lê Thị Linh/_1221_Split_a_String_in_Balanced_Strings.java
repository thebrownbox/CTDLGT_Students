/**
 * _1221_Split_a_String_in_Balanced_Strings
 */
public class _1221_Split_a_String_in_Balanced_Strings {

    public static void main(String[] args) {
        String s = "RLLLLRRRLR";
        int result = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'R') {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                result++;
            }

        }
        System.out.print("So luong chuoi con co the tach duoc la: ");
        System.out.println(result);

    }

}
