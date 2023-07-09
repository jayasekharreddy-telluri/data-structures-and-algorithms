package org.com.jai.pattrens.twopointers;

import java.util.Arrays;

public class TripletsWithSmallerSum {

    public static int optimalSolution(int[] nums, int target) {
        Arrays.sort(nums); // Sorting the array in ascending order
        int count = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            count += search(nums, target - nums[i], i);
        }

        return count;
        /*
            Time Complexity: O(N^2) - The outer loop runs N-2 times, and the inner search method runs N-2 times at most.
            Space Complexity: O(1) - The space complexity is constant as no additional space is used proportional to the input.
        */
    }

    private static int search(int[] nums, int targetedSum, int first) {
        int left = first + 1;
        int right = nums.length - 1;
        int count = 0;

        while (left < right) {
            if (nums[left] + nums[right] < targetedSum) {
                count += right - left; // Increment count by the number of valid pairs found
                left++;
            } else {
                right--;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 4, 2, 1, 3};
        int target = 5;
        System.out.println(optimalSolution(nums, target));
    }
}

