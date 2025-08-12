public class Queue {

    int[] queue;
    int front, back, size;

    Queue(int size) {
        size = size > 0 ? size : -size;
        this.size = size;
        queue = new int[size];

        front = back = -1;
    }

    Queue() {
        this(5);
    }
    
    public boolean isFull() {
        return back == size - 1;
    }

    public void enqueue(int value) {
        if (this.isFull()) System.out.println("Queue Overflow!");
        else {
            if (front == -1) front = 0;
            back++;
            queue[back] = value;
        }
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
