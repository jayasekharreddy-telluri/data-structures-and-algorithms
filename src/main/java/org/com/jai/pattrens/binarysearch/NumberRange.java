package org.com.jai.pattrens.binarysearch;

import java.util.Arrays;

public class NumberRange {

    // Function to find the range of a given key in a sorted array.
    public static int[] findRange(int[] nums, int key) {
        int[] result = new int[]{-1, -1}; // Initialize the result array with default values.

        // Find the leftmost occurrence of the key in the array.
        result[0] = search(nums, key, false);

        if (result[0] != -1) {
            // If the key was found, find the rightmost occurrence of the key in the array.
            result[1] = search(nums, key, true);
        }

        return result; // Return the range of the key (leftmost and rightmost indices).
    }

    // Helper function to perform binary search for finding the leftmost or rightmost occurrence of a key.
    private static int search(int[] nums, int key, boolean findMaxRange) {
        int keyIndex = -1; // Initialize the index of the key.

        int start = 0; // Initialize the start index of the search range.
        int end = nums.length - 1; // Initialize the end index of the search range.

        while (start <= end) { // While the search range is valid.
            int mid = start + (end - start) / 2; // Calculate the middle index.

            if (key < nums[mid]) {
                end = mid - 1; // If the key is smaller, search the left half of the array.
            } else if (key > nums[mid]) {
                start = mid + 1; // If the key is larger, search the right half of the array.
            } else {
                keyIndex = mid; // If the key is found, update the key index.

                if (findMaxRange) {
                    start = mid + 1; // If finding the rightmost occurrence, move to the right of the mid.
                } else {
                    end = mid - 1; // If finding the leftmost occurrence, move to the left of the mid.
                }
            }
        }

        return keyIndex; // Return the index of the key (leftmost or rightmost occurrence).

        /*

                Time Complexity: O(log N)
                Space Complexity: O(1)

         */
    }

    public static void main(String[] args) {
        int[] nums = {4, 6, 6, 6, 9};
        int key = 6;
        System.out.println(Arrays.toString(findRange(nums, key))); // Print the range of the key.
    }
}
