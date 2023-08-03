package slidingwindow;


import org.com.jai.pattrens.slidingwindow.CountCompleteSubarraysInAnArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountCompleteSubarraysInAnArrayTest {

    @Test
    public void testOptimalSolutionWithDistinctElements() {
        int[] nums = {1, 2, 3, 4, 5};
        int expectedCount = 5; // All individual elements are complete subarrays.
        int actualCount = CountCompleteSubarraysInAnArray.optimalSolution(nums);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolutionWithDuplicateElements() {
        int[] nums = {1, 2, 2, 3, 1};
        int expectedCount = 9; // Complete subarrays: [1], [2], [2], [3], [1,2], [2,2], [2,3], [3,1], [1,2,2]
        int actualCount = CountCompleteSubarraysInAnArray.optimalSolution(nums);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolutionWithAllSameElements() {
        int[] nums = {5, 5, 5, 5};
        int expectedCount = 10; // Complete subarrays: [5], [5], [5], [5], [5,5], [5,5], [5,5], [5,5], [5,5,5], [5,5,5,5]
        int actualCount = CountCompleteSubarraysInAnArray.optimalSolution(nums);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolutionWithEmptyArray() {
        int[] nums = {};
        int expectedCount = 0; // An empty array has no subarrays.
        int actualCount = CountCompleteSubarraysInAnArray.optimalSolution(nums);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolutionWithSingleElement() {
        int[] nums = {10};
        int expectedCount = 1; // Single element itself is a complete subarray.
        int actualCount = CountCompleteSubarraysInAnArray.optimalSolution(nums);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
