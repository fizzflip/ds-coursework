public class CharQueue {

    char[] queue;
    int front, back, size;

    CharQueue(int size) {
        size = size > 0 ? size : -size;
        this.size = size;
        queue = new char[size];

        front = back = -1;
    }

    CharQueue() {
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