package org.com.jai.pattrens.binarysearch;

public class SearchInASortedInfiniteArray {

    // Function to search for a key in a sorted infinite array.
    public static int search(ArrayReader reader, int key) {
        int start = 0; // Initialize the start index.
        int end = 1; // Initialize the end index.

        // Search for a suitable range that potentially contains the key.
        while (reader.get(end) < key) {
            int newStart = end + 1;
            end = (end - start + 1) * 2; // Increase the search range exponentially.
            start = newStart;
        }

        return binarySearch(reader, start, end, key); // Perform binary search in the identified range.
    }

    // Helper function for binary search within a specific range.
    private static int binarySearch(ArrayReader reader, int start, int end, int key) {
        while (start <= end) {
            int mid = start + (end - start) / 2; // Calculate the middle index.

            if (key < reader.get(mid)) {
                end = mid - 1; // If the key is smaller, search the left half of the range.
            } else if (key > reader.get(mid)) {
                start = mid + 1; // If the key is larger, search the right half of the range.
            } else {
                return mid; // If the key is found, return its index.
            }
        }

        return -1; // If the key is not found in the range, return -1.


        /*

                Time Complexity: O(log N)
                Space Complexity: O(1)

         */
    }

    public static void main(String[] args) {
        ArrayReader reader = new ArrayReader(new int[]{1, 3, 8, 10, 15});
        int key = 200;
        System.out.println(search(reader, key)); // Print the result of searching for the key.
    }
}
