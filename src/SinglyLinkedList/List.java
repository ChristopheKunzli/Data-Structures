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

    public void printValues(Node head) {
        if (head == null) return;
        System.out.print(head.value + " ");
        printValues(head.next);
    }

    public int sum() {
        int sum = 0;
        Node current = this.head;
        while (current != null) {
            sum += current.value;
            current = current.next;
        }
        return sum;
    }

    public int sum(Node head) {
        if (head == null) return 0;
        return head.value + sum(head.next);
    }

    public boolean includes(int target) {
        Node current = this.head;
        while (current != null) {
            if (current.value == target) return true;
            current = current.next;
        }
        return false;
    }

    public boolean includes(Node head, int target) {
        if (head == null) return false;
        if (head.value == target) return true;
        return includes(head.next, target);
    }

    public int getValue(int targetIndex) {
        Node current = this.head;
        int index = 0;
        while (index != targetIndex) {
            if(current.next == null) throw new IndexOutOfBoundsException();

            current = current.next;
            index++;
        }
        return current.value;
    }

    public Node reverseList(){
        Node previous = null;
        Node current = this.head;

        while (current != null){
            Node next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        this.head = previous;
        return previous;
    }
}
