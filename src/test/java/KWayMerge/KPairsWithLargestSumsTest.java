package KWayMerge;

import org.com.jai.pattrens.KWayMerge.KPairsWithLargestSums;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class KPairsWithLargestSumsTest {

    @Test
    public void testLargestKPairs() {
        int[] nums1 = new int[]{9, 8, 2};
        int[] nums2 = new int[]{6, 3, 1};

        List<int[]> result1 = KPairsWithLargestSums.findKPairsWithLargestSums(nums1, nums2, 2);
        int[][] expected1 = {{9, 6}, {8, 6}};
        assertArrayEquals(expected1, convertListToArray(result1));

        List<int[]> result2 = KPairsWithLargestSums.findKPairsWithLargestSums(nums1, nums2, 3);
        int[][] expected2 = {{9, 6}, {8, 6}, {9, 3}};
        assertArrayEquals(expected2, convertListToArray(result2));
    }

    @Test
    public void testEmptyArrays() {
        int[] empty1 = new int[]{};
        int[] empty2 = new int[]{};

        List<int[]> result = KPairsWithLargestSums.findKPairsWithLargestSums(empty1, empty2, 3);
        int[][] expected = {};
        assertArrayEquals(expected, convertListToArray(result));
    }

    @Test
    public void testSingleElementArrays() {
        int[] single1 = new int[]{5};
        int[] single2 = new int[]{2};

        List<int[]> result = KPairsWithLargestSums.findKPairsWithLargestSums(single1, single2, 1);
        int[][] expected = {{5, 2}};
        assertArrayEquals(expected, convertListToArray(result));
    }

    @Test
    public void testNegativeElements() {
        int[] negative1 = new int[]{-5, -7, -3};
        int[] negative2 = new int[]{-10, -4};

        List<int[]> result = KPairsWithLargestSums.findKPairsWithLargestSums(negative1, negative2, 3);
        int[][] expected = {{-5, -10}, {-7, -10}, {-3, -10}};
        assertArrayEquals(expected, convertListToArray(result));
    }

    private int[][] convertListToArray(List<int[]> list) {
        int[][] result = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}
