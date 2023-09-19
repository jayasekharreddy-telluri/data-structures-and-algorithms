package org.com.jai.pattrens.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class GetTheSumOfAllNodes {

    static class BinaryNode {
        int value;
        BinaryNode left;
        BinaryNode right;

        BinaryNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    BinaryNode root;

    GetTheSumOfAllNodes() {
        this.root = null;
    }

    public static int getSumOfNodes(BinaryNode node) {
        if (node == null) {
            return 0;
        }
        return node.value + getSumOfNodes(node.left) + getSumOfNodes(node.right);
    }

    public static int getNumberOfNodes(BinaryNode node) {

        if (node == null) {

            return 0;
        }
        return 1 + getNumberOfNodes(node.left) + getNumberOfNodes(node.right);
    }


    public static int getNumberOfLeafNodes(BinaryNode node) {

        if (node == null) {

            return 0;
        }
        if (node.left == null && node.right == null) {

            return 1;
        }
        return getNumberOfLeafNodes(node.left) + getNumberOfLeafNodes(node.right);
    }

    public static int getHeightOfTree(BinaryNode node) {

        if (node == null) {

            return -1;
        }

        return Math.max(getHeightOfTree(node.left), getHeightOfTree(node.right)) + 1;

    }

    public static void printAtGivenLevel(BinaryNode node, int level) {

        if (node == null) {
            return;
        }
        if (level == 1) {
            System.out.print(node.value + " ");
            return;
        }
        printAtGivenLevel(node.left, level - 1);
        printAtGivenLevel(node.right, level - 1);
    }

    public static void levelOrderTraversalUsingRecurssion(BinaryNode node) {

        if (node == null) {
            return;
        }

        int height = getHeightOfTree(node);

        for (int i = 0; i <= height; i++) {

            printAtGivenLevel(node, i + 1);

            System.out.println();
        }
    }

    public static void levelOrderTraversalUsingQueue(BinaryNode node) {

        if (node == null) {
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()) {

            BinaryNode presantNode = queue.remove();

            System.out.print(presantNode.value + " ");

            if (presantNode.left != null) {

                queue.add(presantNode.left);
            }

            if (presantNode.right != null) {

                queue.add(presantNode.right);
            }

        }

    }


    public static void reverseLevelOrderTraversalUsingRecurssion(BinaryNode node) {

        if (node == null) {

            return;
        }

        int height = getHeightOfTree(node);

        for (int i = height; i >= 0; i--) {

            printAtGivenLevel(node, i + 1);

            System.out.println();
        }
    }


    public static void main(String[] args) {

        GetTheSumOfAllNodes a = new GetTheSumOfAllNodes();

        BinaryNode n1 = new BinaryNode(1);
        BinaryNode n2 = new BinaryNode(2);
        BinaryNode n3 = new BinaryNode(3);
        BinaryNode n4 = new BinaryNode(4);
        BinaryNode n5 = new BinaryNode(5);
        BinaryNode n6 = new BinaryNode(6);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;

        a.root = n1;

        //System.out.println(getSumOfNodes(a.root));

        //System.out.println(getNumberOfNodes(a.root));

        //System.out.println(getNumberOfLeafNodes(a.root));

        //System.out.println(getHeightOfTree(a.root));

        //printAtGivenLevel(a.root, 3);

        //levelOrderTraversalUsingRecurssion(a.root);

        //levelOrderTraversalUsingQueue(a.root);

        reverseLevelOrderTraversalUsingRecurssion(a.root);


    }
}
