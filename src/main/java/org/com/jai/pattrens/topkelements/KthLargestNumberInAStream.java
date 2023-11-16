package org.com.jai.pattrens.topkelements;

import java.util.PriorityQueue;

public class KthLargestNumberInAStream {

    // Min heap to store the kth largest elements
    PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);

    // The value of k for the kth largest element
    final int k;

    // Constructor to initialize the object with an array of numbers and the value of k
    public KthLargestNumberInAStream(int[] nums, int k) {
        this.k = k;

        // Add each element to the min heap
        for (int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }

    // Method to add a new number to the stream and return the kth largest element
    public int add(int num) {
        // Add the number to the min heap
        minHeap.add(num);

        // If the size of the min heap exceeds k, remove the smallest element
        if (minHeap.size() > this.k) {
            minHeap.poll();
        }

        // Return the kth largest element, which is the smallest element in the min heap
        return minHeap.peek();
    }

    public static void main(String[] args) {
        // Example usage
        int[] input = new int[]{3, 1, 5, 12, 2, 11};

        // Create an object with kth largest stream
        KthLargestNumberInAStream k = new KthLargestNumberInAStream(input, 4);

        // Add new numbers and print the kth largest after each addition
        System.out.println(k.add(6));
        System.out.println(k.add(13));
        System.out.println(k.add(4));
    }
}
