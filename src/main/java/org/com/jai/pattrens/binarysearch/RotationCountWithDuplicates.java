package org.com.jai.pattrens.binarysearch;

public class RotationCountWithDuplicates {

    public static int countRotations(int[] arr) {

        int start = 0; // Initialize start index
        int end = arr.length - 1; // Initialize end index

        while (start < end) {

            int mid = start + (end - start) / 2; // Calculate the middle index

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid + 1; // Return index of the minimum element (number of rotations)
            }

            if (mid > start && arr[mid - 1] > arr[mid]) {
                return mid; // Return index of the minimum element (number of rotations)
            }

            if (arr[start] == arr[mid] && arr[mid] == arr[end]) {
                // Handling duplicates scenario
                if (arr[start] > arr[start + 1]) {
                    return start + 1; // Return index of the minimum element (number of rotations)
                }
                ++start; // Move start pointer
                if (arr[end - 1] > arr[end]) {
                    return end; // Return index of the minimum element (number of rotations)
                }
                --end; // Move end pointer
            } else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1; // Update start index to search in the unsorted half
            } else {
                end = mid - 1; // Update end index to search in the unsorted half
            }
        }

        return 0; // Return 0 if the array is not rotated

        /*
            Time complexity  -- O(logN);
            Space complexity -- O(1)
         */
    }

    public static void main(String[] args) {

        int[] arr = {3, 3, 7, 3}; // Example sorted but rotated array with duplicates

        System.out.println(countRotations(arr)); // Print the number of rotations

    }
}
