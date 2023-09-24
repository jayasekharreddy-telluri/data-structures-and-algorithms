package binarytreebfs;

import org.com.jai.pattrens.binarytreebfs.MinimumDepthOfABinaryTree;
import org.com.jai.pattrens.binarytreebfs.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumDepthOfABinaryTreeTest {

    @Test
    public void testMinimumDepth() {
        // Create a simple binary tree for testing.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        // Calculate the minimum depth and check the result.
        int depth = MinimumDepthOfABinaryTree.findDepth(root);

        // The expected result should be 2 (minimum depth from root to leaf 2).
        assertEquals(2, depth);
    }

    @Test
    public void testEmptyTree() {
        // Test with an empty tree.
        TreeNode root = null;
        int depth = MinimumDepthOfABinaryTree.findDepth(root);

        // The result should be 0 for an empty tree.
        assertEquals(0, depth);
    }

    @Test
    public void testSingleNodeTree() {
        // Test with a single node tree.
        TreeNode root = new TreeNode(42);
        int depth = MinimumDepthOfABinaryTree.findDepth(root);

        // The result should be 1 for a single node tree.
        assertEquals(1, depth);
    }

    @Test
    public void testUnbalancedTree() {
        // Test with an unbalanced tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);

        int depth = MinimumDepthOfABinaryTree.findDepth(root);

        // The expected result should be 4 (minimum depth from root to leaf 4).
        assertEquals(4, depth);
    }

}
