import java.util.Arrays;

class Stack {
    private int head;
    private final int[] stack;

    Stack(int size) {
        this.stack = new int[size];
        this.head = -1;
    }

    Stack() {
        this(10);
    }

    public boolean isEmpty() {
        return head == -1;
    }

    public boolean isFull() {
        return head + 1 == stack.length;
    }

    public void push(int value) {
        if (this.isFull()) {
            System.out.println("Stack Overflow!");
            return;
        }

        head++;
        stack[head] = value;
    }

    public int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }

        int currentValue = stack[head];
        stack[head] = 0;
        head--;

        return currentValue;
    }

    public int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack empty, can't peek!");
            return -1;
        }
        return stack[head];
    }

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}

public class P2_StackOperations {
    public static void main(String[] args) {
        Stack stack = new Stack(5);

        for (int i = 1; i < 6; i++) stack.push(i);
        System.out.println("Stack: " + stack);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack: " + stack);

        System.out.println("Stack is Full? - " + stack.isFull());
        System.out.println("Stack is Empty? - " + stack.isEmpty());
        System.out.println("Peek: " + stack.peek());

        stack.push(5);
        System.out.println("Stack: " + stack);
        System.out.println("Stack is Full? - " + stack.isFull());

        for (int i = 0; i < 6; i++) stack.pop();
        System.out.println("Stack: " + stack);
        System.out.println("Stack is Empty? - " + stack.isEmpty());
    }
}
