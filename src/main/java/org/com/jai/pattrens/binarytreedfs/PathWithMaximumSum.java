package org.com.jai.pattrens.binarytreedfs;

public class PathWithMaximumSum {

    private static int globalMaximumSum;

    public static int findMaximumPathSum(TreeNode root) {
        // Initialize the global maximum sum to the minimum integer value.
        globalMaximumSum = Integer.MIN_VALUE;
        // Start the recursive search for the maximum path sum.
        findMaximumPathSumRecursive(root);
        // Return the global maximum sum found.
        return globalMaximumSum;
    }

    private static int findMaximumPathSumRecursive(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // Recursively find the maximum path sum from the left and right subtrees.
        int maxPathSumFromLeft = findMaximumPathSumRecursive(root.left);
        int maxPathSumFromRight = findMaximumPathSumRecursive(root.right);

        // Ensure that negative values are treated as 0 (pruning).
        maxPathSumFromLeft = Math.max(maxPathSumFromLeft, 0);
        maxPathSumFromRight = Math.max(maxPathSumFromRight, 0);

        // Calculate the local maximum sum including the current node.
        int localMaximumSum = maxPathSumFromLeft + maxPathSumFromRight + root.value;

        // Update the global maximum sum if the local maximum is greater.
        globalMaximumSum = Math.max(globalMaximumSum, localMaximumSum);

        // Return the maximum path sum achievable from either the left or right subtree plus the current node's value.
        return Math.max(maxPathSumFromLeft, maxPathSumFromRight) + root.value;


        /*
            Time Complexity: O(N)
            Space Complexity: O(N)
         */
    }

    public static void main(String[] args) {
        // Create a binary tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(6);

        // Find the maximum path sum.
        System.out.println(findMaximumPathSum(root));
    }
}
