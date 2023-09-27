package org.com.jai.pattrens.binarytreebfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class RightViewOfABinaryTree {

    public static List<TreeNode> rightView(TreeNode root) {
        List<TreeNode> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode currentNode = queue.remove();

                // If it's the last node in the current level, add it to the result list.
                if (i == levelSize - 1) {
                    result.add(currentNode);
                }

                // Add the children to the queue for the next level.
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }

        return result;

        /*
                Time Complexity: O(N)
                Space Complexity: (M)
         */
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(12);
        root.left = new TreeNode(7);
        root.left.left = new TreeNode(9);
        root.right = new TreeNode(1);
        root.right.left = new TreeNode(10);
        root.right.right = new TreeNode(5);

        List<TreeNode> rightView = rightView(root);

        // Print the values of the nodes in the right view.
        for (TreeNode node : rightView) {
            System.out.println(node.value);
        }
    }
}
