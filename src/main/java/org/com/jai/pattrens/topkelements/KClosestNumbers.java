package org.com.jai.pattrens.topkelements;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestNumbers {

    public static List<Integer> findClosestNumbers(int[] arr, int k, int x) {

        // Finding the index of 'x' or the immediate smaller element
        int index = binarySearch(arr, x);

        int low = index - k;
        int high = index + k;

        // Adjust low and high indices within array bounds
        low = Math.max(low, 0);
        high = Math.min(high, arr.length - 1);

        // Min heap to store entries based on their distances from 'x'
        PriorityQueue<Entry> minHeap = new PriorityQueue<>((e1, e2) -> e1.key - e2.key);

        // Adding entries to the min heap based on their absolute differences from 'x'
        for (int i = low; i <= high; i++) {
            minHeap.add(new Entry(Math.abs(arr[i] - x), i));
        }

        List<Integer> result = new ArrayList<>();

        // Extracting the closest 'k' elements from the heap
        for (int i = 0; i < k; i++) {
            result.add(arr[minHeap.poll().value]);
        }

        // Sorting the result list
        Collections.sort(result);

        return result;
        /*
            Time Complexity: O(log(N) + K*log(K)) where N is the number of elements in the array.
                             The binary search takes O(log(N)), and extracting 'k' elements from the min heap takes O(K*log(K)) time.
            Space Complexity: O(K) - The size of the min heap.
         */
    }

    // Binary search to find the index of 'x' or the immediate smaller element
    private static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (low > 0) {
            return low - 1;
        }
        return low;
    }

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9};
        int k = 3;
        int x = 7;
        System.out.println(findClosestNumbers(arr, k, x));
    }
}
