package org.com.jai.pattrens.topkelements;

import java.util.PriorityQueue;

public class ConnectRopes {

    // Method to find the minimum cost to connect ropes
    public static int minCostConnectRopes(int[] arr) {

        // Min heap to store the lengths of ropes
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);

        // Add all the rope lengths to the min heap
        for (int i = 0; i < arr.length; i++) {
            minHeap.add(arr[i]);
        }

        int temp = 0, result = 0;

        // Combine the two smallest ropes until there is only one rope left
        while (minHeap.size() > 1) {
            temp = minHeap.poll() + minHeap.poll(); // Combine the two smallest ropes
            result += temp; // Add the combined length to the result
            minHeap.add(temp); // Add the combined length back to the min heap
        }

        return result; // Return the total cost
        /*
            Time Complexity: O(N * log(N)) where N is the number of ropes.
                             Each insertion and extraction in the min heap takes O(log(N)) time.
            Space Complexity: O(N) - The size of the min heap.
         */
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 6};

        System.out.println(minCostConnectRopes(arr));
    }
}
