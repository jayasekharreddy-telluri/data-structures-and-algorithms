package org.com.jai.pattrens.cyclicsort;

import javax.swing.*;

public class FindTheMissingNumber {

    public static int findMissingNumber(int[] arr) {

        // Edge case: If the input array is empty, return -1 (no missing number).
        if (arr.length == 0) {
            return -1;
        }

        int i = 0;
        while (i < arr.length) {

            // Check if the current element is within the array bounds and not in its correct position.
            if (arr[i] <= arr.length && arr[i] != i + 1) {
                int j = arr[i] - 1;
                swap(arr, i, j); // Swap the current element with the element at the correct index.
            } else {
                i++;
            }
        }

        // Find the missing number by scanning the array.
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        // If all numbers from 1 to n are in their correct positions, return -1 (no missing number).
        return -1;
    }

    // Utility method to swap two elements in the array.
    private static void swap(int[] arr, int i, int j) {
        int x = arr[i];
        arr[i] = arr[j];
        arr[j] = x;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 6, 1};

        // Find and print the missing number.
        System.out.println(findMissingNumber(arr));
    }
}
