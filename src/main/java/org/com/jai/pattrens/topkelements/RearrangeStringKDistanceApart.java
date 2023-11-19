package org.com.jai.pattrens.topkelements;

import java.util.*;

public class RearrangeStringKDistanceApart {

    public static String rearrangeStringKDistanceApart(String str, int k) {

        // Edge case: If k is less than or equal to 1, no rearrangement needed
        if (k <= 1) {
            return str;
        }

        // Create a map to store character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();

        // Create a max heap based on the character frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
                (e1, e2) -> e2.getValue() - e1.getValue()
        );

        // Count frequencies of each character in the input string
        for (char ch : str.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Add all character frequency entries to the max heap
        maxHeap.addAll(freqMap.entrySet());

        // Create a queue to store characters that have been used in the result
        Queue<Map.Entry<Character, Integer>> queue = new LinkedList<>();

        // Initialize a StringBuilder to store the rearranged string
        StringBuilder result = new StringBuilder(str.length());

        // Process the characters from the max heap
        while (!maxHeap.isEmpty()) {
            // Retrieve the character with the highest frequency
            Map.Entry<Character, Integer> currentEntry = maxHeap.poll();

            // Append the character to the result string
            result.append(currentEntry.getKey());

            // Decrement the frequency and add the entry to the queue
            currentEntry.setValue(currentEntry.getValue() - 1);
            queue.add(currentEntry);

            // Check if the queue size reaches k
            if (queue.size() == k) {
                // Retrieve the character from the queue
                Map.Entry<Character, Integer> entry = queue.poll();

                // If its frequency is greater than 0, add it back to the max heap
                if (entry.getValue() > 0) {
                    maxHeap.add(entry);
                }
            }
        }

        // If the length of the result string is equal to the input string, return the result
        // Otherwise, return "empty" indicating rearrangement is not possible
        return result.length() == str.length() ? result.toString() : "empty";
    }

    public static void main(String[] args) {
        // Test case
        String str = "aab";
        int k = 2;
        System.out.println(rearrangeStringKDistanceApart(str, k));
    }
}
