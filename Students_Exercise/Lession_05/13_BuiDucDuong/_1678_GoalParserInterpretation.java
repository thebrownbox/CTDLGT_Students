package day05;

public class _1678_GoalParserInterpretation {
    public static void main(String[] args) {

    }

    public String interpret(String command) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    res.append("o");
                    i++;
                } else {
                    res.append("al");
                    i += 3;
                }
            } else {
                res.append("G");
            }
        }
        return res.toString();
    }
}
