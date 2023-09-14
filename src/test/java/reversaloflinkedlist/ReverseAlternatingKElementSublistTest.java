package reversaloflinkedlist;
import static org.junit.jupiter.api.Assertions.*;

import org.com.jai.pattrens.reversaloflinkedlist.ReverseAlternatingKElementSublist;
import org.junit.jupiter.api.Test;

public class ReverseAlternatingKElementSublistTest {

    @Test
    public void testReverseWithKEqualToOne() {
        ReverseAlternatingKElementSublist.ListNode head = new ReverseAlternatingKElementSublist.ListNode(1);
        head.next = new ReverseAlternatingKElementSublist.ListNode(2);
        head.next.next = new ReverseAlternatingKElementSublist.ListNode(3);
        head.next.next.next = new ReverseAlternatingKElementSublist.ListNode(4);

        ReverseAlternatingKElementSublist.ListNode result = ReverseAlternatingKElementSublist.reverse(head, 1);

        // Verify the reversed LinkedList
        assertEquals(1, result.value);
        assertEquals(2, result.next.value);
        assertEquals(3, result.next.next.value);
        assertEquals(4, result.next.next.next.value);
        assertNull(result.next.next.next.next);
    }

    @Test
    public void testReverseWithKEqualToTwo() {
        ReverseAlternatingKElementSublist.ListNode head = new ReverseAlternatingKElementSublist.ListNode(1);
        head.next = new ReverseAlternatingKElementSublist.ListNode(2);
        head.next.next = new ReverseAlternatingKElementSublist.ListNode(3);
        head.next.next.next = new ReverseAlternatingKElementSublist.ListNode(4);
        head.next.next.next.next = new ReverseAlternatingKElementSublist.ListNode(5);

        ReverseAlternatingKElementSublist.ListNode result = ReverseAlternatingKElementSublist.reverse(head, 2);

        // Verify the reversed LinkedList
        assertEquals(2, result.value);
        assertEquals(1, result.next.value);
        assertEquals(4, result.next.next.value);
        assertEquals(3, result.next.next.next.value);
        assertEquals(5, result.next.next.next.next.value);
        assertNull(result.next.next.next.next.next);
    }

    @Test
    public void testReverseWithKGreaterThanListSize() {
        ReverseAlternatingKElementSublist.ListNode head = new ReverseAlternatingKElementSublist.ListNode(1);
        head.next = new ReverseAlternatingKElementSublist.ListNode(2);
        head.next.next = new ReverseAlternatingKElementSublist.ListNode(3);

        ReverseAlternatingKElementSublist.ListNode result = ReverseAlternatingKElementSublist.reverse(head, 4);

        // Verify the reversed LinkedList (should remain the same as k > list size)
        assertEquals(1, result.value);
        assertEquals(2, result.next.value);
        assertEquals(3, result.next.next.value);
        assertNull(result.next.next.next);
    }

    @Test
    public void testReverseWithNullList() {
        ReverseAlternatingKElementSublist.ListNode result = ReverseAlternatingKElementSublist.reverse(null, 3);

        // Verify that the result is null when the input list is null
        assertNull(result);
    }

    @Test
    public void testReverseWithKLessThanOrEqualToZero() {
        ReverseAlternatingKElementSublist.ListNode head = new ReverseAlternatingKElementSublist.ListNode(1);
        head.next = new ReverseAlternatingKElementSublist.ListNode(2);
        head.next.next = new ReverseAlternatingKElementSublist.ListNode(3);

        ReverseAlternatingKElementSublist.ListNode result = ReverseAlternatingKElementSublist.reverse(head, 0);

        // Verify that the result is the same as the input when k is less than or equal to zero
        assertEquals(1, result.value);
        assertEquals(2, result.next.value);
        assertEquals(3, result.next.next.value);
        assertNull(result.next.next.next);
    }
}
