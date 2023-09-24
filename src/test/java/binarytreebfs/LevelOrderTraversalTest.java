package binarytreebfs;

import org.com.jai.pattrens.binarytreebfs.LevelOrderTraversal;
import org.com.jai.pattrens.binarytreebfs.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class LevelOrderTraversalTest {

    @Test
    public void testLevelOrderTraversal() {

        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        LevelOrderTraversal traversal = new LevelOrderTraversal();

        List<List<Integer>> result = traversal.traverse(root);

        assertEquals(3, result.size());

        assertEquals(Optional.of(1), result.get(0).get(0));
        assertEquals(Optional.of(2), result.get(1).get(0));

    }

    @Test
    public void testEmptyTree() {
        // Test with an empty tree.
        TreeNode root = null;
        LevelOrderTraversal traversal = new LevelOrderTraversal();
        List<List<Integer>> result = traversal.traverse(root);

        // The result should be an empty list.
        assertEquals(0, result.size());
    }

    @Test
    public void testSingleNodeTree() {
        // Test with a single node tree.
        TreeNode root = new TreeNode(42);
        LevelOrderTraversal traversal = new LevelOrderTraversal();
        List<List<Integer>> result = traversal.traverse(root);

        // The result should contain a single level with the value 42.
        assertEquals(1, result.size());
        assertEquals(1, result.get(0).size());
        assertEquals(Optional.of(42), result.get(0).get(0));
    }



}
