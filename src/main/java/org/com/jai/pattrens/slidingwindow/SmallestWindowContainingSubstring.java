package org.com.jai.pattrens.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Minimum Window Substring
 * LeetCode Problem Link: https://leetcode.com/problems/minimum-window-substring/
 */
public class SmallestWindowContainingSubstring {

    public static String optimalSolution(String s, String pattern) {

        if(s == null || s.length() == 0 || pattern == null || pattern.length() == 0){

            return "";
        }
        int windowStart = 0;
        int minLength = s.length() + 1; // Initialize with a value greater than the input string length
        int subArrayIndex = 0;
        int matching = 0;

        Map<Character, Integer> charFrequencyMap = new HashMap<>();

        // Create a frequency map of characters in the pattern
        for (char ch : pattern.toCharArray()) {
            charFrequencyMap.put(ch, charFrequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Traverse the input string
        for (int windowEnd = 0; windowEnd < s.length(); windowEnd++) {
            Character rightChar = s.charAt(windowEnd);

            // Check if the character exists in the pattern
            if (charFrequencyMap.containsKey(rightChar)) {
                charFrequencyMap.put(rightChar, charFrequencyMap.get(rightChar) - 1);
                if (charFrequencyMap.get(rightChar) >= 0) {
                    matching++;
                }
            }

            // Adjust the sliding window and track the minimum length substring
            while (matching == pattern.length()) {
                if (minLength > windowEnd - windowStart + 1) {
                    minLength = windowEnd - windowStart + 1;
                    subArrayIndex = windowStart;
                }

                Character leftChar = s.charAt(windowStart++);

                // If the left character is part of the pattern, update the frequency map
                if (charFrequencyMap.containsKey(leftChar)) {
                    if (charFrequencyMap.get(leftChar) == 0) {
                        matching--;
                    }
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }

        // If minLength is not updated, return an empty string
        return minLength > s.length() ? "" : s.substring(subArrayIndex, subArrayIndex + minLength);

        /*
                time complexity of this algorithm is O(N)
                space complexity is O(K)
         */
    }

    public static void main(String[] args) {
        // Example input
        String s = "aabdec";
        String pattern = "abc";

        // Call the function and print the result
        String result = optimalSolution(s, pattern);
        System.out.println(result);
    }
}
