public class QueueArray implements IQueue {
    private int[] arr;
    private int headIndex, tailIndex;
    private int SIZE;

    QueueArray(int size){
        this.SIZE = size;
        arr = new int[SIZE];
        headIndex = tailIndex = -1;
    }

    @Override
    public void push(int value) {
        if(isFull() == false){
            if(isEmpty()){
                headIndex++;
            }
            tailIndex++;
            arr[tailIndex] = value;
        }
    }

    @Override
    public int pop() {
        if(isEmpty()){
            return -1;
        }
        int result = arr[headIndex++];
        if(headIndex > tailIndex){
            headIndex = tailIndex = -1;
        }
        return result;
    }

    @Override
    public boolean isEmpty() {
        return headIndex < 0 && tailIndex < 0;
    }

    @Override
    public boolean isFull() {
        return tailIndex >= SIZE - 1;
    }

    public void print()
    {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
