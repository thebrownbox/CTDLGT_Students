import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Sample {

    public int ping(int t) {
        int numberOfCalls = 0;
        //B1. Them t vao queue

        // B2. Tinh startTime = t - 3000

        // B3. chung nao peek() < startTime:
                    // ==> remove
                    
        // B4: So cuoc goi can tim => Size hien tai cua queue
        return numberOfCalls;
    }

    public static void main(String[] args) {
        Queue<Integer> myQueue = new LinkedList<>();
        myQueue.add(2);
        myQueue.add(3);
        myQueue.add(4);

        System.out.println(myQueue.remove()); //2
        System.out.println(myQueue.peek()); //3
        System.out.println(myQueue.poll()); //3
        System.out.println(myQueue.isEmpty()); // false


        Stack<Integer> myStack = new Stack<>();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        System.out.println(myStack.pop()); //4
        System.out.println(myStack.peek()); //3
        System.out.println(myStack.pop());  //3
        System.out.println(myStack.isEmpty());  //false


        //B1. Them t vao queue
        // B2. Tinh startTime = t - 3000
        // B3. chung nao peek() < startTime:
                    // ==> remove
        // B4: So cuoc goi can tim => Size hien tai cua queue
    }
}
