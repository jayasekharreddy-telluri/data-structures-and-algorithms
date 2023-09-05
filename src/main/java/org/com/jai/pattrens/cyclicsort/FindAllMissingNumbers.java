package org.com.jai.pattrens.cyclicsort;

import java.util.ArrayList;
import java.util.List;

public class FindAllMissingNumbers {

    public static List<Integer> findAllMissingNumbers(int[] nums) {
        // Edge case: If the input array is null, return an empty list.
        if (nums == null) {
            return new ArrayList<>();
        }

        int i = 0;

        // Use the Cyclic Sort algorithm to rearrange elements.
        while (i < nums.length) {
            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[nums[i] - 1]) {
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        List<Integer> missingNumbers = new ArrayList<>();

        // Find and collect missing numbers.
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                missingNumbers.add(k + 1);
            }
        }

        return missingNumbers;


        /*
                Time Complexity: O(n)
                Space Complexity: O(1)
         */
    }

    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {

        int[] nums1 = {2, 3, 2, 1};
        System.out.println(findAllMissingNumbers(nums1));

        int[] nums2 = {1, 2, 3, 4, 5};
        System.out.println(findAllMissingNumbers(nums2));

    }
}

