package binarytreebfs;

import com.binarytreebfs.TreeNode;
import com.binarytreebfs.ZigzagTraversal;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ZigzagTraversalTest {

    @Test
    public void testZigzagTraversal() {
        // Create a simple binary tree for testing.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Perform zigzag traversal and check the result.
        ZigzagTraversal traversal = new ZigzagTraversal();
        List<List<Integer>> result = traversal.traverse(root);

        // The expected result should be [[1], [3, 2], [4, 5, 6, 7]]
        assertEquals(3, result.size());
        assertEquals(1, result.get(0).get(0));
        assertEquals(3, result.get(1).get(0));
        assertEquals(2, result.get(1).get(1));
        assertEquals(4, result.get(2).get(0));
        assertEquals(5, result.get(2).get(1));
        assertEquals(6, result.get(2).get(2));
        assertEquals(7, result.get(2).get(3));
    }

    @Test
    public void testEmptyTree() {
        // Test with an empty tree.
        TreeNode root = null;
        ZigzagTraversal traversal = new ZigzagTraversal();
        List<List<Integer>> result = traversal.traverse(root);

        // The result should be an empty list.
        assertEquals(0, result.size());
    }

    @Test
    public void testSingleNodeTree() {
        // Test with a single node tree.
        TreeNode root = new TreeNode(42);
        ZigzagTraversal traversal = new ZigzagTraversal();
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

        ZigzagTraversal traversal = new ZigzagTraversal();
        List<List<Integer>> result = traversal.traverse(root);

        // The expected result should be [[1], [2], [3], [4], [5]]
        assertEquals(5, result.size());
        assertEquals(1, result.get(0).get(0));
        assertEquals(2, result.get(1).get(0));
        assertEquals(3, result.get(2).get(0));
        assertEquals(4, result.get(3).get(0));
        assertEquals(5, result.get(4).get(0));
    }

    @Test
    public void testZigzagWithLargeValues() {
        // Test with large values in the tree.
        TreeNode root = new TreeNode(Integer.MAX_VALUE);
        root.left = new TreeNode(Integer.MAX_VALUE - 1);
        root.right = new TreeNode(Integer.MAX_VALUE - 2);

        ZigzagTraversal traversal = new ZigzagTraversal();
        List<List<Integer>> result = traversal.traverse(root);

        // The expected result should be [[2147483647], [2147483646, 2147483645]]
        assertEquals(2, result.size());
        assertEquals(Integer.MAX_VALUE, result.get(0).get(0));
        assertEquals(Integer.MAX_VALUE - 1, result.get(1).get(0));
        assertEquals(Integer.MAX_VALUE - 2, result.get(1).get(1));
    }
}
