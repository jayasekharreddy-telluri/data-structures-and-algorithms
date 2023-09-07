package org.com.jai.pattrens.cyclicsort;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindTheFirstKMissingPositiveNumbers {

    // Function to find the first K missing positive numbers in an array.
    public static List<Integer> findTheFirstKMissingPositiveNumbers(int[] nums, int z) {
        // Edge case: If the input array is null, return an empty list.
        if (nums == null) {
            return new ArrayList<>();
        }

        int i = 0;

        // Apply cyclic sort to arrange positive integers in their correct positions.
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                swapp(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        // Create lists to store missing and extra numbers.
        List<Integer> missingNumbers = new ArrayList<>();
        Set<Integer> extraNumbers = new HashSet<>();

        // Find the first K missing positive numbers.
        for (int k = 0; k < nums.length && missingNumbers.size() < z; k++) {
            if (nums[k] != k + 1) {
                missingNumbers.add(k + 1);
                extraNumbers.add(nums[k]);
            }
        }

        // If we still need more missing numbers, continue searching.
        for (int q = 1; missingNumbers.size() < z; q++) {
            int candidateNumber = nums.length + q;
            if (!extraNumbers.contains(candidateNumber)) {
                missingNumbers.add(candidateNumber);
            }
        }

        return missingNumbers;


        /*
                time complexity is O(N + K).
                 space complexity is O(N + K).
         */
    }

    // Helper function to swap two elements in the array.
    private static void swapp(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4};
        int z = 3;

        // Call the function and print the result.
        System.out.println(findTheFirstKMissingPositiveNumbers(nums, z));
    }
}
