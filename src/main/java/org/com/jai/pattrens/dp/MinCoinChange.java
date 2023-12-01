package org.com.jai.pattrens.dp;

public class MinCoinChange {


    private static int minCoinsHelper(int[] coins, int sum, int index) {
        // Base Cases:
        if (sum == 0) {
            return 0; // No sum left to achieve, no coins needed
        }

        if (sum < 0 || index >= coins.length) {
            return Integer.MAX_VALUE; // Sum not achievable or no coins left
        }

        // Recursive Cases:
        // Find the minimum coins required by considering or excluding the current coin
        int include = minCoinsHelper(coins, sum - coins[index], index);
        int exclude = minCoinsHelper(coins, sum, index + 1);

        // Calculate the minimum among including and excluding the current coin
        int minCoins = Math.min(include != Integer.MAX_VALUE ? include + 1 : Integer.MAX_VALUE, exclude);
        return minCoins;
    }

    public static int minCoinsToMakeSum(int[] coins, int sum) {

        if (coins.length == 0 || sum <= 0) {

            return 0;
        }

        int numberOfCoins = coins.length;

        int[][] arr = new int[numberOfCoins][sum + 1];

        for (int i = 0; i < numberOfCoins; i++) {

            arr[i][0] = 0;
        }

        for (int i = 0; i < numberOfCoins; i++) {

            for (int j = 1; j <= sum; j++) {

                int includingCurrentCoin = Integer.MAX_VALUE;

                int excludingCurrentCoin = Integer.MAX_VALUE;

                if (coins[i] <= j) {

                    includingCurrentCoin = 1 + arr[i][j - coins[i]];
                }

                if (i > 0) {

                    excludingCurrentCoin = arr[i - 1][j];
                }

                arr[i][j] = Math.min(includingCurrentCoin, excludingCurrentCoin);

            }
        }

        return arr[numberOfCoins - 1][sum];

    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 3};

        int sum = 5;

        System.out.println(MinCoinChange.minCoinsToMakeSum(coins, sum));

        System.out.println(MinCoinChange.minCoinsHelper(coins, sum, 0));

    }

}
