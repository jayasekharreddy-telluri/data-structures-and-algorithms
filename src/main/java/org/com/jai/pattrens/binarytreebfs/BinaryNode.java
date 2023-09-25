package org.com.jai.pattrens.binarytreebfs;

public class BinaryNode {

    public int value;

    public BinaryNode left;

    public BinaryNode right;

    public BinaryNode next;

    public BinaryNode(int value) {

        this.value = value;

        left = right = next = null;
    }
}
