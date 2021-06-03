public class _1816TruncateSentence {
    public String truncateSentence(String s, int k) {
        StringBuilder builder = new StringBuilder(s.length());
        String[] arr = s.split(" ");
        int count = 0;
        while (count<k){
            builder.append(arr[count]);
            if (count<k-1){
                builder.append(" ");
            }
            count++;
        }
        return builder.toString();
    }
}
