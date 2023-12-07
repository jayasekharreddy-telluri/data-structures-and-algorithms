package org.com.jai.pattrens.dp;

public class MaxSumIncreasingSubsequence {


    public static int maxSumIncreasingSubsequenceRecursive(int[] arr,int currentIndex,int previous){

        if (arr.length == currentIndex){

            return 0;
        }

        int sumWithCurrent = 0;

        if (arr[currentIndex] > previous){

            sumWithCurrent = arr[currentIndex] + maxSumIncreasingSubsequenceRecursive(arr,currentIndex+1,arr[currentIndex]);
        }

        int sumWithoutCurrent = maxSumIncreasingSubsequenceRecursive(arr,currentIndex+1,previous);

        return  Math.max(sumWithCurrent, sumWithoutCurrent);
    }

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


        System.out.println(maxSumIncreasingSubsequenceRecursive(a,0,Integer.MIN_VALUE));
    }


}
