package org.com.jai.pattrens.binarytreebfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelAveragesInABinaryTree {

    public static List<Double> findLevelAverages(TreeNode root) {
        // Create a list to store the average values for each level.
        List<Double> result = new ArrayList<>();

        // Check if the root is null.
        if (root == null) {
            return result;
        }

        // Create a queue for breadth-first traversal starting with the root node.
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            // Get the number of nodes in the current level.
            int levelSize = queue.size();

            // Initialize the sum for the current level.
            Double levelSum = 0.0;

            for (int i = 0; i < levelSize; i++) {
                // Remove the current node from the queue.
                TreeNode currentNode = queue.remove();

                // Add the value of the current node to the sum for the current level.
                levelSum += currentNode.value;

                // Add the left and right children of the current node to the queue if they exist.
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            // Calculate and add the average value for the current level to the result list.
            result.add(levelSum / levelSize);
        }

        return result;
    }

    public static void main(String[] args) {
        // Create a sample binary tree for testing.
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(9);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        // Call the findLevelAverages function to find and print the level averages.
        System.out.println(findLevelAverages(root));
    }
}
