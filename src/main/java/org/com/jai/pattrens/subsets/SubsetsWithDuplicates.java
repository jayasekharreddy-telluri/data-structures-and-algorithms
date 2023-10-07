package org.com.jai.pattrens.subsets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsWithDuplicates {

    public static List<List<Integer>> findSubsets(int[] nums) {

        // Initialize the result list
        List<List<Integer>> result = new ArrayList<>();

        // Sort the input array to handle duplicates efficiently
        Arrays.sort(nums);

        // Add an empty subset as the initial subset
        result.add(new ArrayList<>());

        int startIndex, endIndex = 0;

        for (int i = 0; i < nums.length; i++) {

            startIndex = 0;

            // Check if the current number is the same as the previous number
            if (i > 0 && nums[i] == nums[i - 1]) {
                // If it's a duplicate, set the startIndex to the end of the previously added subsets
                startIndex = endIndex + 1;
            }

            // Update the endIndex to the current size of the result list
            endIndex = result.size() - 1;

            // Iterate through the subsets generated so far
            for (int j = startIndex; j <= endIndex; j++) {

                // Create a new subset by copying an existing one
                List<Integer> set = new ArrayList<>(result.get(j));

                // Add the current number to the new subset
                set.add(nums[i]);

                // Add the new subset to the result list
                result.add(set);
            }
        }

        return result;


        /*
                Time Complexity: O(2^n),
                Space Complexity: O(2^n).
         */
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 3};

        // Call the findSubsets method and print the result
        System.out.println(findSubsets(nums));
    }
}
