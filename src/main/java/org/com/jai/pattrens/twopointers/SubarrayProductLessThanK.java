package org.com.jai.pattrens.twopointers;

/*
    Problem: Subarray Product Less Than K
    Link: https://leetcode.com/problems/subarray-product-less-than-k/
*/

public class SubarrayProductLessThanK {

    public static int optimalApproach(int[] nums, int k) {
        // Initialize variables
        int product = 1; // Stores the product of elements in the current window
        int count = 0; // Counts the number of subarrays with product less than k
        int startWindow = 0; // Start index of the window

        // Traverse the array with a sliding window approach
        for (int endWindow = 0; endWindow < nums.length; endWindow++) {
            product *= nums[endWindow]; // Multiply current element to the product

            // Shrink the window if the product exceeds or equal to k
            while (product >= k) {
                product = product / nums[startWindow++];
            }

            // Add the count of subarrays ending at the current window
            count += endWindow - startWindow + 1;
        }

        System.out.println(count); // Print the count of subarrays
        return count;

        /*
                Time Complexity: O(n)
                Space Complexity:  O(1)
         */
    }

    public static void main(String[] args) {
        int[] nums = {10, 5, 2, 6};
        int k = 100;

        optimalApproach(nums, k);
    }
}

