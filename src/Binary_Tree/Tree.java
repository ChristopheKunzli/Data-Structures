package Binary_Tree;

import java.util.LinkedList;

public class Tree {
    private final Node root;

    Tree(Node root) {
        this.root = root;
    }

    public int sum() {
        return sum(this.root);
    }

    public int sum(Node root) {
        if (root == null) return 0;
        return root.value + sum(root.left) + sum(root.right);
    }

    public boolean includes(int target) {
        return includes(this.root, target);
    }

    public boolean includes(Node root, int target) {
        if (root == null) return false;
        return root.value == target || includes(root.left, target) || includes(root.right, target);
    }

    public int min() {
        return min(this.root);
    }

    public int min(Node root) {
        LinkedList <Node> queue = new LinkedList<Node>();
        queue.add(root);

        int min = root.value;

        while(!queue.isEmpty()){
            final Node current = queue.removeFirst();

            if (current.value < min)
                min = current.value;

            if(current.left != null)
                queue.add(current.left);

            if(current.right != null)
                queue.add(current.right);
        }
        return min;
    }
    public int max() {
        return max(this.root);
    }

    public int max(Node root) {
        LinkedList <Node> stack = new LinkedList<Node>();
        stack.add(root);

        int max = root.value;

        while(!stack.isEmpty()){
            final Node current = stack.removeLast();

            if (current.value > max)
                max = current.value;

            if(current.left != null)
                stack.add(current.left);

            if(current.right != null)
                stack.add(current.right);
        }
        return max;
    }

}
