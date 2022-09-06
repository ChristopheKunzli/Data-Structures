package DoublyLinkedList;

import org.jetbrains.annotations.NotNull;

public class List {
    private Node head = null;
    private Node tail = null;

    public List() {
    }

    public List(Node head) {
        this.head = this.tail = head;
    }

    public List(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public List(int[] values) {
        this.head = this.tail = new Node(values[0]);

        for (int i = 1; i < values.length; ++i) {
            this.append(new Node(values[i]));
        }
    }

    public List(Node[] nodes) {
        this.head = this.tail = nodes[0];

        for (int i = 1; i < nodes.length; ++i) {
            this.append(nodes[i]);
        }
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public void append(Node node) {
        if (this.head == null) {
            this.head = this.tail = node;
            return;
        }

        this.tail.setNext(node);
        node.setPrevious(this.tail);
        this.tail = node;
    }

}
