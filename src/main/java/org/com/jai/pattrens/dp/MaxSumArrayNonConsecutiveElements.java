package org.com.jai.pattrens.dp;

public class MaxSumArrayNonConsecutiveElements {

    public static int maxSum(int[] array){

        if (array.length == 0){

            return 0;
        }

        if (array.length == 1){

            return array[0];
        }

        int[] dp = new int[array.length];

        dp[0] = array[0];

        dp[1] = array[0] > array[1] ? array[0]:array[1];

        for (int i = 2;  i < array.length; i++){

            dp[i] = Math.max(Math.max(dp[i -1],array[i]+dp[i -2]),array[i]);
        }

        return dp[array.length -1];
    }

    public static void main(String[] args) {

        int[] arr = {-1, -1, -2, 10};

        System.out.println(MaxSumArrayNonConsecutiveElements.maxSum(arr));
    }
}
