package org.com.jai.pattrens.binarytreedfs;

public class PathWithGivenSequence {

    public static boolean findPath(TreeNode root, int[] sequence) {
        // If the root is null, check if the sequence is empty (indicating a match).
        if (root == null) {
            return sequence.length == 0;
        }

        // Start the recursive search from the root and the beginning of the sequence.
        return findPathRecursive(root, sequence, 0);
    }

    private static boolean findPathRecursive(TreeNode root, int[] sequence, int sequenceIndex) {
        // If the current node is null, or the current node's value does not match the sequence value at sequenceIndex, return false.
        if (root == null || sequenceIndex >= sequence.length || root.value != sequence[sequenceIndex]) {
            return false;
        }

        // If the current node is a leaf node and the sequenceIndex is at the end of the sequence, return true (found a match).
        if (root.left == null && root.right == null && sequenceIndex == sequence.length - 1) {
            return true;
        }

        // Recursively search in both left and right subtrees, incrementing the sequenceIndex.
        return findPathRecursive(root.left, sequence, sequenceIndex + 1)
                || findPathRecursive(root.right, sequence, sequenceIndex + 1);
    }

    public static void main(String[] args) {
        // Create a binary tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(0);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(5);

        // Check if there is a path with the given sequence [1, 1, 6].
        System.out.println(findPath(root, new int[] {1, 1, 6}));
    }
}
