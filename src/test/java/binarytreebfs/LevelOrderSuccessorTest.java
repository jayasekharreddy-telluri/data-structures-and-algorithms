package binarytreebfs;

import org.com.jai.pattrens.binarytreebfs.LevelOrderSuccessor;
import org.com.jai.pattrens.binarytreebfs.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class LevelOrderSuccessorTest {

    @Test
    public void testLevelOrderSuccessor() {
        // Create a sample binary tree for testing.
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.right.right = new TreeNode(10);
        root.right.left = new TreeNode(5);

        // Find the level order successor of the key 5 and check the result.
        TreeNode successor = LevelOrderSuccessor.findSuccessor(root, 5);
        assertNotNull(successor);
        assertEquals(9, successor.value);
    }

}
