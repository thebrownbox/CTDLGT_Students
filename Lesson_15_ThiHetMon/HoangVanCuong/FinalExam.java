package FinalExam;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FinalExam {
    public int maximumWealth(int[][] accounts) {
        int result = 0;

        for (int i = 0; i < accounts.length; i++) {
            int tempWealth = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                tempWealth += accounts[i][j];
            }

            if (tempWealth > result) {
                result = tempWealth;
            }
        }

        return result;
    }

    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resutl = new ArrayList<>();
        int[] timesAppear = new int[nums.length + 1];

        System.out.println("nums lenght: " + nums.length);
        System.out.println("time lenght: " + timesAppear.length);

        for (int i = 0; i < nums.length; i++) {
            timesAppear[nums[i]]++;
        }

        for (int i = 0; i < timesAppear.length; i++) {
            int checkTimeAppear = timesAppear[i];
            if (checkTimeAppear == 2) {
                resutl.add(i);
            }
        }

        return resutl;
    }

    public static int numUniqueEmails(String[] emails) {
        int result = 0;
        Stack<String> myEmail = new Stack<>();

        for (int i = 0; i < emails.length; i++) {
            int indexOfAt = emails[i].indexOf("@");
            int indexOfFirstPlus = emails[i].indexOf("+");
            String temp = emails[i].substring(0, indexOfFirstPlus);

            temp.replaceAll(".","");

            int countDot = 0;

            String temp2 = emails[i].substring(indexOfAt, emails[i].length() - 1);
            if (temp2.contains("+")){
                break;
            }

            for (int j = indexOfAt; j < emails[i].length(); j++) {

                if (emails[i].charAt(j) == '.'){
                    countDot++;
                    if (countDot > 1){
                        break;
                    }
                }
            }

            String myString = temp+temp2;
            System.out.println(myString);
            if (myEmail.add(myString)){
                result++;
            }
        }

        System.out.println(myEmail);
        return result;
    }

    public boolean backspaceCompare(String S, String T) {
        boolean result = true;
        Stack<Character> stringS = new Stack<>();
        Stack<Character> stringT = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#') {
                if (stringS.isEmpty()) {
                    continue;
                }
                stringS.pop();
            } else {
                stringS.add(S.charAt(i));
            }
        }

        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#') {
                if (stringT.isEmpty()) {
                    continue;
                }
                stringT.pop();
            } else {
                stringT.add(T.charAt(i));
            }
        }

        while (result == true) {
            if (stringS.isEmpty() == true && stringT.isEmpty() == false) {
                result = false;
                break;
            } else if (stringS.isEmpty() == false && stringT.isEmpty() == true) {
                result = false;
                break;
            } else if (stringS.isEmpty() == true && stringT.isEmpty() == true) {
                break;
            }

            if (stringS.peek() == stringT.peek()) {
                stringS.pop();
                stringT.pop();
            } else {
                result = false;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String[] email = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
        System.out.println(numUniqueEmails(email));
        System.out.println();
    }
}
