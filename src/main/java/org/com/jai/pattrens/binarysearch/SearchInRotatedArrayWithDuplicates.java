package org.com.jai.pattrens.binarysearch;

public class SearchInRotatedArrayWithDuplicates {

    public static int search(int[] arr, int key) {
        // Initialize the start and end pointers for binary search.
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // Calculate the middle index.
            int mid = start + (end - start) / 2;

            if (arr[mid] == key) {
                // If the middle element is equal to the key, return the index.
                return mid;
            }

            // Handle the case where elements at start, middle, and end are the same.
            while (arr[start] == arr[mid] && arr[end] == arr[mid]) {
                start++;
                end--;
            }

            if (arr[start] <= arr[mid]) {
                if (key >= arr[start] && key < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (key > arr[mid] && key <= arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;


        /*

                Time Complexity: O(log N)
                Space Complexity: O(1)

         */
    }

    public static void main(String[] args) {
        int[] arr = {3, 7, 3, 3, 3};
        int key = 7;
        int result = search(arr, key);
        System.out.println("Index of " + key + " in the rotated array with duplicates: " + result);
    }
}
