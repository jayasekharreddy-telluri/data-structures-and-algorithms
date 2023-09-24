package org.com.jai.pattrens.binarytreebfs;

import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthOfABinaryTree {

    public static int findDepth(TreeNode root) {
        // Check if the root is null.
        if (root == null) {
            return 0;
        }

        // Create a queue for breadth-first traversal starting with the root node.
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // Initialize the minimum depth.
        int minimumDepth = 0;

        while (!queue.isEmpty()) {
            // Increment the minimum depth at each level.
            minimumDepth++;

            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                // Remove the current node from the queue.
                TreeNode currentNode = queue.poll();

                // If the current node is a leaf node, return the minimum depth.
                if (currentNode.left == null && currentNode.right == null) {
                    return minimumDepth;
                }

                // Add the left and right children of the current node to the queue if they exist.
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }

        return minimumDepth;
    }

    public static void main(String[] args) {
        // Create a sample binary tree for testing.
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.right.right = new TreeNode(10);
        root.right.left = new TreeNode(5);

        // Call the findDepth function to find and print the minimum depth.
        System.out.println(findDepth(root));
    }
}
