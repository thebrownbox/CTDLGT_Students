public class MainClass {
    public static void testStack() {
        StackArray stack = new StackArray(3);
        System.out.println("stack.isFull(): " + stack.isFull());
        System.out.println("stack.isEmpty(): " + stack.isEmpty());
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("stack.isFull(): " + stack.isFull());
        System.out.println("stack.isEmpty(): " + stack.isEmpty());
        stack.print();
        System.out.println("stack.pop():" + stack.pop());
        System.out.println("stack.pop():" + stack.pop());
        System.out.println("stack.pop():" + stack.pop());
        System.out.println("stack.pop():" + stack.pop());
        System.out.println("stack.isFull(): " + stack.isFull());
        System.out.println("stack.isEmpty(): " + stack.isEmpty());
    }

    public static void testQueue() {
        QueueArray myQueue = new QueueArray(3);
        System.out.println("myQueue.isEmpty(): " + myQueue.isEmpty());
        System.out.println("myQueue.isFull(): " + myQueue.isFull());
        myQueue.push(1);
        myQueue.push(2);
        myQueue.push(3);
        myQueue.push(4);
        myQueue.print();
        System.out.println("myQueue.isEmpty(): " + myQueue.isEmpty());
        System.out.println("myQueue.isFull(): " + myQueue.isFull());

        System.out.println("myQueue.pop(): " + myQueue.pop());
        System.out.println("myQueue.pop(): " + myQueue.pop());
        System.out.println("myQueue.pop(): " + myQueue.pop());
        System.out.println("myQueue.pop(): " + myQueue.pop());

        System.out.println("myQueue.isEmpty(): " + myQueue.isEmpty());
        System.out.println("myQueue.isFull(): " + myQueue.isFull());
    }

    public static void main(String[] args) {
        testQueue();
    }
}
