package org.com.jai.pattrens.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/*
    https://leetcode.com/problems/permutation-in-string/
 */
public class PermutationInAString {

    public static boolean optimalSolution(String s, String pattern) {

        int windowStart = 0; // Initialize the start of the sliding window.
        int matching = 0; // Initialize the count of characters that match the pattern.
        Map<Character, Integer> map = new HashMap<>(); // Create a map to store characters and their counts from the pattern.

        // Populate the map with characters and their counts from the pattern.
        for (char ch : pattern.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Iterate through the input string using the sliding window.
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {

            char rightChar = s.charAt(windowEnd); // Get the character at the current window end.

            // If the character is present in the map, decrement its count.
            if (map.containsKey(rightChar)) {
                map.put(rightChar, map.get(rightChar) - 1);
                // If the count becomes zero, it means the character matches the pattern, so increment the matching count.
                if (map.get(rightChar) == 0) {
                    matching++;
                }
            }

            // If all characters from the pattern are matched, return true.
            if (matching == map.size()) {
                return true;
            }

            // Shrink the window when it reaches the size of the pattern.
            if (windowEnd >= pattern.length() - 1) {
                char leftChar = s.charAt(windowStart++); // Get the character at the current window start.

                // If the character is present in the map, update the matching count and increment its count in the map.
                if (map.containsKey(leftChar)) {
                    if (map.get(leftChar) == 0) {
                        matching--;
                    }
                    map.put(leftChar, map.get(leftChar) + 1);
                }
            }
        }

        return false; // If no permutation of the pattern is found in the input string, return false.

        /*
                Time Complexity: O(N + M), where N is the length of the input string "s" and M is the length of the pattern string

                Space Complexity: O(M), where M is the number of unique characters in the pattern string
         */
    }

    public static void main(String[] args) {
        String s = "aaacb"; // Input string.
        String pattern = "abc"; // Pattern string.
        boolean result = optimalSolution(s, pattern); // Check if a permutation of the pattern exists in the input string.
        System.out.println(result); // Print the result.
    }
}
