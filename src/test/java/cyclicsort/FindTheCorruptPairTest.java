package cyclicsort;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.com.jai.pattrens.cyclicsort.FindTheCorruptPair;
import org.junit.jupiter.api.Test;

public class FindTheCorruptPairTest {

    @Test
    public void testFindNumbers_ValidInput() {
        int[] nums = {3, 1, 2, 3, 6, 4};
        int[] expected = {3, 5};
        assertArrayEquals(expected, FindTheCorruptPair.findNumbers(nums));
    }

    @Test
    public void testFindNumbers_NoCorruption() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {-1, -1};
        assertArrayEquals(expected, FindTheCorruptPair.findNumbers(nums));
    }

    @Test
    public void testFindNumbers_NullInput() {
        int[] nums = null;
        int[] expected = {-1, -1};
        assertArrayEquals(expected, FindTheCorruptPair.findNumbers(nums));
    }

    @Test
    public void testFindNumbers_EmptyArray() {
        int[] nums = {};
        int[] expected = {-1, -1}; // Empty array, expect {-1, -1}
        assertArrayEquals(expected, FindTheCorruptPair.findNumbers(nums));
    }

}
