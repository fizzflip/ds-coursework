import java.util.Arrays;

public class P1_StackPushPop {

    int head;
    int[] stack;

    P1_StackPushPop(int size) {
        this.stack = new int[size];
        this.head = -1;
    }

    P1_StackPushPop() {
        this(10);
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println(stack);

        System.out.println(stack.pop());
        System.out.println(stack);

        stack.push(50);

        System.out.println(stack.peek());
        System.out.println(stack);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack);
    }

    boolean isEmpty() {
        return head == -1;
    }

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

    @Override
    public String toString() {
        return Arrays.toString(stack);
    }
}
