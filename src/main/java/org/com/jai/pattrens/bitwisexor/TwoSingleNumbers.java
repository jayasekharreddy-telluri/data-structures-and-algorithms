package org.com.jai.pattrens.bitwisexor;

import java.util.Arrays;

public class TwoSingleNumbers {

    public static int[] findSingleNumbers(int[] nums){

        int n1xn2 = 0; // Variable to store the XOR of the two single numbers

        // Calculating the XOR of all numbers to find n1 XOR n2
        for(int num : nums){
            n1xn2 = n1xn2 ^ num;
        }

        int rightMostSetBit =  1; // Initialize the rightmost set bit as '1'

        // Finding the rightmost set bit in n1xn2
        while ((rightMostSetBit & n1xn2) == 0){
            rightMostSetBit = rightMostSetBit << 1; // Left shift to find the next set bit
        }

        int num1 = 0, num2 = 0;

        // Separating the numbers based on the rightmost set bit
        for (int num : nums){
            if ((num & rightMostSetBit) != 0){
                num1 = num1 ^ num; // XOR operation for numbers with the set bit
            } else {
                num2 = num2 ^ num; // XOR operation for numbers without the set bit
            }
        }

        return new int[] {num1, num2}; // Returning the two single numbers
        /*
                Time Complexity -- o(n)

                Space Complexity -- o(1)
         */
    }

    public static void main(String[] args) {

        int[] nums = {1, 4, 2, 1, 3, 5, 6, 2, 3, 5}; // Example array

        System.out.println(Arrays.toString(findSingleNumbers(nums))); // Print the single numbers
    }
}
