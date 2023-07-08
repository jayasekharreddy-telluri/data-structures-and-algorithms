package org.com.jai.pattrens.twopointers;
import java.util.Arrays;

/*
    Problem: Given an array of integers and a target number, find three integers in the array whose sum is closest to the target.

    LeetCode Problem Link: https://leetcode.com/problems/3sum-closest/
    Solution Discussion Link: https://leetcode.com/problems/3sum-closest/discuss/419093/Multiple-Approaches-with-Explanation
*/
public class TripletSumCloseToTarget {

    public static int optimalSolution(int[] nums, int target) {

        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums); // Sorting the array in ascending order

        int min = nums[0] + nums[1] + nums[2]; // Initializing min as the sum of the first three elements

        for (int i = 0; i < nums.length; i++) {
            int left = i + 1; // Pointer at the leftmost element after nums[i]
            int right = nums.length - 1; // Pointer at the rightmost element

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right]; // Calculate the sum of three elements

                if (Math.abs(target - min) > Math.abs(target - sum)) {
                    // Update min if the sum is closer to the target than the current min
                    min = sum;
                }

                if (sum > target) {
                    right--; // If sum is greater than the target, move the right pointer towards the left
                } else if (sum < target) {
                    left++; // If sum is less than the target, move the left pointer towards the right
                } else {
                    return target; // If sum is equal to the target, return the target
                }
            }
        }

        return min; // Return the closest sum to the target
        /*
            Time Complexity: O(N^2) - The nested while loop runs in O(N) time, and it is called N times.
            Space Complexity: O(N) - The space complexity is O(N) due to sorting the array.
        */
    }

    public static void main(String[] args) {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;

        System.out.println(optimalSolution(nums, target));
    }
}

