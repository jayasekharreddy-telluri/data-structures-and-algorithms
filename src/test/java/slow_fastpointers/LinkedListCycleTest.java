package slow_fastpointers;

import org.com.jai.pattrens.slow_fastpointers.LinkedListCycle;
import org.com.jai.pattrens.slow_fastpointers.ListNode;
import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListCycleTest {

    @Test
    public void testNoCycle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        assertFalse(LinkedListCycle.hasCycle(head));
    }

    @Test
    public void testCycleExists() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        // Creating a cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next;

        assertTrue(LinkedListCycle.hasCycle(head));
    }

    @Test
    public void testSingleNodeNoCycle() {
        ListNode head = new ListNode(1);

        assertFalse(LinkedListCycle.hasCycle(head));
    }

    @Test
    public void testSingleNodeCycle() {
        ListNode head = new ListNode(1);
        head.next = head; // Creating a cycle with a single node

        assertTrue(LinkedListCycle.hasCycle(head));
    }

    @Test
    public void testTwoNodesNoCycle() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        assertFalse(LinkedListCycle.hasCycle(head));
    }

    @Test
    public void testTwoNodesCycle() {
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node2;

        // Creating a cycle: 2 -> 1
        node2.next = head;

        assertTrue(LinkedListCycle.hasCycle(head));
    }

    @Test
    public void testNullInput() {
        assertFalse(LinkedListCycle.hasCycle(null));
    }
}
