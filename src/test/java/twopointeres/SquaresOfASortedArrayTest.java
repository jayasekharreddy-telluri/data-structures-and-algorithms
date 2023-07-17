package twopointeres;

import org.com.jai.pattrens.twopointers.SquaresOfASortedArray;
import org.junit.Assert;
import org.junit.Test;

public class SquaresOfASortedArrayTest {

    @Test
    public void testBruteForceSolution() {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] expected = {0, 1, 9, 16, 100};
        int[] result = SquaresOfASortedArray.bruteForceSolution(nums);
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void testOptimalSolution() {
        int[] nums = {0};
        int[] expected = {0};
        int[] result = SquaresOfASortedArray.optimalSolution(nums);
        Assert.assertArrayEquals(expected, result);
    }
}
