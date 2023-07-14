package org.com.jai.pattrens.twopointers;

import java.util.Arrays;

/*
    https://leetcode.com/problems/sort-colors/
    https://leetcode.com/problems/sort-colors/discuss/26549/Java-solution-both-2-pass-and-1-pass
*/
public class sortColors {

    public static int[] optimalSolution(int nums[]) {

        int countZero = 0, countOne = 0, countTwo = 0;

        // Count the occurrences of each number (0, 1, 2) in the array
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                countZero++;
            } else if (nums[i] == 1) {
                countOne++;
            } else {
                countTwo++;
            }
        }

        // Modify the array to sort the numbers in non-decreasing order
        for (int i = 0; i < nums.length; i++) {

            if (i < countZero) {
                nums[i] = 0; // Fill with zeros
            } else if (i < countZero + countOne) {
                nums[i] = 1; // Fill with ones
            } else {
                nums[i] = 2; // Fill with twos
            }
        }

        System.out.println(Arrays.toString(nums));

        return nums;
        /*
                Time Complexity: O(n)
                Space Complexity: O(1)
         */
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 2};

        optimalSolution(nums);
    }
}
