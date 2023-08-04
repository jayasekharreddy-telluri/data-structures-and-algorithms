package org.com.jai.pattrens.slidingwindow;

/*
        https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/
        https://leetcode.com/problems/longest-subarray-of-1s-after-deleting-one-element/discuss/3719568/Beat's-100-oror-C%2B%2B-oror-JAVA-oror-PYTHON-oror-Beginner-Friendly
 */
public class LongestSubarrayOf1sAfterDeletingOneElement {

    public static int optimalSolution(int[] nums) {

        int n = nums.length;

        int windowStart = 0;
        int windowEnd = 0;
        int count = 0;
        int countOfZeros = 0;

        while (windowEnd < n) {

            // Count the number of zeros encountered in the current window.
            if (nums[windowEnd] == 0) {
                countOfZeros++;
            }

            // Shrink the window from the left until there is only one zero in the window.
            while (countOfZeros > 1) {
                if (nums[windowStart] == 0) {
                    countOfZeros--;
                }
                windowStart++;
            }

            // Update the count with the maximum length of the subarray found so far.
            count = Math.max(count, windowEnd - windowStart + 1 - countOfZeros);

            // Move the window's end pointer to the right.
            windowEnd++;
        }

        // If the entire array is composed of 1s, return count - 1, else return count.
        return (count == n) ? count - 1 : count;

        /*
                time complexity : O(n)

                space complexity : O(1)
         */
    }

    public static void main(String[] args) {

        int[] nums = {1, 1, 1};
        int result = optimalSolution(nums);
        System.out.println(result);
    }
}
