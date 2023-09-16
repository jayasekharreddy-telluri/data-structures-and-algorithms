package org.com.jai.pattrens.treeImplimention;

import java.util.ArrayList;

public class TreeNode {

    String data;

    ArrayList<TreeNode> children;
    TreeNode(String data){

        this.data = data;

        this.children = new ArrayList<>();

    }

    public void addChild(TreeNode node){

        this.children.add(node);
    }

    public void print()
    {
        String ret;

        //ret ="  ".repeat(level)+data+"\n";
        for(TreeNode node:this.children)
        {
            //ret=ret+node;
            System.out.println(node.data);
        }
        //return ret;
    }

    public static void main(String[] args) {

        TreeNode drinks = new TreeNode("Drinks");

        TreeNode hot = new TreeNode("Hot");

        TreeNode cool = new TreeNode("Cool");

        drinks.addChild(drinks);

        drinks.addChild(hot);

        drinks.addChild(cool);

        drinks.print();


    }

}
