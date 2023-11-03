package org.com.jai.pattrens.bitwisexor;

public class SingleNumber {

    public static int findSingleNumber(int[] arr) {
        // Initialize the result as 0.
        int num = 0;

        // XOR each element in the array with the result.
        for (int i = 0; i < arr.length; i++) {
            num = num ^ arr[i];
        }

        // The final 'num' will be the single number that occurs only once in the array.
        return num;
        /*

                time complexity - O(n)
                space complexity - O(1)
         */
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 1, 3, 2, 3};
        int result = findSingleNumber(arr);
        System.out.println("Single number in the array: " + result);
    }
}
