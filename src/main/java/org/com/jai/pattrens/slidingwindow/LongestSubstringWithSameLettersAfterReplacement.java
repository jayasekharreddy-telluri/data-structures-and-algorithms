package org.com.jai.pattrens.slidingwindow;


import java.util.HashMap;
import java.util.Map;

/*
    https://leetcode.com/problems/longest-repeating-character-replacement/
*/
public class LongestSubstringWithSameLettersAfterReplacement {

    public static int optimalSolution(String s, int k) {

        int windowStart = 0; // Initialize the start of the sliding window.
        int maxLength = 0; // Initialize the maximum length of the substring with the same letters after replacements.
        int maxRepeatLetterCount = 0; // Initialize the count of the maximum repeating letter in the current window.

        Map<Character, Integer> map = new HashMap<>(); // Create a map to store characters and their counts.

        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {

            char rightChar = s.charAt(windowEnd); // Get the character at the current window end.

            map.put(rightChar, map.getOrDefault(rightChar, 0) + 1); // Increment the count of the current character.

            maxRepeatLetterCount = Math.max(maxRepeatLetterCount, map.get(rightChar)); // Update the maximum repeating letter count.

            // If the current window size minus the count of the maximum repeating letter is greater than "k," then we need to shrink the window.
            if (windowEnd - windowStart + 1 - maxRepeatLetterCount > k) {
                char leftChar = s.charAt(windowStart); // Get the character at the current window start.
                map.put(leftChar, map.get(leftChar) - 1); // Decrement the count of the left character.
                windowStart++; // Shrink the window by moving the start pointer to the right.
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1); // Update the maximum length of the substring with the same letters.
        }

        return maxLength; // Return the maximum length of the substring with the same letters after replacements.

        /*
            time complexity of the solution : O(N)
            space complexity : O(1)
         */

    }

    public static void main(String[] args) {

        String s = "aabccbb"; // Input string.
        int k = 2; // Maximum number of replacements allowed.
        int result = optimalSolution(s, k); // Find the maximum length of the substring with the same letters after replacements.
        System.out.println(result); // Print the result.
    }
}
