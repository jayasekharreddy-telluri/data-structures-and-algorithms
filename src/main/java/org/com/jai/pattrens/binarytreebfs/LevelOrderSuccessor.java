package org.com.jai.pattrens.binarytreebfs;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderSuccessor {

    public static TreeNode findSuccessor(TreeNode root, int key) {
        // Check if the root is null.
        if (root == null) {
            return null;
        }

        // Create a queue for breadth-first traversal starting with the root node.
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.remove();

            // Add the left and right children of the current node to the queue if they exist.
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }

            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }

            // Check if the current node's value matches the key.
            if (currentNode.value == key) {
                // If found, return the next node in the queue, which is the level order successor.
                if (!queue.isEmpty()) {
                    return queue.remove();
                }
            }
        }

        // If the key is not found or the key is in the last level, return null.
        return null;
    }

    public static void main(String[] args) {
        // Create a sample binary tree for testing.
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.right.right = new TreeNode(10);
        root.right.left = new TreeNode(5);

        // Find and print the level order successor of the key 5.
        TreeNode successor = findSuccessor(root, 5);
        System.out.println(successor != null ? successor.value : "Key not found");
    }
}
