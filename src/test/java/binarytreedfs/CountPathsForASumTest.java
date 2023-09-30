package binarytreedfs;

import org.com.jai.pattrens.binarytreedfs.CountPathsForASum;
import org.com.jai.pattrens.binarytreedfs.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class CountPathsForASumTest {

    private TreeNode root;

    @BeforeEach
    public void setUp() {
        root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(3);
    }

    @Test
    public void testCountPathsWithValidSum() {
        // Test with a valid sum (12).
        assertEquals(3, CountPathsForASum.countPaths(root, 12));
    }

    @Test
    public void testCountPathsWithInvalidSum() {
        // Test with an invalid sum (20).
        assertEquals(0, CountPathsForASum.countPaths(root, 20));
    }

    @Test
    public void testCountPathsWithSingleNodeTree() {
        // Test with a single-node tree and a valid sum (42).
        TreeNode singleNode = new TreeNode(42);
        assertEquals(1, CountPathsForASum.countPaths(singleNode, 42));

        // Test with a single-node tree and an invalid sum (10).
        assertEquals(0, CountPathsForASum.countPaths(singleNode, 10));
    }

    @Test
    public void testCountPathsWithEmptyTree() {
        // Test with an empty tree (null root) and a valid sum (0).
        TreeNode emptyRoot = null;
        assertEquals(0, CountPathsForASum.countPaths(emptyRoot, 0));

        // Test with an empty tree (null root) and an invalid sum (10).
        assertEquals(0, CountPathsForASum.countPaths(emptyRoot, 10));
    }

}
