package binarytreedfs;

import com.binarytreedfs.SumOfPathNumbers;
import com.binarytreedfs.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumOfPathNumbersTest {

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
    public void testFindSumOfPathNumbers() {
        assertEquals(332, SumOfPathNumbers.findSumOfPathNumbers(root));
    }

    @Test
    public void testFindSumOfPathNumbersWithSingleNodeTree() {
        TreeNode singleNode = new TreeNode(42);
        assertEquals(42, SumOfPathNumbers.findSumOfPathNumbers(singleNode));
    }

    @Test
    public void testFindSumOfPathNumbersWithEmptyTree() {
        TreeNode emptyRoot = null;
        assertEquals(0, SumOfPathNumbers.findSumOfPathNumbers(emptyRoot));
    }

}
