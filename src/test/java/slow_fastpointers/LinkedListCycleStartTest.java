package slow_fastpointers;

import org.com.jai.pattrens.slow_fastpointers.LinkedListCycleStart;
import org.com.jai.pattrens.slow_fastpointers.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class LinkedListCycleStartTest {

    @Test
    public void testCycleStartAtFirstNode() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        // Creating a cycle starting at the first node (1 -> 2 -> 3 -> 1)
        head.next.next.next = head;

        assertEquals(1, LinkedListCycleStart.findCycle(head).value);
    }

    @Test
    public void testSingleNodeNoCycle() {
        ListNode head = new ListNode(1);

        assertNull(LinkedListCycleStart.findCycle(head));
    }

    @Test
    public void testSingleNodeCycle() {
        ListNode head = new ListNode(1);
        head.next = head; // Creating a cycle with a single node

        assertEquals(1, LinkedListCycleStart.findCycle(head).value);
    }

    @Test
    public void testTwoNodesNoCycle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        assertNull(LinkedListCycleStart.findCycle(head));
    }

    @Test
    public void testTwoNodesCycle() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node2;

        // Creating a cycle: 2 -> 1
        node2.next = head;

        assertEquals(1, LinkedListCycleStart.findCycle(head).value);
    }

    @Test
    public void testNullInput() {
        assertNull(LinkedListCycleStart.findCycle(null));
    }
}
