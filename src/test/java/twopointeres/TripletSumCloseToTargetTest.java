package twopointeres;

import org.com.jai.pattrens.twopointers.TripletSumCloseToTarget;
import org.junit.Assert;
import org.junit.Test;

public class TripletSumCloseToTargetTest {

    @Test
    public void testOptimalSolution_ExampleCase1() {
        int[] nums = {-1, 2, 1, -4};
        int target = 1;
        int expected = 2;
        Assert.assertEquals(expected, TripletSumCloseToTarget.optimalSolution(nums, target));
    }

    @Test
    public void testOptimalSolution_ExampleCase2() {
        int[] nums = {0, 0, 0};
        int target = 1;
        int expected = 0;
        Assert.assertEquals(expected, TripletSumCloseToTarget.optimalSolution(nums, target));
    }

    @Test
    public void testOptimalSolution_PositiveNumbers() {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 7;
        int expected = 6;
        Assert.assertEquals(expected, TripletSumCloseToTarget.optimalSolution(nums, target));
    }

    @Test
    public void testOptimalSolution_NegativeNumbers() {
        int[] nums = {-5, -4, -3, -2, -1};
        int target = -9;
        int expected = -9;
        Assert.assertEquals(expected, TripletSumCloseToTarget.optimalSolution(nums, target));
    }

    @Test
    public void testOptimalSolution_MixedNumbers() {
        int[] nums = {-1, 0, 1, 2, 3};
        int target = 1;
        int expected = 1;
        Assert.assertEquals(expected, TripletSumCloseToTarget.optimalSolution(nums, target));
    }

    @Test
    public void testOptimalSolution_DuplicateNumbers() {
        int[] nums = {1, 1, 1, 1};
        int target = 3;
        int expected = 3;
        Assert.assertEquals(expected, TripletSumCloseToTarget.optimalSolution(nums, target));
    }

    @Test
    public void testOptimalSolution_SingleElementArray() {
        int[] nums = {5};
        int target = 5;
        int expected = 5;
        Assert.assertEquals(expected, TripletSumCloseToTarget.optimalSolution(nums, target));
    }

    @Test
    public void testOptimalSolution_EmptyArray() {
        int[] nums = {};
        int target = 0;
        int expected = 0;
        Assert.assertEquals(expected, TripletSumCloseToTarget.optimalSolution(nums, target));
    }
}

