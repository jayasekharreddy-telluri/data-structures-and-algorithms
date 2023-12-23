package org.com.jai.pattrens.recursion;

public class Pattren {

    public static void main(String[] args) {

        printInverseTriangle(4, 0);

        printTriangle(4, 0);

    }

    private static void printTriangle(int row, int col) {


        if (row == 0) {

            return;
        }

        if (col < row) {
            printTriangle(row, col + 1);
            System.out.print(" * ");
        } else {

            printTriangle(row - 1, 0);

            System.out.println();
        }

    }


    private static void printInverseTriangle(int row, int col) {

        if (row == 0) {

            return;
        }

        if (col < row) {
            System.out.print(" * ");
            printInverseTriangle(row, col + 1);
        } else {

            System.out.println();
            printInverseTriangle(row - 1, 0);
        }

    }
}
