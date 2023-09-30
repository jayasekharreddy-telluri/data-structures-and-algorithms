package org.com.jai.pattrens.binarytreedfs;

public class TreeDiameter {

    private static int treeDiameter = 0;

    public static int findDiameter(TreeNode root) {
        // Calculate the diameter by recursively calculating the height of the tree.
        calculateHeight(root);
        return treeDiameter;
    }

    private static int calculateHeight(TreeNode currentNode) {
        if (currentNode == null) {
            return 0;
        }

        // Calculate the height of the left and right subtrees.
        int heightOfLeftTree = calculateHeight(currentNode.left);
        int heightOfRightTree = calculateHeight(currentNode.right);

        // Calculate the diameter passing through the current node.
        int diameter = heightOfLeftTree + heightOfRightTree + 1;

        // Update the treeDiameter with the maximum diameter found so far.
        treeDiameter = Math.max(treeDiameter, diameter);

        // Return the maximum height of the left or right subtree, plus one for the current node.
        return Math.max(heightOfLeftTree, heightOfRightTree) + 1;


        /*
            Time Complexity: O(N)
            Space Complexity: O(N)
         */
    }

    public static void main(String[] args) {
        // Create a binary tree.
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(9);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(2);
        root.right.right = new TreeNode(3);

        // Find the diameter of the tree.
        System.out.println(findDiameter(root));
    }
}
