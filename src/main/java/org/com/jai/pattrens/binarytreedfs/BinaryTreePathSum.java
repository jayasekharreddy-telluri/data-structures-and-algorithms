package org.com.jai.pattrens.binarytreedfs;

public class BinaryTreePathSum {

    public static boolean hasPath(TreeNode root, int sum) {

        // Base case: If the root is null, there is no path, so return false.
        if (root == null) {
            return false;
        }

        // Check if the current node is a leaf and its value equals the target sum.
        if (root.value == sum && root.left == null && root.right == null) {
            return true;
        }

        // Recursively search for the path in the left and right subtrees.
        // We subtract the current node's value from the target sum.
        return hasPath(root.left, sum - root.value) || hasPath(root.right, sum - root.value);
    }

    public static void main(String[] args) {

        // Create a binary tree.
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(9);
        root.left.right = new TreeNode(10);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        // Check if there is a path with sum 23 starting from the root.
        System.out.println(hasPath(root, 23));
    }
}
