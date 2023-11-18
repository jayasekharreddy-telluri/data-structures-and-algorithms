package org.com.jai.pattrens.topkelements;

import java.util.PriorityQueue;

public class SumOfElements {

    // Method to find the sum of elements between k1 and k2 indices after sorting the array
    public static int findSumOfElements(int[] arr, int k1, int k2) {

        // Min heap to store elements
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);

        // Adding all elements to the min heap
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        // Remove k1 smallest elements
        for (int i = 0; i < k1; i++) {
            minHeap.poll();
        }

        int elementSum = 0;

        // Find the sum of elements between k1 and k2 indices
        for (int i = 0; i < k2 - k1 - 1; i++) {
            elementSum += minHeap.poll();
        }

        return elementSum;
        /*
            Time Complexity: O(N * log(N))
            Space Complexity: O(N)
         */
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 7};
        int k1 = 1;
        int k2 = 4;
        System.out.println(findSumOfElements(arr, k1, k2));
    }
}
