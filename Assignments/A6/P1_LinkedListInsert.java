class LinkedList {

    Node head;

    public LinkedList() {
        this.head = new Node(-1);
    }

    public void add(int val) {
        Node node = new Node(val);
        if (isEmpty()) head.next = node;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
        }
    }

    public boolean isEmpty() {
        return head.next == null;
    }

    @Override
    public String toString() {
        if (head == null) return "[ ]";
        String result = "[ ";
        Node temp = head.next;
        while (temp != null) {
            result += temp.data + " ";
            temp = temp.next;
        }
        return result.concat("]");
    }

}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class P1_LinkedListInsert {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        System.out.println(list + " | Empty: " + list.isEmpty());
        for (int i = 1; i < 6; i++) list.add(i);
        System.out.println(list + " | Empty: " + list.isEmpty());
    }
}