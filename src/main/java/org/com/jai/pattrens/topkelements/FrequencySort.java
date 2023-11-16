package org.com.jai.pattrens.topkelements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {

    // Function to sort characters in a string by their frequency
    public static String sortCharacterByFrequency(String str) {
        // Map to store the frequency of each character in the string
        Map<Character, Integer> map = new HashMap<>();

        // Count the frequency of each character in the string
        for (Character ch : str.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        // Max heap to store map entries based on their frequency (max frequency at the top)
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());

        // Add all map entries to the max heap
        maxHeap.addAll(map.entrySet());

        // StringBuilder to build the sorted string based on character frequency
        StringBuilder sortedString = new StringBuilder();

        // Build the sorted string by appending characters based on their frequency
        while (!maxHeap.isEmpty()) {
            Map.Entry<Character, Integer> entry = maxHeap.poll();

            for (int i = 0; i < entry.getValue(); i++) {
                sortedString.append(entry.getKey());
            }
        }

        // Return the final sorted string
        return sortedString.toString();
    }

    public static void main(String[] args) {
        // Example usage
        String result = "Programming";

        // Print the result of sorting characters by frequency
        System.out.println(sortCharacterByFrequency(result));
    }
}
