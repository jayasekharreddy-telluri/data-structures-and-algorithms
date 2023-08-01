package slidingwindow;
import org.com.jai.pattrens.slidingwindow.NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold;
import org.junit.Assert;
import org.junit.Test;

public class NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThresholdTest {

    @Test
    public void testOptimalSolution_ValidCase() {
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3;
        int threshold = 4;
        int expectedCount = 3;
        int actualCount = NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold.optimalSolution(arr, k, threshold);
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolution_EmptyArray() {
        int[] arr = {};
        int k = 2;
        int threshold = 3;
        int expectedCount = 0; // Empty array, no subarrays to process
        int actualCount = NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold.optimalSolution(arr, k, threshold);
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolution_NullArray() {
        int[] arr = null;
        int k = 4;
        int threshold = 2;
        int expectedCount = 0; // Null array, no subarrays to process
        int actualCount = NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold.optimalSolution(arr, k, threshold);
        Assert.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolution_ThresholdEqualAverage() {
        int[] arr = {1, 1, 1, 1};
        int k = 3;
        int threshold = 1;
        int expectedCount = 2; // Subarrays: [1, 1, 1], [1, 1, 1]
        int actualCount = NumberOfSubarraysOfSizeKAndAverageGreaterThanOrEqualToThreshold.optimalSolution(arr, k, threshold);
        Assert.assertEquals(expectedCount, actualCount);
    }
}
