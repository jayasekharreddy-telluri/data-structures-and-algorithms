package binarytreedfs;

import java.util.ArrayList;
import java.util.List;

public class RootToLeafPathWithMaximumSum {

    private static int maxSum = Integer.MIN_VALUE;
    private static List<Integer> maxSumPath = new ArrayList<>();

    public static int findMaximumSum(TreeNode root) {
        // Start the recursive traversal to find the maximum sum.
        findMaximumSumRecursively(root, 0, new ArrayList<>());

        // Return the maximum sum found.
        return maxSum;
    }

    private static void findMaximumSumRecursively(TreeNode currentNode, int currentSum, List<Integer> currentPath) {
        if (currentNode == null) {
            return;
        }

        // Add the current node's value to the current sum.
        currentSum += currentNode.value;

        // Add the current node to the current path.
        currentPath.add(currentNode.value);

        if (currentNode.left == null && currentNode.right == null) {
            // If it's a leaf node, check if the current sum is greater than the maximum sum.
            if (currentSum > maxSum) {
                // If so, update the maximum sum and the maximum sum path.
                maxSum = currentSum;
                maxSumPath = new ArrayList<>(currentPath);
            }
        } else {
            // Recursively explore the left and right subtrees.
            findMaximumSumRecursively(currentNode.left, currentSum, currentPath);
            findMaximumSumRecursively(currentNode.right, currentSum, currentPath);
        }

        // Remove the current node from the current path when backtracking.
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

        // Find the maximum sum path starting from the root.
        int maxSum = findMaximumSum(root);

        // Print the maximum sum and the corresponding path.
        System.out.println("Maximum Sum: " + maxSum);
        System.out.println("Path with Maximum Sum: " + maxSumPath);
    }
}
