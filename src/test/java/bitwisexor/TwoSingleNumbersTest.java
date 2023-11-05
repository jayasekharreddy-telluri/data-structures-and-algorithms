package bitwisexor;

import org.com.jai.pattrens.bitwisexor.TwoSingleNumbers;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TwoSingleNumbersTest {

    @Test
    public void testFindSingleNumbers_NormalCase() {
        int[] nums = {1, 4, 2, 1, 3, 5, 6, 2, 3, 5};
        int[] expected = {4, 6};
        assertArrayEquals(expected, TwoSingleNumbers.findSingleNumbers(nums));
    }

    @Test
    public void testFindSingleNumbers_NegativeNumbers() {
        int[] nums = {1, -4, 2, 1, 3, 5, -4, 2, 3, 5};
        int[] expected = {3, -3};
        assertArrayEquals(expected, TwoSingleNumbers.findSingleNumbers(nums));
    }

    @Test
    public void testFindSingleNumbers_SingleElementArray() {
        int[] nums = {8};
        int[] expected = {8, 0};
        assertArrayEquals(expected, TwoSingleNumbers.findSingleNumbers(nums));
    }

    @Test
    public void testFindSingleNumbers_AllNegativeNumbers() {
        int[] nums = {-2, -4, -3, -4, -2, -3};
        int[] expected = {0, -7};
        assertArrayEquals(expected, TwoSingleNumbers.findSingleNumbers(nums));
    }

    @Test
    public void testFindSingleNumbers_EmptyArray() {
        int[] nums = {};
        int[] expected = {0, 0};
        assertArrayEquals(expected, TwoSingleNumbers.findSingleNumbers(nums));
    }

    @Test
    public void testFindSingleNumbers_LargeInput() {
        int[] nums = {1000000, 2000000, 3000000, 2000000, 1000000};
        int[] expected = {3000000, 0};
        assertArrayEquals(expected, TwoSingleNumbers.findSingleNumbers(nums));
    }
}
