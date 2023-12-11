package org.com.jai.pattrens.recursion;

public class FibnocciUsingRecurssion {

    public static void main(String[] args) {

       int result = printFibonnaci(3);

       System.out.println(result);

    }

    private static int printFibonnaci(int n) {

        if (n < 2){
            return n;
        }

        return printFibonnaci(n-1)+ printFibonnaci(n-2);

    }

}
