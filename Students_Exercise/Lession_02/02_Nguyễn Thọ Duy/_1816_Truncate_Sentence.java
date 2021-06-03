public class _1816_Truncate_Sentence {
        public static String truncateSentence(String str, int k) {
                char empty = ' ';
                String textLine = "";
                int count = 0;
                for (int i = 0; i < str.length(); i++) {
                        if (str.charAt(i) != empty) {
                                textLine += String.valueOf(str.charAt(i));
                        } else {
                                count++;
                                if (count == k) {
                                        break;
                                }
                                textLine += String.valueOf(empty);
                        }

                }
                return textLine;
        }

        public static void main(String[] args) {
                String str = "Hello how are you Contestant";
                int k = 4;
                System.out.println(truncateSentence(str, k));

        }
}
