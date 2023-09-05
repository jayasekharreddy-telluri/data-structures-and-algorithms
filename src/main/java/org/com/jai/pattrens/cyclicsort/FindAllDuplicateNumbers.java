package org.com.jai.pattrens.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicateNumbers {

    public static List<Integer> findAllDuplicateNumbers(int[] nums) {
        // Edge case: If the input array is null, return an empty list.
        if (nums == null) {
            return new ArrayList<>();
        }

        int i = 0;

        // Use the Cyclic Sort algorithm to rearrange elements.
        while (i < nums.length) {
            if (nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        List<Integer> duplicateNumbers = new ArrayList<>();

        // Find and collect duplicate numbers.
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                duplicateNumbers.add(nums[k]);
            }
        }

        return duplicateNumbers;
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        // Test case
        int[] nums = {3, 4, 4, 5, 5};
        System.out.println(findAllDuplicateNumbers(nums));
    }
}

