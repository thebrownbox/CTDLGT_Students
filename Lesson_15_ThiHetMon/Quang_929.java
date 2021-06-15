package FinalTest;

import java.util.HashSet;
import java.util.Set;

public class Quang_929 {
    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(emails));
    }

    public static int numUniqueEmails(String[] emails) {
        if (emails.length == 0 || emails == null) {
            return 0;
        }

        Set<String> st = new HashSet<>();

        String email, tempFirst, first, last, answer;
        String[] name;
        for (int i = 0; i < emails.length; i++) {
            email = emails[i];
            name = email.split("@");

            tempFirst = name[0].replace(".", "");
            last = name[1];
            first = tempFirst.split("\\+")[0];

            answer = first + '@' + last;
            st.add(answer);

        }
        return st.size();
    }
}


