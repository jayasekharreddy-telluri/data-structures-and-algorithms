import org.com.jai.pattrens.twopointers.sortColors;
import org.junit.Assert;
import org.junit.Test;

public class SortColorsTest {

    @Test
    public void testOptimalSolution() {
        int[] nums = {1, 1, 0, 0, 2};
        int[] expected = {0, 0, 1, 1, 2};
        Assert.assertArrayEquals(expected, sortColors.optimalSolution(nums));
    }

    @Test
    public void testOptimalSolutionWithEmptyArray() {
        int[] nums = {};
        int[] expected = {};
        Assert.assertArrayEquals(expected, sortColors.optimalSolution(nums));
    }

    @Test
    public void testOptimalSolutionWithSingleElement() {
        int[] nums = {1};
        int[] expected = {1};
        Assert.assertArrayEquals(expected, sortColors.optimalSolution(nums));
    }

    @Test
    public void testOptimalSolutionWithAlreadySortedArray() {
        int[] nums = {0, 0, 1, 1, 2, 2};
        int[] expected = {0, 0, 1, 1, 2, 2};
        Assert.assertArrayEquals(expected, sortColors.optimalSolution(nums));
    }

    @Test
    public void testOptimalSolutionWithAllZeros() {
        int[] nums = {0, 0, 0, 0};
        int[] expected = {0, 0, 0, 0};
        Assert.assertArrayEquals(expected, sortColors.optimalSolution(nums));
    }

    @Test
    public void testOptimalSolutionWithAllOnes() {
        int[] nums = {1, 1, 1, 1};
        int[] expected = {1, 1, 1, 1};
        Assert.assertArrayEquals(expected, sortColors.optimalSolution(nums));
    }

    @Test
    public void testOptimalSolutionWithAllTwos() {
        int[] nums = {2, 2, 2, 2};
        int[] expected = {2, 2, 2, 2};
        Assert.assertArrayEquals(expected, sortColors.optimalSolution(nums));
    }
}
