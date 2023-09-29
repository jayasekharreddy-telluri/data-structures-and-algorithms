package binarytreedfs;

import org.com.jai.pattrens.binarytreedfs.AllPathsForASum;
import org.com.jai.pattrens.binarytreedfs.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AllPathsForASumTest {

    private TreeNode root;

    @BeforeEach
    public void setUp() {

        root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(10);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);
    }

    @Test
    public void testFindPathsForValidSum() {
        List<List<Integer>> paths = AllPathsForASum.findPaths(root, 23);
        assertEquals(2, paths.size());
        assertEquals(List.of(12, 7, 4), paths.get(0));
        assertEquals(List.of(12, 1, 10), paths.get(1));
    }

    @Test
    public void testFindPathsForInvalidSum() {
        List<List<Integer>> paths = AllPathsForASum.findPaths(root, 20);
        assertEquals(0, paths.size());
    }

    @Test
    public void testFindPathsForSingleNodeTree() {
        TreeNode singleNode = new TreeNode(42);
        List<List<Integer>> paths = AllPathsForASum.findPaths(singleNode, 42);
        assertEquals(1, paths.size());
        assertEquals(List.of(42), paths.get(0));

        paths = AllPathsForASum.findPaths(singleNode, 10);
        assertEquals(0, paths.size());
    }

    @Test
    public void testFindPathsForEmptyTree() {
        TreeNode emptyRoot = null;
        List<List<Integer>> paths = AllPathsForASum.findPaths(emptyRoot, 10);
        assertEquals(0, paths.size());
    }

}
