package org.com.jai.pattrens.binarysearch;

public class SearchInRotatedArray {

    public static int search(int[] arr, int key) {
        // Initialize the start and end pointers for binary search.
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Calculate the middle index.
            int mid = start + (end - start) / 2;

            // If the middle element is equal to the key, return the index.
            if (arr[mid] == key) {
                return mid;
            }

            // Check if the left subarray is sorted.
            if (arr[start] <= arr[mid]) {
                // If the key is within the left sorted subarray, adjust the end pointer.
                if (key >= arr[start] && key < arr[mid]) {
                    end = mid - 1;
                } else {
                    // Otherwise, adjust the start pointer.
                    start = mid + 1;
                }
            } else {
                // If the right subarray is sorted, and the key is within it, adjust the start pointer.
                if (key > arr[mid] && key <= arr[end]) {
                    start = mid + 1;
                } else {
                    // Otherwise, adjust the end pointer.
                    end = mid - 1;
                }
            }
        }

        // If the key is not found in the array, return -1.
        return -1;

        /*

                Time Complexity: O(log N)
                Space Complexity: O(1)

         */
    }

    public static void main(String[] args) {
        int[] arr = {10, 15, 1, 3, 10};
        int key = 15;

        int result = search(arr, key);
        System.out.println("Index of " + key + " in the rotated array: " + result);
    }
}
