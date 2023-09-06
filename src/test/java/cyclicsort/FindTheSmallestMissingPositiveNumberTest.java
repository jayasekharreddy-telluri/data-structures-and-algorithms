package cyclicsort;

import org.com.jai.pattrens.cyclicsort.FindTheSmallestMissingPositiveNumber;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FindTheSmallestMissingPositiveNumberTest {

    @Test
    public void testPositiveValues() {
        int[] nums = {3, 1, 5, 4, 2};
        int result = FindTheSmallestMissingPositiveNumber.findTheSmallestMissingPositiveNumber(nums);
        assertEquals(6, result);
    }

    @Test
    public void testNegativeValues() {
        int[] nums = {-3, -1, -5, -4, -2};
        int result = FindTheSmallestMissingPositiveNumber.findTheSmallestMissingPositiveNumber(nums);
        assertEquals(1, result);
    }

    @Test
    public void testMixedValues() {
        int[] nums = {-3, 1, 5, -4, 2};
        int result = FindTheSmallestMissingPositiveNumber.findTheSmallestMissingPositiveNumber(nums);
        assertEquals(3, result);
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int result = FindTheSmallestMissingPositiveNumber.findTheSmallestMissingPositiveNumber(nums);
        assertEquals(1, result);
    }

    @Test
    public void testNullArray() {
        int[] nums = null;
        int result = FindTheSmallestMissingPositiveNumber.findTheSmallestMissingPositiveNumber(nums);
        assertEquals(-1, result);
    }

    @Test
    public void testArrayWithDuplicates() {
        int[] nums = {3, 1, 5, 4, 2, 3, 4, 1};
        int result = FindTheSmallestMissingPositiveNumber.findTheSmallestMissingPositiveNumber(nums);
        assertEquals(6, result);
    }

    @Test
    public void testArrayWithMaxValue() {
        int[] nums = {1, 2, 3, Integer.MAX_VALUE};
        int result = FindTheSmallestMissingPositiveNumber.findTheSmallestMissingPositiveNumber(nums);
        assertEquals(4, result);
    }
}
