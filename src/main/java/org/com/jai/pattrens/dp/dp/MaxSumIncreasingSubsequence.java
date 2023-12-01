package org.com.jai.pattrens.dp.dp;

public class MaxSumIncreasingSubsequence {

    public static int maxSumIncreasingSubsequence(int[] arr){

        int[] msis = new int[arr.length];

        for (int i = 0; i < msis.length; i++){
            msis[i] = arr[i];
        }
        int maxIncreasingSequenceSum = arr[0];

        for (int i = 1; i< msis.length;i++){

            for (int j = 0; j < i; j++){

                if (arr[i] > arr[j] && arr[i] + msis[j] > msis[i]){

                    msis[i] = arr[i] + msis[j];

                    maxIncreasingSequenceSum = Math.max(maxIncreasingSequenceSum,msis[i]);
                }

            }

        }

        return maxIncreasingSequenceSum;
    }

    public static void main(String[] args) {

        int a[] = { 7, 1, 4, 8, 11, 2, 14, 3 };

        System.out.println(MaxSumIncreasingSubsequence.maxSumIncreasingSubsequence(a));
    }


}
