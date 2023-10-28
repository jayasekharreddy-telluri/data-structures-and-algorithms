package org.com.jai.pattrens.binarysearch;

public class CeilingOfANumber {

    public static int searchCeilingOfANumber(int[] nums, int key) {
        if (key > nums[nums.length - 1]) {
            return -1; // If key is greater than the largest number in the array, no ceiling exists.
        }

        int start = 0; // Initialize the start index.
        int end = nums.length - 1; // Initialize the end index.

        while (start <= end) { // While the search range is valid.
            int mid = start + (end - start) / 2; // Calculate the middle index.

            if (key < nums[mid]) {
                end = mid - 1; // If key is smaller, search the left half.
            } else if (key > nums[mid]) {
                start = mid + 1; // If key is larger, search the right half.
            } else {
                return mid; // If key is equal to the number at mid, it is the ceiling, so return it.
            }
        }

        return start; // If key is not found, the start index points to the ceiling.

        /*

                Time Complexity: O(log N)
                Space Complexity: O(1)

         */
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 6, 8, 19};
        int key = 9;
        System.out.println(searchCeilingOfANumber(nums, key));
    }
}
