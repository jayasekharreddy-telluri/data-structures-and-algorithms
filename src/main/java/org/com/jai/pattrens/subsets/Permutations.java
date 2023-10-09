package org.com.jai.pattrens.subsets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Permutations {

    public static List<List<Integer>> findPermutations(int[] nums) {

        // Initialize the result list to store permutations
        List<List<Integer>> result = new ArrayList<>();

        // Use a queue to generate permutations iteratively
        Queue<List<Integer>> permutations = new LinkedList<>();

        // Add an empty list as the initial permutation
        permutations.add(new ArrayList<>());

        // Iterate through each number in the input array
        for (int num : nums) {

            // Get the number of permutations generated so far
            int n = permutations.size();

            // Iterate through the existing permutations
            for (int i = 0; i < n; i++) {

                // Remove an old permutation from the queue
                List<Integer> oldPermutation = permutations.poll();

                // Iterate through positions to insert the new number
                for (int j = 0; j <= oldPermutation.size(); j++) {

                    // Create a new permutation based on the old one
                    List<Integer> newPermutation = new ArrayList<>(oldPermutation);

                    // Insert the new number at the current position
                    newPermutation.add(j, num);

                    // Check if the new permutation is complete
                    if (newPermutation.size() == nums.length) {

                        // If complete, add it to the result
                        result.add(newPermutation);
                    } else {

                        // If not complete, add it back to the queue for further processing
                        permutations.add(newPermutation);
                    }
                }
            }
        }

        return result;
        /*
                Time Complexity: O(N * N!)
                Space Complexity: O(N * N!)
         */
    }

    public static void main(String[] args) {

        int[] nums = {1};

        // Call the findPermutations method and print the result
        System.out.println(findPermutations(nums));
    }
}
