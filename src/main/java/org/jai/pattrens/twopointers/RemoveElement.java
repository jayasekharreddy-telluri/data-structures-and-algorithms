package org.jai.pattrens.twopointers;

/*
    This class provides an optimal solution to the "Remove Element" problem from LeetCode.
    Given an array of integers and a value, the goal is to remove all instances of that value
    in-place and return the new length of the array.

    Problem link: https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {

    /**
     * Removes all instances of the given value from the array in-place.
     * Time Complexity: O(n) - Single pass through the array.
     * Space Complexity: O(1) - In-place removal of elements.
     */
    public static int optimalSolution(int[] nums, int value) {

        int nextValue = 0; // Pointer for tracking the next position of non-value elements

        for (int i = 0; i < nums.length; i++) { // Iterate through the array

            if (nums[i] != value) { // Check if the current element is not the given value
                nums[nextValue++] = nums[i]; // Update the nextValue position and store the element
            }
        }

        return nextValue; // Return the new length of the array after removing elements with the given value
    }

    public static void main(String[] args) {
        int[] nums = {2, 11, 2, 2, 1};
        int value = 2;

        int result = optimalSolution(nums, value);

        System.out.println(result); // Print the new length of the array after removing elements with the given value
    }
}
