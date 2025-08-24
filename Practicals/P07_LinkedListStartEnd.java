import java.util.Scanner;

class LinkedList {

    Node head;
    int size;

    public LinkedList() {
        this.head = new Node(-1);
        size = 0;
    }

    public void addAtHead(int val) {
        Node node = new Node(val);
        if (!isEmpty()) node.next = head.next;
        head.next = node;
        size++;
    }

    public void addAtTail(int val) {
        Node node = new Node(val);
        if (isEmpty()) head.next = node;
        else {
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = node;
        }
        size++;
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

public class P07_LinkedListStartEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.println("""
                ====== Linked List ======
                [1] Insert at beginning
                [2] Insert at end
                [3] Display
                [4] Exit
                """);

        do {
            System.out.print("Choice: ");
            switch (sc.nextInt()) {
                case 1 -> {
                    System.out.print("Value: ");
                    int value = sc.nextInt();
                    list.addAtHead(value);
                }
                case 2 -> {
                    System.out.print("Value: ");
                    int value = sc.nextInt();
                    list.addAtTail(value);
                }
                case 3 -> System.out.println(list + " - " + list.size);
                case 4 -> System.exit(0);
                default -> System.out.println("Invalid choice!");
            }
        } while (true);
    }
}