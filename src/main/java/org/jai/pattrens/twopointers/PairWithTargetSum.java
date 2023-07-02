package org.jai.pattrens.twopointers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
    This class provides two solutions to the "Two Sum" problem from LeetCode.
    Given an array of integers and a target integer, the goal is to find two numbers in the array
    that add up to the target and return their indices as an array.

    Problem link: https://leetcode.com/problems/two-sum/
 */
public class PairWithTargetSum {

    /**
     * Brute-force solution.
     * Time Complexity: O(n^2) - Two nested loops iterate through the entire array.
     * Space Complexity: O(1) - No additional space used apart from the output array.
     */
    public static int[] bruteForceSolution(int nums[], int target) {
        for (int i = 0; i < nums.length; i++) { // Iterate through the array
            for (int j = i + 1; j < nums.length; j++) { // Iterate through the remaining elements

                if (nums[i] + nums[j] == target) { // Check if the two numbers add up to the target
                    return new int[]{i, j}; // Return the indices of the two numbers
                }

            }
        }
        return new int[0]; // If no pair is found, return an empty array
    }

    /**
     * Optimal solution using a HashMap.
     * Time Complexity: O(n) - Iterating through the array once.
     * Space Complexity: O(n) - HashMap is used to store complements in the worst case.
     */
    public static int[] optimalSolution(int[] nums, int target) {

        Map<Integer, Integer> tracker = new HashMap<>(); // Create a HashMap to store complements

        for (int i = 0; i < nums.length; i++) { // Iterate through the array

            if (tracker.containsKey(nums[i])) { // Check if the complement exists in the HashMap

                int left = tracker.get(nums[i]); // Retrieve the index of the complement

                return new int[]{i, left}; // Return the indices of the current number and its complement
            } else {
                tracker.put(target - nums[i], i); // Store the complement of the current number
            }

        }

        return new int[0]; // If no pair is found, return an empty array

    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = bruteForceSolution(nums, target);
        System.out.println(Arrays.toString(result)); // Print the indices of the pair found using brute force
        int[] res = optimalSolution(nums, target);
        System.out.println(Arrays.toString(res)); // Print the indices of the pair found using the optimal solution

    }

}
