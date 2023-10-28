package org.com.jai.pattrens.binarysearch;

public class OrderAgnosticBinarySearch {

    public static int search(int[] nums, int key) {
        int start = 0; // Initialize the start index
        int end = nums.length - 1; // Initialize the end index
        boolean isAscending = nums[start] < nums[end]; // Check if the array is in ascending order

        while (start <= end) { // While the search range is valid
            int mid = start + (end - start) / 2; // Calculate the middle index

            if (key == nums[mid]) {
                return mid; // If the key is found, return its index
            }

            if (isAscending) {
                if (key < nums[mid]) {
                    end = mid - 1; // If it's ascending and key is smaller, search the left half
                } else {
                    start = mid + 1; // If it's ascending and key is larger, search the right half
                }
            } else {
                if (key > nums[mid]) {
                    end = mid - 1; // If it's descending and key is larger, search the left half
                } else {
                    start = mid + 1; // If it's descending and key is smaller, search the right half
                }
            }
        }

        return -1; // If the key is not found, return -1

        /*

                Time Complexity: O(log N)
                Space Complexity: O(1)

         */
    }

    public static void main(String[] args) {
        int[] nums = {10, 6, 4};
        int key = 10;
        System.out.println(search(nums, key)); // Call the search function and print the result
    }
}
