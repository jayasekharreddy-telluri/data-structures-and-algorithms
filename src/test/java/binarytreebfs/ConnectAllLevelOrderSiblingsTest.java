package binarytreebfs;

import org.com.jai.pattrens.binarytreebfs.BinaryNode;
import org.com.jai.pattrens.binarytreebfs.ConnectAllLevelOrderSiblings;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ConnectAllLevelOrderSiblingsTest {

    private BinaryNode root;

    @BeforeEach
    public void setUp() {
        root = new BinaryNode(12);
        root.left = new BinaryNode(7);
        root.right = new BinaryNode(1);
        root.left.left = new BinaryNode(9);
        root.right.left = new BinaryNode(10);
        root.right.right = new BinaryNode(5);
    }

    @Test
    public void testConnectSiblings() {
        ConnectAllLevelOrderSiblings.connect(root);
        // Test level 1: 12
        assertNull(root.next);

        // Test level 2: 7 -> 1
        assertEquals(root.left.next, root.right);

        // Test level 3: 9 -> 10 -> 5
        assertEquals(root.left.left.next, root.right.left);
        assertEquals(root.right.left.next, root.right.right);
        assertNull(root.right.right.next);
    }

    @Test
    public void testConnectSingleNode() {
        BinaryNode singleNode = new BinaryNode(42);
        ConnectAllLevelOrderSiblings.connect(singleNode);
        assertNull(singleNode.next);
    }

    @Test
    public void testConnectEmptyTree() {
        BinaryNode emptyRoot = null;
        ConnectAllLevelOrderSiblings.connect(emptyRoot);
        assertNull(emptyRoot);
    }
}
