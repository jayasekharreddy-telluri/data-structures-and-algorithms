package org.com.jai.pattrens.binarytree;

public class BinaryTree {

    static String[] array;

    static int lastUsedIndex;


    /*
            creation of binary tree using array
            time complexity - O(1)
            space complexity - O(n)
     */

    public BinaryTree(int size){

        this.array = new String[size + 1];

        this.lastUsedIndex = 0;

        System.out.println("array is created with size of "+ size);

    }

    boolean isFull(){

        if (array.length -1 == lastUsedIndex){
            return true;
        }else{
            return false;
        }

    }


    /*
            insert binary tree
            time complexity - O(1)
            space complexity - O(1)
     */

    void insert(String value){

        if (!isFull()){
            array[lastUsedIndex + 1] = value;
            lastUsedIndex++;
            System.out.println("value is inserted");

        }else{
            System.out.println("Bt is full");

        }
    }


    /*
            pre-order traversal binary tree
            time complexity - O(n)
            space complexity - O(n)
     */

    static void preOrder(int index){

        if (index > lastUsedIndex){
            return;
        }
        System.out.print(array[index] + " ");
        preOrder(index * 2);
        preOrder(index *2 + 1);
    }

    /*
            in-order traversal binary tree
            time complexity - O(n)
            space complexity - O(n)
     */
    static void inOrder(int index){

        if (index > lastUsedIndex){

            return;
        }
        inOrder(2 * index);

        System.out.print(array[index] + " ");

        inOrder(2 * index + 1);

    }


    /*
            post-order traversal binary tree
            time complexity - O(n)
            space complexity - O(n)
     */
    static void postOrder(int index){

        if (index > lastUsedIndex){

            return;
        }
        postOrder(2 * index);
        postOrder(2 * index + 1);
        System.out.print(array[index] + " ");

    }


    /*
            level-order traversal binary tree
            time complexity - O(n)
            space complexity - O(1)
     */
    static void levelOrder(){

        for (int i = 1; i <= lastUsedIndex; i++){

            System.out.print(array[i] + " ");

        }

    }


    /*
            search binary tree
            time complexity - O(n)
            space complexity - O(1)
     */
    static int search(String value){

        for (int i = 1; i <= lastUsedIndex; i++){

            if (array[i] == value){

                System.out.print(array[i] + " value found");
                return i;
            }
        }
        System.out.print("not found");

        return -1;

    }


    /*
            delete given node : binary tree
            time complexity - O(n)
            space complexity - O(1)
     */

    static  void deleteGivenNode(String value){

        int location = search(value);

        if (location == -1){
            return;
        }else{

            array[location] = array[lastUsedIndex];
            lastUsedIndex--;
            System.out.println("deleted given node value "+ value);
        }

    }


    /*
            delete binary tree
            time complexity - O(1)
            space complexity - O(1)
     */
    static void deleteBinaryTree(){
        try {

            array = null;
            System.out.println("deleted binary tree");
        }catch (Exception e){
            System.out.println("deleted binary tree");
        }

    }





    public static void main(String[] args) {

        BinaryTree binaryTree = new BinaryTree(5);

        binaryTree.insert("n1");

        binaryTree.insert("n2");

        binaryTree.insert("n3");

        binaryTree.insert("n4");

        binaryTree.insert("n5");

        //binaryTree.insert("n6");

        //preOrder(1);

        //inOrder(1);

       // postOrder(1);

       // levelOrder();

       // search("n6");

        //deleteGivenNode("n5");

       // search("n5");
        deleteBinaryTree();

    }



}
