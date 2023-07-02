package org.jai.pattrens.twopointers;

/*
        https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */

public class RemoveDuplicates {

    /**
     * Removes duplicates from the sorted array in-place.
     * Time Complexity: O(n) - Single pass through the array.
     * Space Complexity: O(1) - In-place removal of duplicates.
     */
    public static int optimalSolution(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int i = 1; // Pointer for iterating through the array
        int nextNonDuplicate = 1; // Pointer for tracking the next position of the non-duplicate element

        while (i < nums.length) { // Iterate through the array

            if (nums[nextNonDuplicate - 1] != nums[i]) // Check if the current number is a non-duplicate
            {
                nums[nextNonDuplicate++] = nums[i]; // Update the non-duplicate position and store the number
            }

            i++;
        }

        return nextNonDuplicate; // Return the length of the array after removing duplicates
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int result = optimalSolution(nums);
        System.out.println(result); // Print the length of the array after removing duplicates
    }
}
