package org.com.jai.pattrens.topkelements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class RearrangeString {

    // Method to rearrange the string such that no two same characters are adjacent
    public static String rearrangeString(String str) {

        // Map to store character frequencies
        Map<Character, Integer> charFreqMap = new HashMap<>();

        // Counting the frequency of each character in the string
        for (char chr : str.toCharArray()) {
            charFreqMap.put(chr, charFreqMap.getOrDefault(chr, 0) + 1);
        }

        // Max heap to store characters with their frequencies
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
        maxHeap.addAll(charFreqMap.entrySet());

        Map.Entry<Character, Integer> previousEntry = null;
        StringBuilder result = new StringBuilder(str.length());

        // Reordering the string
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> currentEntry = maxHeap.poll();

            if (previousEntry != null && previousEntry.getValue() > 0) {
                maxHeap.add(previousEntry);
            }

            result.append(currentEntry.getKey());
            currentEntry.setValue(currentEntry.getValue() - 1);
            previousEntry = currentEntry;
        }

        return result.length() == str.length() ? result.toString() : "empty";
        /*
            Time Complexity: O(N * log(N))
            Space Complexity: O(N)
        */
    }

    public static void main(String[] args) {
        String str = "abcdaf";
        System.out.println(rearrangeString(str));
    }
}
