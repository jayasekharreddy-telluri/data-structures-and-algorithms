package org.com.jai.pattrens.dp.dp;

public class MinStair {

    public static int minSteps(int n){

        if (n == 0){

            return 0;
        }

        if (n == 1 || n==2|| n==3){

            return 1;
        }

        return 1 + Math.min(Math.min(minSteps(n-1),minSteps(n-2)),minSteps(n-3));
    }


    public static int minStepsTopToBottom(int[] arr,int n) {

        if (n == 0) {

            return 0;
        }

        if (n == 1 || n == 2 || n == 3) {

            return 1;
        }
        if (arr[n] == 0) {

            arr[n] = 1 + Math.min(Math.min(minSteps(n - 1), minSteps(n - 2)), minSteps(n - 3));
        }

        return arr[n];
    }


    public static int minStepsBottomUp(int[] arr,int n) {

        arr[0] = 0;

        arr[1] = 1;

        arr[2] = 1;

        for (int i = 3; i <=n; i++){

            arr[i] = 1 + Math.min(Math.min(arr[n-1],arr[n-2]),arr[n-3]);
        }
        return arr[n];
    }


    public static int minStepsBottomUpOptimal(int n) {

        int a = 0;

        int b = 1;

        int c = 1;

        int d;

        for (int i = 3; i <=n; i++){

            d = 1 + Math.min(Math.min( a , b), c);

            a = b;

            b= c;

            c= d;
        }
        return c;
    }

    public static void main(String[] args) {

        System.out.println("recursion : "+minSteps(5) );

        int[] n = new int[6];


        System.out.println("top-bottom : "+minStepsTopToBottom(n,5) );

        System.out.println("bottom - up : "+minStepsBottomUp(n,5) );

        System.out.println("bottom - up-optimal : "+minStepsBottomUpOptimal(5) );

    }

}
