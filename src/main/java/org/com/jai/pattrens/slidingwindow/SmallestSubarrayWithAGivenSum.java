package org.com.jai.pattrens.slidingwindow;


/*
        https://leetcode.com/problems/minimum-size-subarray-sum/submissions/
 */

public class SmallestSubarrayWithAGivenSum {

    public static int optimalSolution(int[] nums, int sum) {

        if(nums == null || sum < 0 || nums.length == 0) {
            return 0;
        }
        int countMin = Integer.MAX_VALUE; // Stores the minimum count of subarray elements
        int windowStart = 0; // Start index of the window
        int windowSum = 0; // Stores the sum of the current window

        for (int windowEnd = 0; windowEnd < nums.length; windowEnd++) {
            windowSum += nums[windowEnd]; // Add the current element to the window sum

            // Shrink the window as long as the window sum is greater than or equal to the given sum
            while (windowSum >= sum) {
                countMin = Math.min(countMin, windowEnd - windowStart + 1); // Update the minimum count
                windowSum -= nums[windowStart]; // Remove the element at the windowStart
                windowStart++; // Move the windowStart to the right
            }
        }

        return countMin == Integer.MAX_VALUE ? 0 : countMin; // Return the smallest subarray size

        /*
            Time Complexity: O(n)
            - The algorithm iterates through the given array with a sliding window approach, which takes O(n) time.

            Space Complexity: O(1)
            - The algorithm uses a constant amount of space to store variables like countMin, windowStart, and windowSum.
        */
    }

    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 2, 8};
        int sum = 7;

        int result = optimalSolution(nums, sum);

        System.out.println(result);
    }
}
