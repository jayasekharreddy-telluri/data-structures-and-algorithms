package binarytreedfs;

import com.binarytreedfs.BinaryTreePathSum;
import com.binarytreedfs.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BinaryTreePathSumTest {

    private TreeNode root;

    @BeforeEach
    public void setUp() {
        root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(10);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
    }

    @Test
    public void testHasPathWithValidSum() {
        // Test with a valid sum (23) that has a path.
        assertTrue(BinaryTreePathSum.hasPath(root, 23));
    }

    @Test
    public void testHasPathWithInvalidSum() {
        // Test with an invalid sum (20) that does not have a path.
        assertFalse(BinaryTreePathSum.hasPath(root, 20));
    }

    @Test
    public void testHasPathWithSingleNodeTree() {
        // Test with a single-node tree.
        TreeNode singleNode = new TreeNode(42);
        assertTrue(BinaryTreePathSum.hasPath(singleNode, 42));
        assertFalse(BinaryTreePathSum.hasPath(singleNode, 10));
    }

    @Test
    public void testHasPathWithEmptyTree() {
        // Test with an empty tree (null root).
        TreeNode emptyRoot = null;
        assertFalse(BinaryTreePathSum.hasPath(emptyRoot, 10));
    }
}
