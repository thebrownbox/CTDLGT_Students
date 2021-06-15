public class Bai2 {
    public static int minOperations(String[] logs) {
        int mainPos = 0;
        for (int i=0; i<logs.length; i++) {
            if (logs[i].equals("./")) {
                continue;
            }
            else if (logs[i].equals("../")) {
                if (mainPos == 0) {
                    continue;
                }
                else {
                    mainPos --;
                }
            }
            else {
                mainPos ++;
            }
        }

        return mainPos;
}

    public static void main(String[] args) {
        String[] strings = {"./","wz4/","../","mj2/","../","../","ik0/","il7/"};
        System.out.println(minOperations(strings));
    }

}



