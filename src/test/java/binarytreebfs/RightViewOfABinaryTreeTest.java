package binarytreebfs;

import org.com.jai.pattrens.binarytreebfs.RightViewOfABinaryTree;
import org.com.jai.pattrens.binarytreebfs.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RightViewOfABinaryTreeTest {

    private TreeNode root;

    @BeforeEach
    public void setUp() {
        root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(9);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
    }

    @Test
    public void testRightViewRegularTree() {
        List<TreeNode> result = RightViewOfABinaryTree.rightView(root);
        assertEquals(3, result.size());
        assertEquals(12, result.get(0).value);
        assertEquals(1, result.get(1).value);
        assertEquals(5, result.get(2).value);
    }

    @Test
    public void testRightViewSingleNodeTree() {
        TreeNode singleNode = new TreeNode(42);
        List<TreeNode> result = RightViewOfABinaryTree.rightView(singleNode);
        assertEquals(1, result.size());
        assertEquals(42, result.get(0).value);
    }

    @Test
    public void testRightViewEmptyTree() {
        TreeNode emptyRoot = null;
        List<TreeNode> result = RightViewOfABinaryTree.rightView(emptyRoot);
        assertEquals(0, result.size());
    }

    @Test
    public void testRightViewUnbalancedTree() {
        TreeNode unbalancedRoot = new TreeNode(12);
        unbalancedRoot.left = new TreeNode(7);
        unbalancedRoot.left.left = new TreeNode(9);

        List<TreeNode> result = RightViewOfABinaryTree.rightView(unbalancedRoot);
        assertEquals(3, result.size());
        assertEquals(12, result.get(0).value);
        assertEquals(7, result.get(1).value);
        assertEquals(9, result.get(2).value);
    }
}
