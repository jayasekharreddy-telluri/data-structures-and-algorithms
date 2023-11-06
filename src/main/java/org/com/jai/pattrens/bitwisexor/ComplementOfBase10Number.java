package org.com.jai.pattrens.bitwisexor;

public class ComplementOfBase10Number {

    public static int bitWiseCompliment(int num) {

        int bitCount = 0; // Variable to count the number of bits in the number

        int n = num;

        // Calculating the number of bits in the number
        while (n > 0) {
            bitCount++;
            n = n >> 1; // Right shifting to count the bits
        }

        // Calculating a number with all bits set of size 'bitCount'
        int all_bit_set = (int) Math.pow(2, bitCount) - 1;

        // Finding the bitwise complement using XOR
        return num ^ all_bit_set;
        /*
            Time Complexity -- O(log N)
            Space Complexity -- O(1)
         */
    }

    public static void main(String[] args) {

        int num = 8; // Example number

        System.out.println(bitWiseCompliment(num)); // Print the bitwise complement
    }
}
