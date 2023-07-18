package org.com.jai.pattrens.slidingwindow;


public class MaximumSumSubarrayOfSizeK {

    public static int optimalSolution(int[] nums, int k) {

        int sum = 0; // Stores the sum of the current window
        int maxSum = 0; // Stores the maximum sum found so far
        int windowStart = 0; // Start index of the window

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {

            sum += nums[windowEnd]; // Add the current element to the sum

            if (windowEnd >= k - 1) {
                // If the window size is equal to k, update the maxSum, slide the window, and update the sum
                maxSum = Math.max(maxSum, sum);
                sum -= nums[windowStart];
                windowStart++;
            }
        }

        System.out.println(maxSum); // Print the maximum sum
        return maxSum;

        /*
            Time Complexity: O(n)
            - The algorithm iterates through the given array with a sliding window approach, which takes O(n) time.

            Space Complexity: O(1)
            - The algorithm uses a constant amount of space to store variables like sum, maxSum, and windowStart.
        */
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 1, 3, 2};
        int[] nums2 = {2, 3, 4, 1, 5};
        int k = 2;
        optimalSolution(nums2, k);
    }
}
