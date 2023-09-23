package org.com.jai.pattrens.binarytreebfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LevelOrderTraversal {

    public static List<List<Integer>> traverse(TreeNode root) {

        // Create a list to store the result, which will be a list of levels.
        List<List<Integer>> result = new ArrayList<>();

        // Check if the root is null, and if so, return an empty result.
        if (root == null) {
            return result;
        }

        // Create a queue for breadth-first traversal starting with the root node.
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        // Start the BFS traversal.
        while (!queue.isEmpty()) {

            // Get the current level's size, which will be the number of nodes in this level.
            int levelSize = queue.size();

            // Create a list to store the values of nodes in the current level.
            List<Integer> currentLevel = new ArrayList<>();

            // Process each node in the current level.
            while (levelSize > 0) {

                // Remove the current node from the queue.
                TreeNode currentNode = queue.remove();

                // Add the value of the current node to the current level list.
                currentLevel.add(currentNode.value);

                // Add the left and right children of the current node to the queue if they exist.
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }

                // Decrease the level size to move to the next node in the level.
                levelSize--;
            }

            // Add the current level's list to the result list.
            result.add(currentLevel);
        }

        // Return the final result, which contains the levels of the binary tree.
        return result;

        /*
                Time Complexity: O(N)
                Space Complexity: (M)
         */
    }

    public static void main(String[] args) {

        // Create a binary tree as an example.
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(9);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        // Call the traverse function to perform level order traversal and print the result.
        System.out.println(traverse(root));
    }
}
