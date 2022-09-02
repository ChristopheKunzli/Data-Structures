package SinglyLinkedList;

public class Node {
    public int value;
    public Node next = null;

    public Node(int value) {
        this.value = value;
    }
    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }
}
