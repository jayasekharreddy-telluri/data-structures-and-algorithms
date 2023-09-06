package org.com.jai.pattrens.cyclicsort;

import java.util.Arrays;


public class FindTheCorruptPair {

    public static int[] findNumbers(int[] nums) {
        // Check for null input
        if (nums == null) {
            return new int[]{-1, -1};
        }

        int i = 0;

        while (i < nums.length) {
            // If the current number is not in its correct position,
            // swap it with the number at its correct position.
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        for (int k = 0; k < nums.length; k++) {
            // The first number that is not in its correct position is the corrupt number.
            if (nums[k] != k + 1) {
                // Return the corrupt number and the number it should have been.
                return new int[]{nums[k], k + 1};
            }
        }

        // If no corrupt pair is found, return {-1, -1}.
        return new int[]{-1, -1};

        /*
                time complexity is O(n).
                space complexity is O(1).
         */
    }

    private static void swap(int[] nums, int i, int j) {
        // Helper method to swap two elements in the array.
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3, 6, 4};
        System.out.println(Arrays.toString(findNumbers(nums)));
    }
}

