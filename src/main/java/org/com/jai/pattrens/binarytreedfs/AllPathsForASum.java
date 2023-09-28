package org.com.jai.pattrens.binarytreedfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AllPathsForASum {

    public static List<List<Integer>> findPaths(TreeNode root, int sum) {
        List<List<Integer>> allPaths = new LinkedList<>();
        List<Integer> currentPath = new ArrayList<>();
        findPathsRecursive(root, sum, allPaths, currentPath);
        return allPaths;
    }

    private static void findPathsRecursive(TreeNode currentNode, int sum, List<List<Integer>> allPaths, List<Integer> currentPath) {
        if (currentNode == null) {
            return;
        }

        currentPath.add(currentNode.value);

        if (currentNode.value == sum && currentNode.left == null && currentNode.right == null) {
            // If the current node is a leaf node and its value matches the sum, add the current path to allPaths.
            allPaths.add(new ArrayList<>(currentPath));
        } else {
            // Recursively explore left and right subtrees while subtracting the current node's value from the sum.
            findPathsRecursive(currentNode.left, sum - currentNode.value, allPaths, currentPath);
            findPathsRecursive(currentNode.right, sum - currentNode.value, allPaths, currentPath);
        }

        // Backtrack: Remove the current node from the currentPath before returning to the parent node.
        currentPath.remove(currentPath.size() - 1);
    }

    public static void main(String[] args) {
        // Create a binary tree.
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        // Check if there are paths with a sum of 23 starting from the root.
        List<List<Integer>> paths = findPaths(root, 23);

        // Print the found paths.
        for (List<Integer> path : paths) {
            System.out.println(path);
        }
    }
}
