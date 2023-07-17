package twopointeres;

import org.com.jai.pattrens.twopointers.TripletSumToZero;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TripletSumToZeroTest {
    @Test
    public void testOptimalSolution_ExampleCase1() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, 2,-1),
                Arrays.asList(-1, 1,0)
        );
        Assert.assertEquals(expected, TripletSumToZero.optimalSolution(nums));
    }

    @Test
    public void testOptimalSolution_ExampleCase2() {
        int[] nums = {0, 0, 0, 0};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(0, 0, 0)
        );
        Assert.assertEquals(expected, TripletSumToZero.optimalSolution(nums));
    }

    @Test
    public void testOptimalSolution_NoTriplets() {
        int[] nums = {1, 2, 3, 4, 5};
        List<List<Integer>> expected = Arrays.asList();
        Assert.assertEquals(expected, TripletSumToZero.optimalSolution(nums));
    }

    @Test
    public void testOptimalSolution_Duplicates() {
        int[] nums = {-2, -2, -1, -1, 0, 1, 2, 2};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-2, -2, 4),
                Arrays.asList(-2, -1, 3),
                Arrays.asList(-2, 0, 2),
                Arrays.asList(-2, 1, 1)
        );
        Assert.assertEquals(expected, TripletSumToZero.optimalSolution(nums));
    }

    @Test
    public void testOptimalSolution_MixedNumbers() {
        int[] nums = {-1, 1, 0, -1, 1, 0};
        List<List<Integer>> expected = Arrays.asList(
                Arrays.asList(-1, 1, 0)
        );
        Assert.assertEquals(expected, TripletSumToZero.optimalSolution(nums));
    }

    @Test
    public void testOptimalSolution_EmptyArray() {
        int[] nums = {};
        List<List<Integer>> expected = Arrays.asList();
        Assert.assertEquals(expected, TripletSumToZero.optimalSolution(nums));
    }

    @Test
    public void testOptimalSolution_SingleElementArray() {
        int[] nums = {1};
        List<List<Integer>> expected = Arrays.asList();
        Assert.assertEquals(expected, TripletSumToZero.optimalSolution(nums));
    }

}

