package org.com.jai.pattrens.binarytreedfs;

public class SumOfPathNumbers {

    public static int findSumOfPathNumbers(TreeNode root) {
        // Start with pathSum = 0 at the root.
        return findRootToLeafPathNumber(root, 0);
    }

    private static int findRootToLeafPathNumber(TreeNode root, int pathSum) {
        if (root == null) {
            return 0;
        }

        // Calculate the pathSum by adding the current node's value and shifting the existing sum by one decimal place.
        pathSum = 10 * pathSum + root.value;

        // If it's a leaf node, return the pathSum as the final path number.
        if (root.left == null && root.right == null) {
            return pathSum;
        }

        // Recursively calculate the path numbers for the left and right subtrees and sum them up.
        return findRootToLeafPathNumber(root.left, pathSum) + findRootToLeafPathNumber(root.right, pathSum);

        /*
            Time Complexity: O(N)
            Space Complexity: O(N)
         */
    }

    public static void main(String[] args) {
        // Create a binary tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);

        // Calculate the sum of path numbers starting from the root.
        System.out.println(findSumOfPathNumbers(root));
    }
}
