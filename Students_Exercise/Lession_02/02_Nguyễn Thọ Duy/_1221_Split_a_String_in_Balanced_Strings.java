public class _1221_Split_a_String_in_Balanced_Strings {
        public static int add(String arr) {
                int countR = 0;
                int countL = 0;
                int count = 0;
                for (int i = 0; i < arr.length(); i++) {
                        char c = arr.charAt(i);
                        if ((int) c == 82) {
                                countR++;
                        } else {
                                countL++;
                        }
                        if (countR == countL) {
                                count++;
                        }
                }
                return count;
        }

        public static void main(String[] args) {
                System.out.println("==========================");
                String arr = "RLRRLLRLRL";
                System.out.println("OUTPUT : " + add(arr));
        }
}
