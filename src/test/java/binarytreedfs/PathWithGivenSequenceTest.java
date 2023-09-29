package binarytreedfs;

import com.binarytreedfs.PathWithGivenSequence;
import com.binarytreedfs.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PathWithGivenSequenceTest {

    private TreeNode root;

    @BeforeEach
    public void setUp() {

        root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);
    }

    @Test
    public void testFindPathWithValidSequence() {
        // Test with a valid sequence [1, 1, 6].
        assertTrue(PathWithGivenSequence.findPath(root, new int[]{1, 1, 6}));
    }

    @Test
    public void testFindPathWithInvalidSequence() {
        // Test with an invalid sequence [1, 0, 6].
        assertFalse(PathWithGivenSequence.findPath(root, new int[]{1, 0, 6}));
    }

    @Test
    public void testFindPathWithSingleNodeTree() {
        // Test with a single-node tree and a valid sequence [42].
        TreeNode singleNode = new TreeNode(42);
        assertTrue(PathWithGivenSequence.findPath(singleNode, new int[]{42}));

        // Test with an invalid sequence [10].
        assertFalse(PathWithGivenSequence.findPath(singleNode, new int[]{10}));
    }


}
