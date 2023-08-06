package org.com.jai.pattrens.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/*
    https://leetcode.com/problems/longest-substring-without-repeating-characters/
*/
public class NoRepeatSubstring {

    public static int optimalSolution(String s) {

        int maxLength = 0; // Initialize the maximum length of the substring without repeating characters.
        int windowStart = 0; // Initialize the start of the sliding window.
        Map<Character, Integer> map = new HashMap<>(); // Create a map to store characters and their indices.

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {

            char c = s.charAt(windowEnd); // Get the character at the current window end.

            if (map.containsKey(c)) {
                // If the character is already in the map, update the start of the window to the next index after the last occurrence of the character.
                windowStart = Math.max(windowStart, map.get(c) + 1);
            }

            map.put(c, windowEnd); // Add the character and its index to the map.

            // Update the maximum length of the substring without repeating characters.
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }

        return maxLength; // Return the maximum length of the substring without repeating characters.

        /*
                time complexity of the solution : O(N)

                space complexity : O(K)
         */
    }

    public static void main(String[] args) {

        String s = "aaa"; // Input string.

        int result = optimalSolution(s); // Find the maximum length of the substring without repeating characters.

        System.out.println(result); // Print the result.
    }
}
