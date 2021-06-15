class Solution {
  public static String stringStandardlize(String local) {
    StringBuilder sb = new StringBuilder();
    for (char c : local.toCharArray()) {
      if (c != '.') {
        if (c == '+') {
          return sb.toString();
        }
        sb.append(c);
      }
    }
    return sb.toString();
  }

  public static int numUniqueEmails(String[] emails) {
    Set<String> emailSet = new HashSet<>();
    for (String email : emails) {
      String[] partEmail = email.split("@");
      String domain = partEmail[1];
      String local = stringStandardlize(partEmail[0]);
      emailSet.add(local + "@" + domain);
    }
    return emailSet.size();

  }
}
