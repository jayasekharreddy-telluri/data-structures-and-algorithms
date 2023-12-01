package org.com.jai.pattrens.dp.dp;

public class Stair {

    public static int totalWaysToReachNthStair(int n) {

        if (n == 0) {

            return 1;
        }

        if (n == 1) {

            return 1;
        }
        if (n == 2) {

            return 2;
        }

        return totalWaysToReachNthStair(n - 1) + totalWaysToReachNthStair(n - 2) + totalWaysToReachNthStair(n - 3);

    }

    public static int totalWaysToReachNthStairTopDownApproach(int[] arr, int n) {


        if (n == 0) {

            return 1;
        }

        if (n == 1) {

            return 1;
        }
        if (n == 2) {

            return 2;
        }

        if (arr[n] == 0) {

            arr[n] = totalWaysToReachNthStairTopDownApproach(arr, n - 1) +
                    totalWaysToReachNthStairTopDownApproach(arr, n - 2) +
                    totalWaysToReachNthStairTopDownApproach(arr, n - 3);

        }
        return arr[n];

    }


    public static int totalWaysToReachNthStairBottomUpApproach(int[] arr, int n) {

        arr[0] = 1;


        arr[1] = 1;

        arr[2] = 2;

        for (int i = 3; i <= n; i++) {

            arr[n] = arr[n - 1] + arr[n - 2] + arr[n - 3];

        }
        return arr[n];

    }


    public static int totalWaysToReachNthStairBottomUpApproachOptimal(int[] arr, int n) {

        int a = 1;


        int b = 1;

        int c = 2;

        int d;

        for (int i = 3; i <= n; i++) {

            d = a + b + c;
            a = b;
            b = c;
            c = d;
        }
        return c;

    }

    public static void main(String[] args) {

        System.out.println(totalWaysToReachNthStair(3));

        int[] n = new int[4];

        System.out.println("top down : " + totalWaysToReachNthStairTopDownApproach(n, 3));

        System.out.println("bottom up : " + totalWaysToReachNthStairBottomUpApproach(n, 3));

        System.out.println("bottom up optimal : " + totalWaysToReachNthStairBottomUpApproachOptimal(n, 3));


    }
}
