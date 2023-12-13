package org.com.jai.pattrens.recursion;

public class Steps {

    public static void main(String[] args) {

        System.out.println(countNumberOfSteps(41));

        System.out.println(countNumberOfZeros(100000));


    }

    private static int countNumberOfZeros(int i) {

        return helperTwo(i,0);
    }

    private static int helperTwo(int num, int count) {

        if (num == 0){

            return count;
        }

        int rem = num%10;

        if (rem == 0){

           return helperTwo(num/10,count+1);
        }

        return helperTwo(num/10,count);

    }

    private static int countNumberOfSteps(int num) {

        return helper(num,0);
    }

    private static int helper(int num, int steps) {

        if (num == 0){

            return steps;
        }

        if (num % 2 == 0){

            return helper(num/2,steps+1);
        }

        return helper(num-1,steps+1);

    }
}
