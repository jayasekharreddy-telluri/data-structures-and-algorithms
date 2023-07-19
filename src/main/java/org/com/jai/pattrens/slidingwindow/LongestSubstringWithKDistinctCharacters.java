package org.com.jai.pattrens.slidingwindow;


import java.nio.channels.IllegalChannelGroupException;
import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithKDistinctCharacters {

    public static int optimalSolution(String word, int k) {

        if(word == null || word.length() == 0 || word.length() < k){

            throw new IllegalArgumentException();
        }

        int windowStart = 0; // Start index of the sliding window
        int maxLength = 0; // Maximum length of substring with k distinct characters

        Map<Character, Integer> characterCount = new HashMap<>(); // Map to store character frequencies

        for (int windowEnd = 0; windowEnd < word.length(); windowEnd++) {
            char rightCharacter = word.charAt(windowEnd); // Character at the end of the window

            characterCount.put(rightCharacter, characterCount.getOrDefault(rightCharacter, 0) + 1);

            while (characterCount.size() > k) {
                char leftCharacter = word.charAt(windowStart); // Character at the start of the window
                characterCount.put(leftCharacter, characterCount.get(leftCharacter) - 1);

                // Remove the character from the map if its count becomes 0
                if (characterCount.get(leftCharacter) == 0) {
                    characterCount.remove(leftCharacter);
                }
                windowStart++; // Move the start of the window to the right
            }

            maxLength = Math.max(maxLength, windowEnd - windowStart + 1); // Update the maximum length
        }

        return maxLength; // Return the length of the longest substring with k distinct characters

        /*
            Time Complexity: O(n)
            - The algorithm iterates through the word with a sliding window approach, which takes O(n) time.

            Space Complexity: O(k)
            - The algorithm uses a HashMap to store character frequencies, and the size of the map can be at most k.
            - So, the space complexity is O(k).
        */
    }

    public static void main(String[] args) {
        String word = "cbbebi";
        int k = 3;

        System.out.println(optimalSolution(word, k));
    }
}

