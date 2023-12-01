package org.com.jai.pattrens.dp;

import java.util.Arrays;

public class CoinChange {

    public static int totalWaysOfCoinChange(int[] coins, int sum) {
        if (sum == 0) {
            return 1; // Base case: There is exactly one way to make sum = 0 (by selecting no coins)
        }

        if (sum < 0 || coins.length == 0) {
            return 0; // Base case: No way to make sum < 0 or if no coins are available
        }

        // Recursive cases:
        // Consider the last coin denomination and count ways including/excluding it
        int lastCoin = coins[coins.length - 1];
        // Count ways by including the last coin and reduce the sum by the coin value
        int includeLastCoin = totalWaysOfCoinChange(coins, sum - lastCoin);
        // Count ways by excluding the last coin
        int excludeLastCoin = totalWaysOfCoinChange(Arrays.copyOf(coins, coins.length - 1), sum);

        return includeLastCoin + excludeLastCoin;
    }

    public static int totalWaysOfCoinChangee(int[] coins, int sum) {

        if (coins.length == 0 || sum <= 0) {

            return 0;
        }

        int numberOfCoins = coins.length;

        int[][] arr = new int[numberOfCoins][sum + 1];

        for (int i = 0; i < numberOfCoins; i++) {

            arr[i][0] = 1;
        }

        for (int i = 0; i < numberOfCoins; i++) {

            for (int j = 1; j <= sum; j++) {

                int includingCurrentCoin = 0;

                int excludingCurrentCoin = 0;

                if (coins[i] <= j) {

                    includingCurrentCoin = arr[i][j - coins[i]];
                }

                if (i > 0) {

                    excludingCurrentCoin = arr[i - 1][j];
                }

                arr[i][j] = includingCurrentCoin + excludingCurrentCoin;
            }
        }

        return arr[numberOfCoins - 1][sum];

    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 3};

        int sum = 5;

        System.out.println(CoinChange.totalWaysOfCoinChange(coins, sum));

        System.out.println(CoinChange.totalWaysOfCoinChangee(coins, sum));
    }
}
