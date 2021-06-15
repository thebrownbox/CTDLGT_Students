import java.util.*;

public class Vinh_929 {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < emails.length; i++) {
            int j = 0;
            while (j < emails[i].length()) {
                if (emails[i].charAt(j) == '@') {
                    break;
                }
                if (emails[i].charAt(j) == '.') {
                    emails[i] = emails[i].substring(0, j) + emails[i].substring(j + 1);
                } else if (emails[i].charAt(j) == '+') {
                    int k = j;
                    while (k < emails[i].length()) {
                        if (emails[i].charAt(k) == '@') {
                            break;
                        }
                        emails[i] = emails[i].substring(0, k) + emails[i].substring(k + 1);
                    }
                } else {
                    j++;
                }
            }
            set.add(emails[i]);
        }
        return set.size();
    }

}
