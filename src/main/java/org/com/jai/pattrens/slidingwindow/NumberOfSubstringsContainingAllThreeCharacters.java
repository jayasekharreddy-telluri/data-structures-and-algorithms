package org.com.jai.pattrens.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class NumberOfSubstringsContainingAllThreeCharacters {

    public static int optimalSolution(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int windowStart = 0;
        int windowEnd = 0;
        int count = 0;
        int n = s.length();

        // Loop through the string using the sliding window technique.
        while (windowEnd < n) {
            char c = s.charAt(windowEnd);

            // Extend the current window to include the element at windowEnd.
            map.put(c, map.getOrDefault(c, 0) + 1);

            // Shrink the window from the left until it contains all three characters 'a', 'b', and 'c'.
            while (map.getOrDefault('a', 0) > 0 && map.getOrDefault('b', 0) > 0 && map.getOrDefault('c', 0) > 0) {
                // Count the number of substrings containing all three characters and update the count.
                count = count + n - windowEnd;

                // Move the window's start pointer to the right and adjust the map accordingly.
                c = s.charAt(windowStart);
                map.put(c, map.get(c) - 1);
                windowStart++;
            }

            // Move the window's end pointer to the right.
            windowEnd++;
        }

        // The 'count' variable holds the total number of substrings containing all three characters.
        return count;

        /*
                Time Complexity: O(n)
                Space Complexity: O(1)
         */

    }

    public static void main(String[] args) {
        String s = "abca";

        int result = optimalSolution(s);
        System.out.println("Total substrings containing all three characters: " + result);
    }
}
