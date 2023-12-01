package org.com.jai.pattrens.dp.dp;

public class BoundedKnapsack {

    public static int getMaxProfit(int[] weight,int[] profit,int capacity){

        if (weight.length == 0 || profit.length == 0 || capacity <= 0){

            return 0;
        }

        int[][] arr = new int[weight.length][capacity + 1];

        for (int j = 0; j <= capacity; j++){

            if (weight[0] <= j){

                arr[0][j] = profit[0];

            }
        }

        for (int i = 1; i < weight.length; i++){

            for (int j = 1; j <= capacity; j++){

                int includingProfit = 0;

                if (weight[i] <= j){
                    includingProfit = profit[i] + arr[i -1][j - weight[i]];
                }

                arr[i][j] = Math.max(includingProfit, arr[i -1 ][j]);
            }
        }

        return arr[weight.length - 1][capacity];

    }

    public static void main(String[] args) {

        int[] wt = {1, 2, 3, 5};
        int[] pr = {1, 4, 7, 10};

        int capacity = 8;

        System.out.println(BoundedKnapsack.getMaxProfit(wt, pr, capacity));

    }
}
