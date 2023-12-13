package org.com.jai.pattrens.recursion;

public class SumOfThedigits {

    public static void main(String[] args) {

        //System.out.println(sumOfDigits(12388));

        //System.out.println(productOfDigits(12388));

        System.out.println(reverseOfDigits(123880));


    }

    private static int reverseOfDigits(int i) {
        if (i <= 1) {

            return 1 ;
        }

        System.out.print(i % 10);

        return reverseOfDigits(i/10);
    }

    private static int productOfDigits(int n) {

        if (n % 10 == n) {

            return n;
        }

        return n % 10 * productOfDigits(n / 10);
    }

    private static int sumOfDigits(int i) {

        if (i == 0) {
            return 0;
        }

        return i % 10 + sumOfDigits(i / 10);
    }
}
