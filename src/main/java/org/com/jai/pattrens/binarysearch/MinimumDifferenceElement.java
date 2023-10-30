package org.com.jai.pattrens.binarysearch;

public class MinimumDifferenceElement {

    // Function to search for the element in the array with the minimum difference to the key.
    public static int searchMinimumDifferenceElement(int[] arr, int key) {

        if (key < arr[0]) {
            return arr[0]; // If the key is smaller than the smallest element, return the smallest element.
        }

        if (key > arr[arr.length - 1]) {
            return arr[arr.length - 1]; // If the key is larger than the largest element, return the largest element.
        }

        int start = 0; // Initialize the start index.
        int end = arr.length - 1; // Initialize the end index.

        while (start <= end) { // While the search range is valid.
            int mid = start + (end - start) / 2; // Calculate the middle index.

            if (key < arr[mid]) {
                end = mid - 1; // If the key is smaller, search the left half of the array.
            } else if (key > arr[mid]) {
                start = mid + 1; // If the key is larger, search the right half of the array.
            } else {
                return arr[mid]; // If the key is equal to the element at mid, return it.
            }
        }

        if ((arr[start] - key) < (key - arr[end])) {
            return arr[start]; // If the difference between key and the element at start is smaller, return the start element.
        }

        return arr[end]; // Otherwise, return the end element.


        /*

                Time Complexity: O(log N)
                Space Complexity: O(1)

         */
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 8, 10, 15};
        int key = 12;
        System.out.println(searchMinimumDifferenceElement(arr, key)); // Print the element with the minimum difference to the key.
    }
}
