package org.com.jai.pattrens.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/*
    Given an array of characters representing fruits in a row, we need to find the length of the longest
    subarray containing at most two different types of fruits. We can only pick two different types of
    fruits, and each basket can have only one type of fruit.

    URL: https://leetcode.com/problems/fruit-into-baskets/
*/

public class FruitsIntoBaskets {

    public static int optimalSolution(char[] array) {
        // Check for edge case: If the input array is null or empty, there are no fruits to pick.
        if (array == null || array.length == 0) {
            System.out.println(0);
            return 0;
        }

        int windowStart = 0; // Starting index of the sliding window
        int maximumLength = 0; // Length of the longest subarray containing at most 2 different fruits
        Map<Character, Integer> fruitFrequencyMap = new HashMap<>(); // Map to store the frequency of each fruit in the current window

        for (int windowEnd = 0; windowEnd < array.length; windowEnd++) {
            // Add the current fruit to the frequency map and update its count
            fruitFrequencyMap.put(array[windowEnd], fruitFrequencyMap.getOrDefault(array[windowEnd], 0) + 1);

            // Slide the window until we have at most 2 different fruits in the current window
            while (fruitFrequencyMap.size() > 2) {
                // Remove the fruit at the start of the window and update its count
                fruitFrequencyMap.put(array[windowStart], fruitFrequencyMap.get(array[windowStart]) - 1);

                // If the count becomes 0, remove the fruit from the map
                if (fruitFrequencyMap.get(array[windowStart]) == 0) {
                    fruitFrequencyMap.remove(array[windowStart]);
                }

                // Move the window start to the right to reduce the window size
                windowStart++;
            }

            // Update the maximum length if needed
            maximumLength = Math.max(maximumLength, windowEnd - windowStart + 1);
        }

        System.out.println(maximumLength);
        return maximumLength;

        /*
                The time complexity of this solution is O(N);
                The space complexity is O(1)
         */
    }

    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C', 'B', 'B', 'C'};
        optimalSolution(array);
    }
}
