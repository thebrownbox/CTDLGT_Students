class Solution {
  public String backSpaceCheck(String temp) {
    Stack<Character> check = new Stack<>();
    char[] chars = temp.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if (chars[i] == '#' && !check.isEmpty()) {
        check.pop();
      } else if (chars[i] != '#') {
        check.add(chars[i]);
      }
    }
    return check.toString();
  }

  public boolean backspaceCompare(String S, String T) {
    return backSpaceCheck(S).equals(backSpaceCheck(T));
  }
}