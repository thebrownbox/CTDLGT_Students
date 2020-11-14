public class StackArray implements IStack {
    private int SIZE;
    private int[] arr;
    private int topIndex;

    StackArray(int size){
        this.SIZE = size;
        this.arr = new int[SIZE];
        this.topIndex = -1;
    }

    @Override
    public void push(int value) {
        if(!isFull())
        {
            topIndex++;
            arr[topIndex] = value;
        }
    }

    @Override
    public int pop() {
        if(!isEmpty()){
            return arr[topIndex--];
        }
        return -1;
    }

    @Override
    public boolean isEmpty() {
        return (topIndex < 0);
    }

    @Override
    public boolean isFull() {
        return topIndex >= (SIZE-1);
    }

    public void print()
    {
        for (int i = 0; i < SIZE; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
