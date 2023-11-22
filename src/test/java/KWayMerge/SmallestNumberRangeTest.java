package KWayMerge;

import org.com.jai.pattrens.KWayMerge.SmallestNumberRange;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;

public class SmallestNumberRangeTest {

    @Test
    public void testSmallestNumberRange() {
        Integer[] L1 = new Integer[]{1, 5, 8};
        Integer[] L2 = new Integer[]{4, 12};
        Integer[] L3 = new Integer[]{7, 8, 10};

        List<Integer[]> lists = new ArrayList<>();
        lists.add(L1);
        lists.add(L2);
        lists.add(L3);

        int[] expectedRange = {4, 7};
        assertArrayEquals(expectedRange, SmallestNumberRange.findSmallestNumberRange(lists));
    }

    @Test
    public void testEmptyList() {
        List<Integer[]> emptyList = new ArrayList<>();
        int[] expectedRange = {0, Integer.MAX_VALUE}; // Empty list, hence range should be the default max range
        assertArrayEquals(expectedRange, SmallestNumberRange.findSmallestNumberRange(emptyList));
    }

    @Test
    public void testSingleElementLists() {
        Integer[] L1 = new Integer[]{5};
        Integer[] L2 = new Integer[]{3};
        Integer[] L3 = new Integer[]{8};

        List<Integer[]> lists = new ArrayList<>();
        lists.add(L1);
        lists.add(L2);
        lists.add(L3);

        int[] expectedRange = {3, 5}; // Smallest range should be between 3 and 5
        assertArrayEquals(expectedRange, SmallestNumberRange.findSmallestNumberRange(lists));
    }

    @Test
    public void testNullLists() {
        List<Integer[]> nullLists = new ArrayList<>();
        nullLists.add(null);
        nullLists.add(null);

        int[] expectedRange = {0, Integer.MAX_VALUE}; // Null lists, hence range should be the default max range
        assertArrayEquals(expectedRange, SmallestNumberRange.findSmallestNumberRange(nullLists));
    }

    @Test
    public void testNegativeValues() {
        Integer[] L1 = new Integer[]{-10, -5, 0};
        Integer[] L2 = new Integer[]{-8, -4};
        Integer[] L3 = new Integer[]{-7, -5, -3};

        List<Integer[]> lists = new ArrayList<>();
        lists.add(L1);
        lists.add(L2);
        lists.add(L3);

        int[] expectedRange = {-8, -7}; // Smallest range should be between -8 and -7
        assertArrayEquals(expectedRange, SmallestNumberRange.findSmallestNumberRange(lists));
    }
}
