package slidingwindow;

import org.com.jai.pattrens.slidingwindow.LongestSubarrayOf1sAfterDeletingOneElement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LongestSubarrayOf1sAfterDeletingOneElementTest {

    @Test
    public void testOptimalSolutionWithOneZero() {
        int[] nums = {1, 0, 1, 1, 1};
        int expectedCount = 4; // Longest subarray of 1s after deleting one element: [1, 1, 1, 1]
        int actualCount = LongestSubarrayOf1sAfterDeletingOneElement.optimalSolution(nums);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolutionWithMultipleZeros() {
        int[] nums = {1, 0, 1, 0, 1};
        int expectedCount = 3; // Longest subarray of 1s after deleting one element: [1, 0, 1] or [0, 1, 0]
        int actualCount = LongestSubarrayOf1sAfterDeletingOneElement.optimalSolution(nums);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolutionWithAllOnes() {
        int[] nums = {1, 1, 1, 1, 1};
        int expectedCount = 4; // No zero to delete, so the result is the length of the array - 1.
        int actualCount = LongestSubarrayOf1sAfterDeletingOneElement.optimalSolution(nums);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolutionWithAllZeros() {
        int[] nums = {0, 0, 0, 0, 0};
        int expectedCount = 0; // No 1s in the array, so the result is 0.
        int actualCount = LongestSubarrayOf1sAfterDeletingOneElement.optimalSolution(nums);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolutionWithEmptyArray() {
        int[] nums = {};
        int expectedCount = 0; // An empty array has no subarray.
        int actualCount = LongestSubarrayOf1sAfterDeletingOneElement.optimalSolution(nums);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
