package org.com.jai.pattrens.slow_fastpointers;

/*
    https://leetcode.com/problems/happy-number/submissions/
*/
public class HappyNumber {

    public static boolean isHappy(int num){

        int slowPointer = num;

        int fastPointer = num;

        do{
            slowPointer = findSquareSum(slowPointer);
            fastPointer = findSquareSum(findSquareSum(fastPointer));
        }while(slowPointer != fastPointer);

        return slowPointer == 1;

        /*
                time complexity ---O(log n)

                space complexity ---O(1)
         */

    }

    private static int findSquareSum(int slowPointer) {

        int num = slowPointer;

        int sum = 0;

        int digit = 0;

        while(num > 0){

            digit = num % 10;

            sum = sum + digit * digit;

            num = num / 10;
        }

        return sum;

    }

    public static void main(String[] args) {

        int num = 23;

        boolean result = isHappy(num);

        System.out.println(result);

    }

}
