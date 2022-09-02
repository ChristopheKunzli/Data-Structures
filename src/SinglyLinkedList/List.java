package SinglyLinkedList;

public class List {
    public Node head = null;

    public List() {
    }

    public List(Node head) {
        this.head = head;
    }

    public List(int value) {
        this.head = new Node(value);
    }

    public void append(Node node) {
        if (this.head == null) {
            this.head = node;
            return;
        }

        Node current = this.head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = node;
    }

    public void append(int value) {
        if (this.head == null) {
            this.head = new Node(value);
            return;
        }

        Node current = this.head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(value);
    }

    public void printValues() {
        Node current = this.head;
        while (current != null) {
            System.out.print(current.value + " ");
            current = current.next;
        }
    }
}
