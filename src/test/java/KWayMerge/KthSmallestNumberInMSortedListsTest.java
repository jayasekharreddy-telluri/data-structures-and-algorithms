package KWayMerge;

import com.KWayMerge.KthSmallestNumberInMSortedLists;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class KthSmallestNumberInMSortedListsTest {

    @Test
    public void testFindKthSmallestNumberInMSortedLists() {
        // Test case: Merge three sorted lists
        Integer[] l1 = new Integer[]{2, 6, 8};
        Integer[] l2 = new Integer[]{3, 6, 7};
        Integer[] l3 = new Integer[]{1, 3, 4};

        List<Integer[]> lists = new ArrayList<>();
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);

        assertEquals(3, KthSmallestNumberInMSortedLists.findKthSmallestNumberInMSortedLists(lists, 3));
        assertEquals(6, KthSmallestNumberInMSortedLists.findKthSmallestNumberInMSortedLists(lists, 5));

        // Test case: Edge case - Empty lists
        List<Integer[]> emptyLists = new ArrayList<>();
        assertEquals(0, KthSmallestNumberInMSortedLists.findKthSmallestNumberInMSortedLists(emptyLists, 5));

        // Test case: Edge case - Null lists
        assertEquals(0, KthSmallestNumberInMSortedLists.findKthSmallestNumberInMSortedLists(null, 5));

        // Test case: Edge case - k is 1
        assertEquals(1, KthSmallestNumberInMSortedLists.findKthSmallestNumberInMSortedLists(lists, 1));

        // Test case: Edge case - k is greater than the total elements in lists
        Integer[] l4 = new Integer[]{1, 2, 3};
        Integer[] l5 = new Integer[]{4, 5, 6};
        lists.add(l4);
        lists.add(l5);

        // In this case, k is greater than the total number of elements in the lists
        // So, the result should be the largest element in the merged lists
        assertEquals(6, KthSmallestNumberInMSortedLists.findKthSmallestNumberInMSortedLists(lists, 20));
    }
}
