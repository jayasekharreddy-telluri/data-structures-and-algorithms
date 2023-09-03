package cyclicsort;

import static org.junit.jupiter.api.Assertions.*;

import org.com.jai.pattrens.cyclicsort.CyclicSort;
import org.junit.jupiter.api.Test;

public class CyclicSortTest {

    @Test
    public void testSortBasic() {
        int[] nums = {3, 1, 5, 4, 2};
        int[] expected = {1, 2, 3, 4, 5};
        CyclicSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testSortEmptyArray() {
        int[] nums = {};
        int[] expected = {};
        CyclicSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testSortSingleElementArray() {
        int[] nums = {1};
        int[] expected = {1};
        CyclicSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testSortDescendingOrder() {
        int[] nums = {5, 4, 3, 2, 1};
        int[] expected = {1, 2, 3, 4, 5};
        CyclicSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testSortAlreadySorted() {
        int[] nums = {1, 2, 3, 4, 5};
        int[] expected = {1, 2, 3, 4, 5};
        CyclicSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

    @Test
    public void testSortNegativeValues() {
        int[] nums = {-3, -1, -5, -4, -2};
        int[] expected = {-5, -4, -3, -2, -1};
        CyclicSort.sort(nums);
        assertArrayEquals(expected, nums);
    }

}
