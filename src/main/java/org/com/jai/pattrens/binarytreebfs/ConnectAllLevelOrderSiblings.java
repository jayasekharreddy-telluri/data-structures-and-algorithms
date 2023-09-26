package org.com.jai.pattrens.binarytreebfs;

import java.util.LinkedList;
import java.util.Queue;

public class ConnectAllLevelOrderSiblings {

    public static void connect(BinaryNode root) {

        if (root == null) {
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(root);

        BinaryNode previousNode = null;

        while (!queue.isEmpty()) {

            int levelSize = queue.size(); // Track the number of nodes in the current level.

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

                // Handle the last node in the current level.
                if (i == levelSize - 1) {
                    currentNode.next = null;
                }
            }
        }
    }

    public static void printConnectedSiblings(BinaryNode root) {
        if (root == null) {
            System.out.println("The tree is empty.");
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            System.out.print("Level " + (queue.size() - levelSize + 1) + ": ");

            for (int i = 0; i < levelSize; i++) {
                BinaryNode currentNode = queue.remove();
                System.out.print(currentNode.value + " ");

                if (currentNode.next != null) {
                    System.out.print("-> ");
                }

                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }

                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }

            System.out.println(); // Print a newline after each level.
        }
    }


        /*
                Time Complexity: O(N)
                Space Complexity: (N)
         */


    public static void main(String[] args) {

        BinaryNode root = new BinaryNode(12);
        root.left = new BinaryNode(7);
        root.right = new BinaryNode(1);
        root.left.left = new BinaryNode(9);
        root.right.left = new BinaryNode(10);
        root.right.right = new BinaryNode(5);

        connect(root);

        printConnectedSiblings(root);

    }
}
