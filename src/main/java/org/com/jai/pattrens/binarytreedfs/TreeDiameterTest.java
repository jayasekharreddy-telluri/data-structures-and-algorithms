package org.com.jai.pattrens.binarytreedfs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TreeDiameterTest {

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
    public void testFindDiameter() {
        // The diameter of the tree is 6 (path: 6 -> 7 -> 1 -> 9 -> 2).
        assertEquals(6, TreeDiameter.findDiameter(root));
    }

    @Test
    public void testFindDiameterWithSingleNodeTree() {
        // Test with a single-node tree.
        TreeNode singleNode = new TreeNode(42);
        // Diameter of a single-node tree is 0.
        assertEquals(0, TreeDiameter.findDiameter(singleNode));
    }

    @Test
    public void testFindDiameterWithEmptyTree() {
        // Test with an empty tree (null root).
        TreeNode emptyRoot = null;
        // Diameter of an empty tree is 0.
        assertEquals(0, TreeDiameter.findDiameter(emptyRoot));
    }

    @Test
    public void testFindDiameterWithSkewedTree() {

        TreeNode skewedRoot = new TreeNode(1);
        skewedRoot.right = new TreeNode(2);
        skewedRoot.right.right = new TreeNode(3);
        skewedRoot.right.right.right = new TreeNode(4);

        // The diameter of the skewed tree is 4 (path: 1 -> 2 -> 3 -> 4).
        assertEquals(4, TreeDiameter.findDiameter(skewedRoot));
    }
}
