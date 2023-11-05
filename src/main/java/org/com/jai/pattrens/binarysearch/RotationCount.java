package org.com.jai.pattrens.binarysearch;

public class RotationCount {

    // Function to count the number of rotations in a sorted but rotated array
    public static int countRotations(int[] arr) {

        int start = 0; // Initialize start index
        int end = arr.length - 1; // Initialize end index

        while (start < end) { // Perform binary search

            int mid = start + (end - start) / 2; // Calculate the middle index

            if (mid < end && arr[mid] > arr[mid + 1]) {
                // Check if the element at the middle index is greater than the next element
                return mid + 1; // Return the index of the minimum element (number of rotations)
            }

            if (mid > start && arr[mid - 1] > arr[mid]) {
                // Check if the element at the middle index is less than the previous element
                return mid; // Return the index of the minimum element (number of rotations)
            }

            if (arr[start] < arr[mid]) {
                // If the first half is sorted
                start = mid + 1; // Update the start index to search in the unsorted half
            } else {
                // If the second half is sorted
                end = mid - 1; // Update the end index to search in the unsorted half
            }
        }

        return 0; // Return 0 if the array is not rotated


        /*
            Time complexity  -- O(logN);
            Space complexity -- O(1)
         */
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 8, 10}; // Example sorted but rotated array

        System.out.println(countRotations(arr)); // Print the number of rotations

    }
}
