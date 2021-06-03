public class _1662_Check_If_Two_String {
        public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
                int a = 0;
                arrayInput(word1, a);
                //
                int b = 0;
                arrayInput(word1, b);
                //
                boolean check = false;
                if (a == b) {
                        check = true;
                }
                return check;

        }

        public static void arrayInput(String[] arr, int count) {
                for (int i = 0; i < arr.length; i++) {
                        String str = arr[i];
                        for (int j = 0; j < str.length(); j++) {
                                char kytu = str.charAt(j);
                                int index = (int) kytu;
                                count += index;
                        }
                }
        }

        public static void main(String[] args) {
                String[] word1 = { "ab", "c" };
                String[] word2 = { "a", "bc" };
                System.out.println("=========================");

                System.out.println(arrayStringsAreEqual(word1, word2));
        }
}
