package org.com.jai.pattrens.slidingwindow;


/*
        https://leetcode.com/problems/count-complete-subarrays-in-an-array/
        https://leetcode.com/problems/count-complete-subarrays-in-an-array/discuss/3839312/100-Sliding-Window-VIDEO-Counting-Complete-Subarrays-Good-Approach
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CountCompleteSubarraysInAnArray {

    public static int optimalSolution(int[] nums) {
        int n = nums.length;

        // Edge case: If the array is empty, there are no subarrays.
        if (n == 0) {
            return 0;
        }

        // Use a set to count the number of distinct elements in the array.
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Number of distinct elements in the array.
        int distinct_elements = set.size();

        int count = 0;
        int windowStart = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int windowEnd = 0; windowEnd < n; windowEnd++) {

            // Extend the current window to include the element at windowEnd.
            map.put(nums[windowEnd], map.getOrDefault(nums[windowEnd], 0) + 1);

            // Shrink the window from the left until the window contains all distinct elements.
            while (map.size() == distinct_elements) {

                // Count the number of complete subarrays and update the count.
                count = count + n - windowEnd;

                // Move the window's start pointer to the right and adjust the map accordingly.
                map.put(nums[windowStart], map.get(nums[windowStart]) - 1);
                if (map.get(nums[windowStart]) == 0) {
                    map.remove(nums[windowStart]);
                }
                windowStart++;
            }
        }

        // The 'count' variable holds the total number of complete subarrays.
        return count;
    }

    public static void main(String[] args) {
        int[] nums = {5, 5, 5, 5};

        int result = optimalSolution(nums);
        System.out.println("Total complete subarrays: " + result);
    }
}
