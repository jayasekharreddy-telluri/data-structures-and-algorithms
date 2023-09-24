package binarytreebfs;

import com.binarytreebfs.LevelAveragesInABinaryTree;
import com.binarytreebfs.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LevelAveragesInABinaryTreeTest {

    @Test
    public void testLevelAverages() {
        // Create a simple binary tree for testing.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        // Calculate level averages and check the result.
        LevelAveragesInABinaryTree averages = new LevelAveragesInABinaryTree();
        List<Double> result = averages.findLevelAverages(root);

        // The expected result should be [1.0, 2.5, 4.5]
        assertEquals(3, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(2.5, result.get(1));
        assertEquals(4.5, result.get(2));
    }

    @Test
    public void testEmptyTree() {
        // Test with an empty tree.
        TreeNode root = null;
        LevelAveragesInABinaryTree averages = new LevelAveragesInABinaryTree();
        List<Double> result = averages.findLevelAverages(root);

        // The result should be an empty list.
        assertEquals(0, result.size());
    }

    @Test
    public void testSingleNodeTree() {
        // Test with a single node tree.
        TreeNode root = new TreeNode(42);
        LevelAveragesInABinaryTree averages = new LevelAveragesInABinaryTree();
        List<Double> result = averages.findLevelAverages(root);

        // The result should contain a single average value, which is 42.0.
        assertEquals(1, result.size());
        assertEquals(42.0, result.get(0));
    }

    @Test
    public void testUnbalancedTree() {
        // Test with an unbalanced tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.left.left = new TreeNode(5);

        LevelAveragesInABinaryTree averages = new LevelAveragesInABinaryTree();
        List<Double> result = averages.findLevelAverages(root);

        // The expected result should be [1.0, 2.0, 3.0, 4.0, 5.0]
        assertEquals(5, result.size());
        assertEquals(1.0, result.get(0));
        assertEquals(2.0, result.get(1));
        assertEquals(3.0, result.get(2));
        assertEquals(4.0, result.get(3));
        assertEquals(5.0, result.get(4));
    }
}
