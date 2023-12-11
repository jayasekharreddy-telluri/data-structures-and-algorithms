package org.com.jai.pattrens.recursion;

public class NumberFunctionRecurssive {

    //print numbers of given integer from 1 to n


    public static void main(String[] args) {

        printNumbers(1);

    }

    private static void printNumbers(int i) {

        if (i > 5){
            return;
        }
        System.out.println(i);

        printNumbers(i + 1);
    }


}
