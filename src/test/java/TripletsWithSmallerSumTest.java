import org.com.jai.pattrens.twopointers.TripletsWithSmallerSum;
import org.junit.Assert;
import org.junit.Test;

public class TripletsWithSmallerSumTest {

    @Test
    public void testOptimalSolution_ExampleCase1() {
        int[] nums = {-1, 4, 2, 1, 3};
        int target = 5;
        int expected = 4;
        Assert.assertEquals(expected, TripletsWithSmallerSum.optimalSolution(nums, target));
    }

    @Test
    public void testOptimalSolution_AllElementsSmallerThanTarget() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 10;
        int expected = 6; // All combinations are smaller than the target (6 combinations: (1, 2, 3), (1, 2, 4), (1, 2, 5), (1, 3, 4), (1, 3, 5), (2, 3, 4))
        Assert.assertEquals(expected, TripletsWithSmallerSum.optimalSolution(nums, target));
    }

    @Test
    public void testOptimalSolution_AllElementsLargerThanTarget() {
        int[] nums = {5, 6, 7, 8, 9};
        int target = 2;
        int expected = 0; // No combination is smaller than the target
        Assert.assertEquals(expected, TripletsWithSmallerSum.optimalSolution(nums, target));
    }

    @Test
    public void testOptimalSolution_SingleElementArray() {
        int[] nums = {1};
        int target = 5;
        int expected = 0; // Single-element array does not have triplets
        Assert.assertEquals(expected, TripletsWithSmallerSum.optimalSolution(nums, target));
    }

    @Test
    public void testOptimalSolution_EmptyArray() {
        int[] nums = {};
        int target = 5;
        int expected = 0; // Empty array does not have triplets
        Assert.assertEquals(expected, TripletsWithSmallerSum.optimalSolution(nums, target));
    }
}
