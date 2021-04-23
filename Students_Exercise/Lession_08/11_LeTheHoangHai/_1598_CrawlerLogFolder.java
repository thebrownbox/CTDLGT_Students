public class _1598_CrawlerLogFolder {
    public static int minOperations(String[] logs) {
        int count = 0;
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../") && count > 0) {
                count--;
            } else if (!logs[i].equals("./") && !logs[i].equals("../")) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String [] logs = {"./","../","./"};
        System.out.println(minOperations(logs));

    }
}
