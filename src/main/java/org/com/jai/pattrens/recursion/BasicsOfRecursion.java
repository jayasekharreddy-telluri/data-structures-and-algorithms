package org.com.jai.pattrens.recursion;

/*
        Recursion is a programming technique where a function solves a problem by calling itself repeatedly, simplifying the problem with each recursive call until a base case is reached.
        It can be compared to a loop that repeats until a specific condition is met.
 */
public class BasicsOfRecursion {

    public static void firstMethod() {
        secondMethod();
        System.out.println("I am the first method");
    }

    private static void secondMethod() {
        thirdMethod();
        System.out.println("I am the second method");
    }

    private static void thirdMethod() {
        fourthMethod();
        System.out.println("I am the third method");
    }

    private static void fourthMethod() {
        System.out.println("I am the fourth method");
    }

    public static void main(String[] args) {

        firstMethod();

    }
}
