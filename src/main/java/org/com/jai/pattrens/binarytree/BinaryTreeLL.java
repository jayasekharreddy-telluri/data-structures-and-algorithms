package org.com.jai.pattrens.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLL {

    static BinaryNode root;

    /*
            creation of binary tree
            time complexity - O(1)
            space complexity - O(1)
     */
    public BinaryTreeLL() {

        this.root = null;

    }


    /*
            pre-order traversal of binary tree
            time complexity - O(n)
            space complexity - O(n)
     */
    static void preOrder(BinaryNode node) {

        if (node == null) {
            return;
        }

        System.out.print(node.value + " ");

        preOrder(node.left);

        preOrder(node.right);

    }


    /*
            in-order traversal of binary tree
            time complexity - O(n)
            space complexity - O(n)
     */

    static void inOrder(BinaryNode node) {

        if (node == null) {

            return;
        }

        inOrder(node.left);
        System.out.print(node.value + " ");
        inOrder(node.right);
    }


    /*
            post-order traversal of binary tree
            time complexity - O(n)
            space complexity - O(n)
     */
    static void postOrder(BinaryNode node) {

        if (node == null) {

            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + " ");
    }


    /*
            level-order traversal of binary tree
            time complexity - O(n)
            space complexity - O(n)
     */

    static void levelOrder() {

        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(root);

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


    /*
            search using : level-order traversal of binary tree
            time complexity - O(n)
            space complexity - O(n)
     */
    static void search(String value) {

        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            BinaryNode presantNode = queue.remove();

            if (presantNode.value == value) {

                System.out.println(value + " found ");
                return;
            } else {
                if (presantNode.left != null) {

                    queue.add(presantNode.left);
                }

                if (presantNode.right != null) {

                    queue.add(presantNode.right);
                }
            }
        }

        System.out.println(value + " not found ");
    }


    /*
            insert using : level-order traversal of binary tree
            time complexity - O(n)
            space complexity - O(n)
     */
    static void insert(String value) {

        BinaryNode newNode = new BinaryNode();

        newNode.value = value;

        if (root == null) {
            root = newNode;
            System.out.println(value + " inserted at root");
            return;
        }

        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {

            BinaryNode presantNode = queue.remove();

            if (presantNode.left == null) {

                presantNode.left = newNode;

                System.out.println(value + " is inserted");

                break;

            } else if (presantNode.right == null) {

                presantNode.right = newNode;

                System.out.println(value + " is inserted");
                break;
            } else {
                queue.add(presantNode.left);

                queue.add(presantNode.right);
            }

        }


    }

    static BinaryNode getTheDeepestNode(){

        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(root);

        BinaryNode presantNode = null;

        while (!queue.isEmpty()){

            presantNode = queue.remove();

            if (presantNode.left != null){

                queue.add(presantNode.left);
            }
            if (presantNode.right != null){

                queue.add(presantNode.right);
            }

        }
        return presantNode;
    }

    static void deleteTheDeepestNode(){

        Queue<BinaryNode> queue = new LinkedList<>();

        queue.add(root);

        BinaryNode previousNode ,presantNode = null;

        while (!queue.isEmpty()){

            previousNode = presantNode;

            presantNode = queue.remove();

            if (presantNode.left == null){

                previousNode.right = null;

                return;
            }
            if (presantNode.right == null){

                previousNode.left = null;

                return;
            }else{
                queue.add(presantNode.left);

                queue.add(presantNode.right);

            }

        }
    }


    /*
            delete using : level-order traversal of binary tree
            time complexity - O(n)
            space complexity - O(n)
     */
    static void deleteGivenNode(String value)
    {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();

        queue.add(root);

        while (!queue.isEmpty()) {
            BinaryNode presntNode = queue.remove();

            if (presntNode.value == value) {
                presntNode.value=getTheDeepestNode().value;
                deleteTheDeepestNode();
                System.out.println( presntNode.value +"value is deleted ");
                return;
            }

            else {

                if (presntNode.left != null) {
                    queue.add(presntNode.left);
                }

                if (presntNode.right != null) {
                    queue.add(presntNode.right);
                }
            }

        }
        System.out.println("value not found");
    }

    public void deleteTree()
    {
        root=null;
        System.out.println("tree is deleted successfully");
    }


    public static void main(String[] args) {

        BinaryTreeLL binaryTree = new BinaryTreeLL();

        BinaryNode n1 = new BinaryNode();

        n1.value = "n1";

        BinaryNode n2 = new BinaryNode();

        n2.value = "n2";

        BinaryNode n3 = new BinaryNode();

        n3.value = "n3";

        BinaryNode n4 = new BinaryNode();

        n4.value = "n4";

        BinaryNode n5 = new BinaryNode();

        n5.value = "n5";


        BinaryNode n6 = new BinaryNode();

        n6.value = "n6";

        BinaryNode n7 = new BinaryNode();

        n7.value = "n7";

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;

        binaryTree.root = n1;

        //preOrder(binaryTree.root);

        //inOrder(binaryTree.root);

        //postOrder(binaryTree.root);

        //levelOrder();

        //search("n9");

       // insert("n8");

        levelOrder();

        deleteGivenNode("n4");
        System.out.println();
        levelOrder();


    }


}
