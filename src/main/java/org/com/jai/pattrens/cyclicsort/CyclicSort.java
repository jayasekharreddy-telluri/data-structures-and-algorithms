package org.com.jai.pattrens.cyclicsort;

import java.util.Arrays;

public class CyclicSort {

    public static int[] sort(int[] nums) {

        if (nums.length == 1 || nums == null){

            return nums;
        }

        int i = 0;

        while (i < nums.length) {
            // Check if the current element is not in its correct position
            if (nums[i] != i + 1) {
                int j = nums[i] - 1; // Calculate the correct index where the current element should be

                swap(nums, i, j); // Swap the current element with the element at the correct index
            } else {
                i++; // Move to the next element if it's already in the correct position
            }
        }

        System.out.println(Arrays.toString(nums));

        return nums;

        /*
                time complexity --O(n)

                space complexity -- O(1)
         */
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, 5, 4, 2};

        sort(nums); // Call the sorting function

    }
}
