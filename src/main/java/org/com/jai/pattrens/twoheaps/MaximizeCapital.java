package org.com.jai.pattrens.twoheaps;

import java.util.PriorityQueue;

public class MaximizeCapital {

    public static int findMaximumCapital(int[] capital, int[] profits, int numberOfProjects, int initialCapital) {
        int n = profits.length;

        // Min heap to store projects sorted by their capital requirements.
        PriorityQueue<Integer> minCapitalHeap = new PriorityQueue<>(n, (i1, i2) -> capital[i1] - capital[i2]);

        // Max heap to store projects sorted by their profits in descending order.
        PriorityQueue<Integer> maxProfitHeap = new PriorityQueue<>(n, (i1, i2) -> profits[i2] - profits[i1]);

        // Add all projects to the minCapitalHeap initially.
        for (int i = 0; i < capital.length; i++) {
            minCapitalHeap.add(i);
        }

        int availableCapital = initialCapital;

        for (int i = 0; i < numberOfProjects; i++) {
            // Move projects from minCapitalHeap to maxProfitHeap if their capital requirement is met.
            while (!minCapitalHeap.isEmpty() && capital[minCapitalHeap.peek()] <= availableCapital) {
                maxProfitHeap.add(minCapitalHeap.poll());
            }

            // If there are no projects in maxProfitHeap, break the loop.
            if (maxProfitHeap.isEmpty()) {
                break;
            }

            // Invest in the project with the maximum profit and update available capital.
            availableCapital += profits[maxProfitHeap.poll()];
        }

        return availableCapital;
    }

    public static void main(String[] args) {
        int[] capital = {0, 1, 2, 3};
        int[] profits = {1, 2, 3, 5};
        int initialCapital = 0;
        int numberOfProjects = 3;

        // Find the maximum capital after investing in the specified number of projects.
        System.out.println(findMaximumCapital(capital, profits, numberOfProjects, initialCapital));
    }
}
