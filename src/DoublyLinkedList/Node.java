package DoublyLinkedList;

public class Node {
    private int value;
    private Node next = null;
    private Node previous = null;


    public Node(int value) {
        this.value = value;
    }

    public Node(int value, Node previous, Node next) {
        this.value = value;
        this.previous = previous;
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }


}
