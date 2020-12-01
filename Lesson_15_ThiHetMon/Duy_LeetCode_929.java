package finalexam;

import java.util.HashSet;
import java.util.Set;

public class Duy_LeetCode_929 {
    public int numUniqueEmails(String[] emails) {

        // return 0 if there's no email
        if (emails == null || emails.length == 0) {
            return 0;
        }

        // create a Hashset of mails
        Set<String> listOfMails = new HashSet<>();

        // Iterating through the emails array
        for (String email : emails) {
            // Create an array of email splitting the "@"
            String[] splits = email.split("@");
            // Create mutable string
            StringBuilder sb = new StringBuilder();
            //Iterating through email's length
            for (int i = 0; i < email.length(); i++) {
                // Create char c = char of email at index i
                char c = email.charAt(i);
                if (c == '+') {
                    break;
                }
                if (c == '.') {
                    continue;
                }
                sb.append(c);// append c to sb
            }
            sb.append("@").append(splits[1]); // c + @ + domain name
            listOfMails.add(sb.toString());
        }
        return listOfMails.size();
    }

    public static void main(String[] args) {
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        Duy_LeetCode_929 unq = new Duy_LeetCode_929();
        int a = unq.numUniqueEmails(emails);
        System.out.println(a);
    }
}
