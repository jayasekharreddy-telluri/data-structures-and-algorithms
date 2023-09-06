package org.com.jai.pattrens.cyclicsort;

public class FindTheSmallestMissingPositiveNumber {

    public static int findTheSmallestMissingPositiveNumber(int[] nums) {
        // Check if the input array is null, return -1 in that case
        if (nums == null) {
            return -1;
        }

        int i = 0;

        // The main idea of this algorithm is to place each positive integer
        // at its correct position in the array (i.e., nums[i] == i + 1).
        while (i < nums.length) {
            if (nums[i] <= nums.length && nums[i] > 0 && nums[i] != nums[nums[i] - 1]) {
                // Swap nums[i] with nums[nums[i] - 1] to put it at the correct position
                swap(nums, i, nums[i] - 1);
            } else {
                i++;
            }
        }

        // Iterate through the array to find the first element that is not in the correct position
        for (int k = 0; k < nums.length; k++) {
            if (nums[k] != k + 1) {
                // The missing positive integer is k + 1
                return k + 1;
            }
        }

        // If all positive integers from 1 to nums.length are in the array,
        // return the next positive integer, which is nums.length + 1
        return nums.length + 1;

        /*
                time complexity is O(n).
                space complexity is O(1),
         */
    }

    private static void swap(int[] nums, int i, int j) {
        // Swap two elements in the array
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
        int[] nums = {-3, 1, 5, 4, 2};
        System.out.println(findTheSmallestMissingPositiveNumber(nums));
    }
}
