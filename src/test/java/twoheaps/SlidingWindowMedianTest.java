package twoheaps;

import com.twoheaps.SlidingWindowMedian;
import org.junit.jupiter.api.Test;

public class SlidingWindowMedianTest {

    @Test
    public void testSlidingWindowMedianWithKEqualToOne() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 1;
        Double[] expected = {1.0, 2.0, 3.0, 4.0, 5.0};
        assertArrayEquals(expected, SlidingWindowMedian.findSlidingWindowMedian(nums, k));
    }

    @Test
    public void testSlidingWindowMedianWithKEqualToArrayLength() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 5;
        Double[] expected = {3.0};
        assertArrayEquals(expected, SlidingWindowMedian.findSlidingWindowMedian(nums, k));
    }

    @Test
    public void testSlidingWindowMedianWithKGreaterThanArrayLength() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 6;
        Double[] expected = {};
        assertArrayEquals(expected, SlidingWindowMedian.findSlidingWindowMedian(nums, k));
    }

    @Test
    public void testSlidingWindowMedianWithNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        int k = 3;
        Double[] expected = {-2.0, -3.0, -4.0, -5.0};
        assertArrayEquals(expected, SlidingWindowMedian.findSlidingWindowMedian(nums, k));
    }

    @Test
    public void testSlidingWindowMedianWithDuplicatedNumbers() {
        int[] nums = {2, 2, 2, 2, 2};
        int k = 3;
        Double[] expected = {2.0, 2.0, 2.0, 2.0};
        assertArrayEquals(expected, SlidingWindowMedian.findSlidingWindowMedian(nums, k));
    }
}
