package binary_search;

public class _1678_Goal_Parser_Interpretation {

    public static String interpret(String command) {

        String result = "";

        for (int i = 0; i < command.length(); i++) {
            if (command.charAt(i) == '(') {
                if (command.charAt(i + 1) == ')') {
                    result += 'o';
                } else {
                    result.concat("al");
                }
            } else {
                if (command.charAt(i) != ')') {
                    result += command.charAt(i);
                }

            }
        }

        return result;

    }

    public static void main(String[] args) {
        String command = "(al)G(al)()()G";
        System.out.println(interpret(command));
    }

}
