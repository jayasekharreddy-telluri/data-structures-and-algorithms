package org.com.jai.pattrens.subsets;
import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static List<List<Integer>> findSubsets(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        // Add an empty list as the initial subset (an edge case: an empty set)
        result.add(new ArrayList<>());

        // Iterate through each number in the input array
        for (int currentNumber : nums) {

            // Get the current size of the result list (number of subsets generated so far)
            int size = result.size();

            // Iterate through each existing subset and create a new one by adding the current number
            for (int i = 0; i < size; i++) {
                // Create a copy of the existing subset
                List<Integer> set = new ArrayList<>(result.get(i));

                // Add the current number to the copy, creating a new subset
                set.add(currentNumber);

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
        int[] nums = {1, 3, 5};

        // Call the findSubsets method and print the result
        System.out.println(findSubsets(nums));
    }
}
