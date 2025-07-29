import java.util.Arrays;

public class Stack {

    int head;
    int[] stack;

    Stack(int size) {
        this.stack = new int[size];
        this.head = -1;
    }

    Stack() { this(10); }

    boolean isEmpty() { return head == -1; }

    void push(int value) {
        if (head + 1 >= stack.length) {
            System.out.println("Stack Overflow!");
            return;
        }

        head++;
        stack[head] = value;
    }

    int pop() {
        if (this.isEmpty()) {
            System.out.println("Stack Underflow!");
            return -1;
        }

        int currentValue = stack[head];
        stack[head] = 0;
        head--;

        return currentValue;
    }

    int peek() {
        if (this.isEmpty()) {
            System.out.println("Stack empty, can't peek!");
            return -1;
        }
        return stack[head];
    }
}
