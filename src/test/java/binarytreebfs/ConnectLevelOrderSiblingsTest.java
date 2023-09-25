package binarytreebfs;

import org.com.jai.pattrens.binarytreebfs.BinaryNode;
import org.com.jai.pattrens.binarytreebfs.ConnectLevelOrderSiblings;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ConnectLevelOrderSiblingsTest {

    @Test
    public void testConnectRegularBinaryTree() {

        BinaryNode root = new BinaryNode(12);
        root.left = new BinaryNode(7);
        root.right = new BinaryNode(1);
        root.left.left = new BinaryNode(9);
        root.right.left = new BinaryNode(10);
        root.right.right = new BinaryNode(5);

        ConnectLevelOrderSiblings.connect(root);

        assertNull(root.next);
        assertEquals(root.left.next, root.right);
        assertEquals(root.left.left.next, root.right.left);
        assertEquals(root.right.left.next, root.right.right);
        assertNull(root.right.right.next);
    }

    @Test
    public void testConnectSingleNodeTree() {

        BinaryNode root = new BinaryNode(42);

        ConnectLevelOrderSiblings.connect(root);

        assertNull(root.next);
    }

    @Test
    public void testConnectEmptyTree() {
        BinaryNode root = null;

        ConnectLevelOrderSiblings.connect(root);

        assertNull(root);
    }
}
