class Test {
    public static int f(String s)
    {
        if(s.equals("./"))
            return 0;
        if(s.equals("../"))
            return -1;
        return 1;
    }
    public static int minOperations(String[] logs) 
    {
        int depth = 0;
        for (int i = 0; i < logs.length; i++) {
            depth += f(logs[i]);
            depth = Math.min(0, depth);
        }

        return depth;
    }
    
    public static void main(String[] args) {
        String[] s = {"d1/","d2/","../","d21/","./"};
        minOperations(s);
    }
}
