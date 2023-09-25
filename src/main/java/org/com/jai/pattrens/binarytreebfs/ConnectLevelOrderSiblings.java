package org.com.jai.pattrens.binarytreebfs;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectLevelOrderSiblings {

    public static void connect(BinaryNode root) {

        if (root == null) {
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();

        // Add the root node to the queue to start the traversal.
        queue.add(root);

        while (!queue.isEmpty()) {

            BinaryNode previousNode = null;

            int levelSize = queue.size();

            for (int i = 0; i < levelSize; i++) {

                BinaryNode currentNode = queue.remove();

                if (previousNode != null) {
                    previousNode.next = currentNode;
                }

                previousNode = currentNode;

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
        }
    }
        /*
                Time Complexity: O(N)
                Space Complexity: (N)
         */

    public static void printConnectedSiblingsLevelByLevel(BinaryNode root) {
        while (root != null) {
            BinaryNode currentNode = root;
            // Print the current level.
            while (currentNode != null) {
                System.out.print(currentNode.value + " ");
                currentNode = currentNode.next;
            }
            System.out.println(); // Print a newline after each level.
            // Move to the next level.
            root = root.left;
        }
    }


    public static void main(String[] args) {
        // Create a sample binary tree.
        BinaryNode root = new BinaryNode(12);
        root.left = new BinaryNode(7);
        root.right = new BinaryNode(1);
        root.left.left = new BinaryNode(9);
        root.right.left = new BinaryNode(10);
        root.right.right = new BinaryNode(5);

        // Connect the level-order siblings.
        connect(root);

        // You can now traverse the tree to verify the connections.
        printConnectedSiblingsLevelByLevel(root);
    }
}
