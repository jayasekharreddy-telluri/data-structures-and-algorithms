package binarytreedfs;

import org.com.jai.pattrens.binarytreedfs.PathWithMaximumSum;
import org.com.jai.pattrens.binarytreedfs.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class PathWithMaximumSumTest {

    private TreeNode root;

    @BeforeEach
    public void setUp() {

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);
    }

    @Test
    public void testFindMaximumPathSum() {
        assertEquals(16, PathWithMaximumSum.findMaximumPathSum(root));
    }

    @Test
    public void testFindMaximumPathSumWithSingleNodeTree() {
        // Test with a single-node tree.
        TreeNode singleNode = new TreeNode(42);
        // Maximum path sum of a single-node tree is the node's value (42).
        assertEquals(42, PathWithMaximumSum.findMaximumPathSum(singleNode));
    }

    @Test
    public void testFindMaximumPathSumWithEmptyTree() {
        // Test with an empty tree (null root).
        TreeNode emptyRoot = null;
        // Maximum path sum of an empty tree is Integer.MIN_VALUE.
        assertEquals(Integer.MIN_VALUE, PathWithMaximumSum.findMaximumPathSum(emptyRoot));
    }

    @Test
    public void testFindMaximumPathSumWithNegativeValues() {

        TreeNode negativeRoot = new TreeNode(-1);
        negativeRoot.left = new TreeNode(-2);
        negativeRoot.right = new TreeNode(-3);
        negativeRoot.left.right = new TreeNode(-4);
        negativeRoot.right.right = new TreeNode(-5);

        // The maximum path sum is -1 (path: -2 -> -1 -> -3).
        assertEquals(-1, PathWithMaximumSum.findMaximumPathSum(negativeRoot));
    }
}
