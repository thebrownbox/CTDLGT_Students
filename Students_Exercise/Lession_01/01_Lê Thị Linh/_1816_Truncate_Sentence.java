public class _1816_Truncate_Sentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        int k = 4;
        String[] words = s.split(" ");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < k; i++) {
                sb.append(words[i]);
                sb.append(" ");
            }
            System.out.print("Chuoi moi la: ");
            System.out.println(sb.substring(0, sb.toString().length() - 1));
        }
    }