// New class name: StackContainer
public class StackContainer {
    private int[] elements;
    private int topIndex;

    public StackContainer() {
        elements = new int[1_000_000];
    }

    public int pop() {
        if (isEmpty())
            throw new StackOperationException();
        return elements[--topIndex];
    }

    public void push(int item) {
        if (isFull())
            throw new StackOperationException();
        elements[topIndex++] = item;
    }

    public boolean isEmpty() {
        return topIndex == 0;
    }

    public boolean isFull() {
        return topIndex == elements.length;
    }

    class StackOperationException extends IllegalArgumentException {
    }
}
