import java.util.Scanner;

public class P3_QueueOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();

        System.out.println("""
                ==== Queue ====
                [1] Enqueue
                [2] Dequeue
                [3] Search
                [4] Display
                [5] Exit
                """);
        do {
            System.out.print("Choice: ");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.print("Value: ");
                    char value = sc.next().charAt(0);
                    queue.enqueue(value);
                }

                case 2 -> queue.dequeue();

                case 3 -> {
                    System.out.print("Key: ");
                    char key = sc.next().charAt(0);
                    System.out.println(queue.search(key) ? "Key found!" : "Key not found!");
                }

                case 4 -> System.out.println(queue);

                case 5 -> System.exit(0);

                default -> System.out.println("Invalid choice!");
            }
        } while (true);
    }
}

class Queue {

    char[] queue;
    int front, back, size;

    Queue(int size) {
        size = size > 0 ? size : -size;
        this.size = size;
        queue = new char[size];

        front = back = -1;
    }

    Queue() {
        this(5);
    }

    public boolean isEmpty() {
        return (front == -1 && back == -1) || front > back;
    }

    public boolean isFull() {
        return back == size - 1;
    }

    public void enqueue(char value) {
        if (this.isFull()) System.out.println("Queue Overflow!");
        else {
            if (front == -1) front = 0;
            back++;
            queue[back] = value;
        }
    }

    public void dequeue() {
        if (this.isEmpty()) System.out.println("Queue Underflow!");
        else {
            queue[front] = 0;
            front++;
        }
    }

    public boolean search(char key) {
        if (this.isEmpty()) return false;
        for (int i = front; i <= back; i++) if (queue[i] == key) return true;
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = front; i <= back; i++) sb.append(queue[i]).append(' ');
        sb.append("]");
        return sb.toString();
    }
}