package org.com.jai.pattrens.topkelements;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class TopKNumbers {

    public static List<Integer> topKNumbers(int[] arr, int k) {

        // Create a min heap to store the top k numbers
        PriorityQueue<Integer> minQueue = new PriorityQueue<>((n1, n2) -> n1 - n2);

        // Add the first k elements to the min heap
        for (int i = 0; i < k; i++) {
            minQueue.add(arr[i]);
        }

        // Iterate through the remaining elements
        for (int i = k; i < arr.length; i++) {
            // If the current element is greater than the smallest element in the heap
            if (arr[i] > minQueue.peek()) {
                // Remove the smallest element
                minQueue.poll();
                // Add the current element to the heap
                minQueue.add(arr[i]);
            }
        }

        // Convert the min heap to a list and return
        return new ArrayList<>(minQueue);
        /*
            Time Complexity: O(N * log(K)) where N is the size of the input array.
                             Each insertion and extraction in the min heap takes O(log(K)) time.
            Space Complexity: O(K) - The size of the min heap.
         */
    }

    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 7, 2};
        int k = 3;

        System.out.println(topKNumbers(arr, k));
    }
}
