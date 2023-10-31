package binarysearch;

import org.com.jai.pattrens.binarysearch.NumberRange;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class NumberRangeTest {

    @Test
    public void testKeyRangeFoundInArray() {
        int[] nums = {4, 6, 6, 6, 9};
        int key = 6;
        int[] expected = {1, 3};
        assertArrayEquals(expected, NumberRange.findRange(nums, key));
    }

    @Test
    public void testKeyRangeNotFoundInArray() {
        int[] nums = {1, 2, 3, 4, 5};
        int key = 6;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, NumberRange.findRange(nums, key));
    }

    @Test
    public void testKeyRangeFoundAtStartAndEnd() {
        int[] nums = {3, 3, 3, 3, 3};
        int key = 3;
        int[] expected = {0, 4};
        assertArrayEquals(expected, NumberRange.findRange(nums, key));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int key = 5;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, NumberRange.findRange(nums, key));
    }

    @Test
    public void testKeyRangeFoundInLargeArray() {
        int[] nums = {1, 2, 3, 4, 5, 5, 5, 5, 5, 5, 5};
        int key = 5;
        int[] expected = {4, 9};
        assertArrayEquals(expected, NumberRange.findRange(nums, key));
    }
}
