package org.com.jai.pattrens.binarysearch;

public class BitonicArrayMaximum {

    // Function to find the maximum element in a bitonic array.
    public static int findMax(int[] arr) {

        int start = 0; // Initialize the start index.
        int end = arr.length - 1; // Initialize the end index.

        while (start < end) { // Continue as long as the search range is valid.
            int mid = start + (end - start) / 2; // Calculate the middle index.

            if (arr[mid] > arr[mid + 1]) {
                end = mid; // If the mid element is greater than the next element, search the left half.
            } else {
                start = mid + 1; // If the mid element is smaller, search the right half.
            }
        }

        return arr[start]; // Return the maximum element found.

        /*
                Time Complexity: O(log N)
                Space Complexity: O(1)

         */
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 12, 4, 2};
        System.out.println(findMax(arr)); // Print the maximum element in the bitonic array.
    }
}

