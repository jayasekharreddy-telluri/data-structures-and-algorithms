package org.com.jai.pattrens.dp;

public class BoundedKnapsack {


    public static int getMaxProfit(int[] weight, int[] profit, int capacity, int currentIndex) {
        // Base Case
        if (currentIndex < 0 || capacity <= 0) {
            return 0;
        }

        // If the current item's weight exceeds the capacity, skip it
        if (weight[currentIndex] > capacity) {
            return getMaxProfit(weight, profit, capacity, currentIndex - 1);
        }

        // Recursive steps:
        // Choose between including or excluding the current item
        int includeProfit = profit[currentIndex] +
                getMaxProfit(weight, profit, capacity - weight[currentIndex], currentIndex - 1);
        int excludeProfit = getMaxProfit(weight, profit, capacity, currentIndex - 1);

        // Return the maximum profit obtained
        return Math.max(includeProfit, excludeProfit);
    }

    public static void main(String[] args) {
        int[] wt = {1, 2, 3, 5};
        int[] pr = {1, 4, 7, 10};
        int capacity = 8;
        int currentIndex = wt.length - 1; // Start from the last item

        System.out.println(getMaxProfit(wt, pr, capacity, currentIndex));
    }
}
