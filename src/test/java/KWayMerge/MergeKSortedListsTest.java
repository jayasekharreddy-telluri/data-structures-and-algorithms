package KWayMerge;

import org.com.jai.pattrens.KWayMerge.ListNode;
import org.com.jai.pattrens.KWayMerge.MergeKSortedLists;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MergeKSortedListsTest {

    @Test
    public void testMergeKSortedLists() {
        // Test case: Merge three sorted lists
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(6);
        l1.next.next = new ListNode(8);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);

        ListNode l3 = new ListNode(1);
        l3.next = new ListNode(3);
        l3.next.next = new ListNode(4);

        ListNode result = MergeKSortedLists.merge(new ListNode[]{l1, l2, l3});

        int[] expected = {1, 2, 3, 3, 4, 6, 6, 7, 8};
        for (int value : expected) {
            assertEquals(value, result.value);
            result = result.next;
        }

        // Test case: Edge case - Empty lists array
        ListNode[] emptyLists = new ListNode[]{};
        assertNull(MergeKSortedLists.merge(emptyLists));

        // Test case: Edge case - Null lists array
        assertNull(MergeKSortedLists.merge(null));

        // Test case: Edge case - Lists array with null elements
        ListNode[] listsWithNulls = new ListNode[]{null, null};
        assertNull(MergeKSortedLists.merge(listsWithNulls));
    }
}
