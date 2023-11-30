package org.com.jai.pattrens.dp;

public class UnBoundedKnapsack {

    public static int getMaxProfit(int[] weight,int[] profit,int totalCapacity){

        if (weight.length == 0 || profit.length == 0 || totalCapacity <= 0){

            return 0;
        }

        int numberOfWeights =weight.length;

        int[][] arr = new int[numberOfWeights][totalCapacity + 1];

        for (int i = 0; i < numberOfWeights; i++){

            for (int j = 1; j <= totalCapacity; j++){

                int includingCurrentWeightProfit = 0;

                int excludingCurrentWeightProfit = 0;

                if (weight[i] <= j){

                    includingCurrentWeightProfit = profit[i] + arr[i][j - weight[i]];
                }
                if (i > 0){
                    excludingCurrentWeightProfit = arr[i - 1][j];
                }

                arr[i][j] = Math.max(includingCurrentWeightProfit,excludingCurrentWeightProfit);

            }
        }

        return arr[numberOfWeights - 1][totalCapacity];

    }

    public static void main(String[] args) {

        int[] wt = {1, 2, 3, 5};
        int[] pr = {1, 4, 7, 10};

        int totalCapacity = 8;

        System.out.println(UnBoundedKnapsack.getMaxProfit(wt, pr, totalCapacity));
    }

}
