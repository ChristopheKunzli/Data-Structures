package Binary_Tree;

public class Node {
    //Fields
    public int value;
    public Node left = null;
    public Node right = null;
    //end Fields


    //Constructors
    public Node(int value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public Node(int value) {
        this.value = value;
    }
    //end Constructors

}
