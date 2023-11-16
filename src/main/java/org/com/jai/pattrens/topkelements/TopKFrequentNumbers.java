package org.com.jai.pattrens.topkelements;

import java.util.*;

public class TopKFrequentNumbers {

    // Function to find the top k frequent numbers in an array
    public static List<Integer> findTopFrequentNumbers(int[] arr, int k) {
        // Create a map to store the frequency of each number
        Map<Integer, Integer> map = new HashMap<>();

        // Count the frequency of each number in the array
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // Use a min heap to keep track of the top k frequent numbers
        PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((e1, e2) -> e1.getValue() - e2.getValue());

        // Iterate through the map entries
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            minHeap.add(entry);

            // If the size of the heap exceeds k, remove the minimum element
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }

        // Create a list to store the top k frequent numbers
        List<Integer> topNumbers = new ArrayList<>(k);

        // Retrieve elements from the heap and add them to the list
        while (!minHeap.isEmpty()) {
            topNumbers.add(minHeap.poll().getKey());
        }

        // Return the list of top k frequent numbers
        return topNumbers;
    }

    public static void main(String[] args) {
        // Example usage
        int[] arr = {5, 12, 11, 3, 11};
        int k = 2;

        // Print the top k frequent numbers
        System.out.println(findTopFrequentNumbers(arr, k));
    }
}
