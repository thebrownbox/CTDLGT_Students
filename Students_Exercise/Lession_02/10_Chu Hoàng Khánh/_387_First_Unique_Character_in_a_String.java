public class _387_First_Unique_Character_in_a_String {
    public static void main(String[] args) {
        String s = "leetcode";

        System.out.println(firstUniqChar(s));
        
    }

    private static int firstUniqChar(String s) {

        int count[] = new int[256];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i)]++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (count[s.charAt(i)] == 1) {
                return i;
            }
        }
        return -1;
    }
}
