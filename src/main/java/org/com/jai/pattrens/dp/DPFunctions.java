package org.com.jai.pattrens.dp;

public class DPFunctions {

    public static int getFibNumber(int n) {

        if (n < 2) {

            return n;
        }

        return getFibNumber(n - 1) + getFibNumber(n - 2);


    }


    public static int getFibNumberTopDownApproach(int n, int[] arr) {

        if (n < 2) {

            return n;
        }

        if (arr[n] == 0) {

            arr[n] = getFibNumberTopDownApproach(n - 1, arr) + getFibNumberTopDownApproach(n - 2, arr);
        }

        return arr[n];
    }


    public static int getFibNumberBottomUpApproach(int n, int[] arr) {

        arr[0] = 0;

        arr[1] = 1;

        for (int i = 2; i <= n; i++) {

            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }


    public static int getFibNumberBottomUpApproachOptimal(int n, int[] arr) {

        int a = 0;

        int b = 1;

        int c;

        for (int i = 2; i <= n; i++) {

            c = a + b;

            a = b;

            b = c;


        }

        return b;
    }

    public static void main(String[] args) {

        System.out.println("recursive " + getFibNumber(4));

        int[] n = new int[5];

        System.out.println("top-down " + getFibNumberTopDownApproach(4, n));

        System.out.println("bottom - up " + getFibNumberBottomUpApproach(4, n));

        System.out.println("bottom - up-optimal " + getFibNumberBottomUpApproachOptimal(4, n));

    }
}
