package org.com.jai.pattrens.slidingwindow;

/*
    Problem: https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold/
    Given an array of integers arr and two integers k and threshold,
    return the number of sub-arrays of size k and average greater than or equal to threshold.
 */

public class NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold {

    public static int optimalSolution(int[] arr, int k, int threshold) {
        int windowStart = 0;
        int count = 0;
        int sum = 0;

        // Iterate through the array using the sliding window technique
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            sum += arr[windowEnd];

            // Check if the current window size is equal to k
            if (windowEnd >= k - 1) {
                double average = (double) sum / k;

                // If the average of the current window is greater than or equal to the threshold, increment the count
                if (average >= threshold) {
                    count++;
                }

                // Slide the window by removing the element from the left side and adjusting the sum
                sum -= arr[windowStart];
                windowStart++;
            }
        }

        System.out.println("Number of subarrays of size " + k + " and average greater than or equal to " + threshold + ": " + count);
        return count;
    }

    /*
            Time Complexity: o(n)

            Space Complexity: o(1)
     */

    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;
        optimalSolution(arr, k, threshold);
    }
}
