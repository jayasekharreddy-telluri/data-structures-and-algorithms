package org.com.jai.pattrens.binarysearch;

public class SearchBitonicArray {

    // Function to search for a key in a bitonic array.
    public static int search(int[] arr, int key) {

        int maxIndex = findMax(arr); // Find the index of the maximum element in the bitonic array.

        int keyIndex = binarySearch(arr, 0, maxIndex, key); // Search the ascending part of the array.

        if (keyIndex != -1) {
            return keyIndex; // If the key is found in the ascending part, return its index.
        }

        return binarySearch(arr, maxIndex + 1, arr.length - 1, key); // Search the descending part of the array.
    }

    // Helper function for binary search within a specific range.
    private static int binarySearch(int[] arr, int start, int end, int key) {

        while (start <= end) {

            int mid = start + (end - start) / 2; // Calculate the middle index.

            if (arr[mid] == key) {
                return mid; // If the key is found, return its index.
            }

            if (arr[start] < arr[end]) {
                if (key < arr[mid]) {
                    end = mid - 1; // If the array is in ascending order, search the left half.
                } else {
                    start = mid + 1; // If the array is in ascending order, search the right half.
                }
            } else {
                if (key > arr[mid]) {
                    end = mid - 1; // If the array is in descending order, search the left half.
                } else {
                    start = mid + 1; // If the array is in descending order, search the right half.
                }
            }
        }

        return -1; // If the key is not found in the range, return -1.
    }

    // Helper function to find the maximum element's index in the bitonic array.
    private static int findMax(int[] arr) {

        int start = 0; // Initialize the start index.
        int end = arr.length - 1; // Initialize the end index.

        while (start < end) {
            int mid = start + (end - start) / 2; // Calculate the middle index.

            if (arr[mid] > arr[mid + 1]) {
                end = mid; // If the mid element is greater than the next element, search the left half.
            } else {
                start = mid + 1; // If the mid element is smaller, search the right half.
            }
        }

        return start; // Return the index of the maximum element.


        /*
                Time Complexity: O(log N)
                Space Complexity: O(1)

         */
    }

    public static void main(String[] args) {
        int[] arr = {10, 9, 8};
        int key = 10;
        System.out.println(search(arr, key)); // Print the result of searching for the key in the bitonic array.
    }
}
