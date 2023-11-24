package org.com.jai.pattrens.dp;

public class LongestIncreasingSubsequence {

    public static int findLongestIncreasingSubsequence(int[] nums) {

        int[] lis = new int[nums.length];

        for (int i = 0; i < lis.length; i++) {

            lis[i] = 1;
        }

        int maxLisLength = 1;

        for (int i = 1; i < lis.length; i++) {

            for (int j = 0; j < i; j++) {

                if (nums[i] > nums[j] && lis[j] + 1 > lis[i]) {

                    lis[i] = lis[j] + 1;

                    maxLisLength = Math.max(maxLisLength, lis[i]);
                }
            }
        }

        return maxLisLength;

    }

    public static void main(String[] args) {

        int[] nums = {7, 1, 4, 8, 11, 2, 14, 3 };

        System.out.println(findLongestIncreasingSubsequence(nums));

    }
}
