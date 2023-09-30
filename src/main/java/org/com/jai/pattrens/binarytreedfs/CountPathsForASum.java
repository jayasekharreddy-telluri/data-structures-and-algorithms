package org.com.jai.pattrens.binarytreedfs;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class CountPathsForASum {

    public static int countPaths(TreeNode root, int sum) {
        // Start with an empty currentPath list.
        List<Integer> currentPath = new LinkedList<>();
        // Start the recursive counting process.
        return countPathsRecursive(root, currentPath, sum);
    }

    private static int countPathsRecursive(TreeNode currentNode, List<Integer> currentPath, int sum) {
        if (currentNode == null) {
            return 0;
        }

        currentPath.add(currentNode.value);

        int pathCount = 0;
        int pathSum = 0;

        // Iterate through the currentPath in reverse order to calculate path sums.
        ListIterator<Integer> pathIterator = currentPath.listIterator(currentPath.size());
        while (pathIterator.hasPrevious()) {
            pathSum += pathIterator.previous();
            if (pathSum == sum) {
                pathCount++;
            }
        }

        // Recursively count paths in the left and right subtrees.
        pathCount += countPathsRecursive(currentNode.left, currentPath, sum);
        pathCount += countPathsRecursive(currentNode.right, currentPath, sum);

        // Backtrack: Remove the current node from the currentPath before returning to the parent node.
        currentPath.remove(currentPath.size() - 1);

        return pathCount;

        /*
            Time Complexity: O(N^2)
            Space Complexity: O(H)
         */
    }

    public static void main(String[] args) {
        // Create a binary tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(3);

        // Count paths with a sum of 12 starting from the root.
        System.out.println(countPaths(root, 12));
    }
}
