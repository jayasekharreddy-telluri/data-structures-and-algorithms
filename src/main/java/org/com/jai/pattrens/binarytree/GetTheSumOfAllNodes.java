package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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

    public static int getHeightOfTree(BinaryNode node){

        if (node == null){

            return -1;
        }

        return Math.max(getHeightOfTree(node.left),getHeightOfTree(node.right)) + 1;

    }

    public static void printAtGivenLevel(BinaryNode node,int level){

        if (node == null){
            return;
        }
        if (level == 1){
            System.out.print(node.value + " ");
            return;
        }
        printAtGivenLevel(node.left,level - 1);
        printAtGivenLevel(node.right,level -1);
    }

    public static void levelOrderTraversalUsingRecurssion(BinaryNode node){

        if (node == null){
            return;
        }

        int height = getHeightOfTree(node);

        for (int i = 0; i <= height; i++){

            printAtGivenLevel(node, i + 1);

            System.out.println();
        }
    }

    public static void levelOrderTraversalUsingQueue(BinaryNode node){

        if (node == null){
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(node);

        while (!queue.isEmpty()){

            BinaryNode presantNode = queue.remove();

            System.out.print(presantNode.value + " ");

            if (presantNode.left != null){

                queue.add(presantNode.left);
            }

            if (presantNode.right != null){

                queue.add(presantNode.right);
            }

        }

    }


    public static void reverseLevelOrderTraversalUsingRecurssion(BinaryNode node){

        if (node == null){

            return;
        }

        int height = getHeightOfTree(node);

        for (int i = height; i >= 0; i--){

            printAtGivenLevel(node,i + 1);

            System.out.println();
        }
    }

    public static void reverseLevelOrderTravarselWithoutUsingRecursion(BinaryNode node){

        if (node == null){

            return;
        }

        Queue<BinaryNode> q = new LinkedList<>();

        q.add(node);

        Stack<BinaryNode> s = new Stack<>();

        while (!q.isEmpty()){

            BinaryNode presantNode = q.remove();

            if (presantNode.right != null){

                q.add(presantNode.right);
            }

            if (presantNode.left != null){

                q.add(presantNode.left);
            }

            s.add(presantNode);
        }

        while (s.size() > 0){

            System.out.print(s.pop().value + " ");

        }

    }


    public static void levelOrderTraversalUsingQueueLineByLine(BinaryNode node){

        if (node == null){
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(node);

        while(true) {

            int count = queue.size();

            if (count == 0){

                break;
            }

            while (count > 0) {

                BinaryNode presantNode = queue.remove();

                System.out.print(presantNode.value + " ");

                if (presantNode.left != null) {

                    queue.add(presantNode.left);
                }

                if (presantNode.right != null) {

                    queue.add(presantNode.right);
                }

                count--;
            }

            System.out.println();

        }

    }

    static int maxLength = 0;
    public static void leftViewOfBinaryTree(BinaryNode node,int level){

        if (node == null){
            return;
        }

        if (level >= maxLength){

            System.out.println(node.value);
            maxLength++;
        }

        leftViewOfBinaryTree(node.left, level + 1);
        leftViewOfBinaryTree(node.right, level + 1);
    }

    public static void rightViewOfBinaryTree(BinaryNode node,int level){

        if (node == null){
            return;
        }

        if (level >= maxLength){

            System.out.println(node.value);
            maxLength++;
        }

        rightViewOfBinaryTree(node.right, level + 1);
        rightViewOfBinaryTree(node.left, level + 1);
    }

    public static void inOrderTraversalWithOutRecurssion(BinaryNode node){

        if (node == null){
            return;
        }
        Stack<BinaryNode> stack = new Stack<>();

        while (node != null){

            stack.add(node);

            node = node.left;
        }

        while(stack.size() > 0){

            BinaryNode t = stack.pop();

            System.out.println(t.value + " ");

            if (t.right != null){

                BinaryNode temp = t.right;

                while (temp != null){

                    stack.push(temp);

                    temp = temp.left;
                }
            }
        }

    }


    public static void preOrderTraversalWithOutRecurssion(BinaryNode node) {

        if (node == null) {
            return;
        }
        Stack<BinaryNode> stack = new Stack<>();

        stack.add(node);

        while (!stack.isEmpty()) {

            BinaryNode temp = stack.pop();

            System.out.print(temp.value + " ");

            if (temp.right != null){

                stack.add(temp.right);
            }

            if (temp.left != null){

                stack.add(temp.left);
            }

        }

    }


    public static void postOrderTraversalWithOutRecurssion(BinaryNode node) {

        if (node == null) {
            return;
        }
        Stack<BinaryNode> stack = new Stack<>();

        Stack<BinaryNode> stackTwo = new Stack<>();

        stack.add(node);

        while (!stack.isEmpty()) {

            BinaryNode temp = stack.pop();

            if (temp.left != null){

                stack.add(temp.left);
            }

            if (temp.right != null){

                stack.add(temp.right);
            }

            stackTwo.push(temp);
        }

        while (stackTwo.size() > 0){

            System.out.print(stackTwo.pop().value + " ");
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

        //reverseLevelOrderTraversalUsingRecurssion(a.root);

        //reverseLevelOrderTravarselWithoutUsingRecursion(a.root);

        //levelOrderTraversalUsingQueueLineByLine(a.root);

        //leftViewOfBinaryTree(a.root, 0);
        //rightViewOfBinaryTree(a.root, 0);

        //inOrderTraversalWithOutRecurssion(a.root);
        //preOrderTraversalWithOutRecurssion(a.root);

        postOrderTraversalWithOutRecurssion(a.root);



    }
}
