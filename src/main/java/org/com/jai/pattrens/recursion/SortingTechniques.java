package org.com.jai.pattrens.recursion;

import java.util.Arrays;

public class SortingTechniques {

    public static void main(String[] args) {

        int[] arr = {4, 3, 2, 1};
        bubbleSort(arr, arr.length - 1, 0);

        System.out.println("bubble sort : " + Arrays.toString(arr));


        selectionSort(arr, arr.length - 1, 0, 0);

        System.out.println("selection sort : " + Arrays.toString(arr));


    }

    private static void selectionSort(int[] arr, int start, int end, int max) {

        if (start == 0) {

            return;
        }

        if (end < start) {

            if (arr[end] > arr[max]) {

                selectionSort(arr, start, end + 1, end);
            } else {
                selectionSort(arr, start, end + 1, max);
            }
        } else {

            int temp = arr[max];
            arr[max] = arr[start - 1];
            arr[start - 1] = temp;
            selectionSort(arr, start - 1, 0, 0);
        }

    }

    private static void bubbleSort(int[] arr, int start, int end) {

        if (start == 0) {

            return;
        }

        if (end < start) {

            if (arr[end] > arr[end + 1]) {

                int temp = arr[end];

                arr[end] = arr[end + 1];

                arr[end + 1] = temp;
            }

            bubbleSort(arr, start, end + 1);
        } else {

            bubbleSort(arr, start - 1, 0);
        }

    }
}
