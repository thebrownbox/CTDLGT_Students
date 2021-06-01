package lab2_string_array;

public class _816_Truncate_Sentence {

  public static String truncateSentence(String s, int k) {
    String[] strs = s.split(" ");

    String result = " ";
    for (int i = 0; i < k; i++) {
      result = result + strs[i] + " ";
    }
    return result.trim();

  }

  public static void main(String[] args) {
    String s = "Hello how are you Contestant";

    String result = truncateSentence(s, 4);
    System.out.println(result);
  }
  
}
