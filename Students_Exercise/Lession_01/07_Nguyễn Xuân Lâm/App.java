public class App {
    public static void main(String[] args) throws Exception {
        ThreadWithImplement threadImplement = new ThreadWithImplement();
        Thread thread = new Thread(threadImplement);
        // System.out.println(thread.getName());
        // System.out.println(thread.getId());
        thread.start();
    }
}
