package org.jai.pattrens.twopointers;

import java.util.Arrays;

/*
    This class provides two solutions to the "Squares of a Sorted Array" problem from LeetCode.
    Given an array of integers sorted in non-decreasing order, the goal is to return an array of
    the squares of each number, also sorted in non-decreasing order.

    Problem link: https://leetcode.com/problems/squares-of-a-sorted-array/
 */
public class SquaresOfASortedArray {

    /**
     * Brute-force solution.
     * Time Complexity: O(n log n) - Sorting the array takes O(n log n) time.
     * Space Complexity: O(1) - No additional space used apart from the output array.
     */
    public static int[] bruteForceSolution(int[] nums) {
        for (int i = 0; i < nums.length; i++) { // Iterate through the array
            nums[i] = nums[i] * nums[i]; // Square each number
        }
        Arrays.sort(nums); // Sort the array
        return nums; // Return the sorted array
    }

    /**
     * Optimal solution using two pointers.
     * Time Complexity: O(n) - Single pass through the array.
     * Space Complexity: O(n) - Additional space used to store the result array.
     */
    public static int[] optimalSolution(int[] nums) {
        int leftPointer = 0; // Pointer for the leftmost element
        int rightPointer = nums.length - 1; // Pointer for the rightmost element
        int helperPointer = nums.length - 1; // Pointer for filling the result array
        int[] result = new int[nums.length]; // Array to store the squared numbers

        for (int i = 0; i < nums.length; i++) { // Iterate through the array
            int v1 = nums[leftPointer] * nums[leftPointer]; // Square of the leftmost element
            int v2 = nums[rightPointer] * nums[rightPointer]; // Square of the rightmost element

            if (v1 < v2) { // Compare the squares
                result[helperPointer--] = v2; // Store the larger square at the end of the result array
                rightPointer--; // Move the right pointer towards the center
            } else {
                result[helperPointer--] = v1; // Store the larger square at the end of the result array
                leftPointer++; // Move the left pointer towards the center
            }
        }

        return result; // Return the sorted array of squared numbers
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] res = bruteForceSolution(nums);
        System.out.println(Arrays.toString(res)); // Print the array of squared numbers using brute force
        int[] num2 = {-4, -1, 0, 3, 10};
        int[] res2 = optimalSolution(num2);
        System.out.println(Arrays.toString(res2)); // Print the array of squared numbers using the optimal solution
    }
}
