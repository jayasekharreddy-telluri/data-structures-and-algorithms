package binarytreebfs;

import org.com.jai.pattrens.binarytreebfs.ReverseLevelOrderTraversal;
import org.com.jai.pattrens.binarytreebfs.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseLevelOrderTraversalTest {

    @Test
    public void testReverseLevelOrderTraversal() {
        // Create a simple binary tree for testing.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform reverse level order traversal and check the result.
        ReverseLevelOrderTraversal traversal = new ReverseLevelOrderTraversal();
        List<List<Integer>> result = traversal.traverse(root);

        // The expected result should be [[4, 5, 6, 7], [2, 3], [1]]
        assertEquals(3, result.size());
        assertEquals(4, result.get(0).get(0));
        assertEquals(5, result.get(0).get(1));
        assertEquals(6, result.get(0).get(2));
        assertEquals(7, result.get(0).get(3));
        assertEquals(2, result.get(1).get(0));
        assertEquals(3, result.get(1).get(1));
        assertEquals(1, result.get(2).get(0));
    }

    @Test
    public void testEmptyTree() {
        // Test with an empty tree.
        TreeNode root = null;
        ReverseLevelOrderTraversal traversal = new ReverseLevelOrderTraversal();
        List<List<Integer>> result = traversal.traverse(root);

        // The result should be an empty list.
        assertEquals(0, result.size());
    }

    @Test
    public void testSingleNodeTree() {
        // Test with a single node tree.
        TreeNode root = new TreeNode(42);
        ReverseLevelOrderTraversal traversal = new ReverseLevelOrderTraversal();
        List<List<Integer>> result = traversal.traverse(root);

        // The result should contain a single level with the value 42.
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(42, result.get(0).get(0));
    }

    @Test
    public void testUnbalancedTree() {
        // Test with an unbalanced tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);

        ReverseLevelOrderTraversal traversal = new ReverseLevelOrderTraversal();
        List<List<Integer>> result = traversal.traverse(root);

        // The expected result should be [[5], [4], [3], [2], [1]]
        assertEquals(5, result.size());
        assertEquals(5, result.get(0).get(0));
        assertEquals(4, result.get(1).get(0));
        assertEquals(3, result.get(2).get(0));
        assertEquals(2, result.get(3).get(0));
        assertEquals(1, result.get(4).get(0));
    }
}
