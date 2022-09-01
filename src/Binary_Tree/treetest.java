package Binary_Tree;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class treetest {
    private final Node a = new Node(4);
    private final Node b = new Node(1);
    private final Node c = new Node(8);
    private final Node d = new Node(2);
    private final Node e = new Node(16);
    private final Node f = new Node(4);
    private final Node g = new Node(6);
    private final Node h = new Node(7);

    private final Tree tree = new Tree(a);

    @BeforeEach
    void setUp() {
        a.left = b;
        a.right = c;
        c.left = e;
        c.right = d;
        b.left = f;
        f.left = g;
        f.right = h;
    }

    /**
     *         a
     *        / \
     *       b   c
     *      /   / \
     *     f   e   d
     *    / \
     *   g   h
     * sum = 48
     *
     * a-e 28
     * b-h 12
     */

    @Test
    void sum_Root_Success() {
        final int expected = 48;
        final int actual = tree.sum();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sum_b_Success() {
        final int expected = 18;
        final int actual = tree.sum(b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sum_c_Success() {
        final int expected = 26;
        final int actual = tree.sum(c);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void sum_f_Success() {
        final int expected = 17;
        final int actual = tree.sum(f);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void search_Four_Success() {
        Assertions.assertTrue(tree.includes(4));
    }

    @Test
    void includes_Sixteen_Success() {
        Assertions.assertTrue(tree.includes(16));
    }

    @Test
    void includes_Twelve_Success() {
        Assertions.assertFalse(tree.includes(12));
    }

    @Test
    void includes_MinusFour_Success() {
        Assertions.assertFalse(tree.includes(-4));
    }


    @Test
    void min_Root_Success() throws Exception {
        final int expected = 1;
        final int actual = tree.min();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void min_b_Success() throws Exception {
        final int expected = 1;
        final int actual = tree.min(b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void min_c_Success() throws Exception {
        final int expected = 2;
        final int actual = tree.min(c);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void max_Root_Success() throws Exception {
        final int expected = 16;
        final int actual = tree.max();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void max_b_Success() throws Exception {
        final int expected = 7;
        final int actual = tree.max(b);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void max_c_Success() throws Exception {
        final int expected = 16;
        final int actual = tree.max(c);
        Assertions.assertEquals(expected, actual);
    }


    @Test
    void maxRootSum_Root_Success() throws Exception {
        final int expected = 28;
        final int actual = tree.maxRootSum();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    void maxRootSum_b_Success() throws Exception {
        final int expected = 12;
        final int actual = (int) tree.maxRootSum(b);
        Assertions.assertEquals(expected, actual);
    }
}