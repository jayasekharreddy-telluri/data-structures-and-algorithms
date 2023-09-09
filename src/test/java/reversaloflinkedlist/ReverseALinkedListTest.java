package reversaloflinkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.com.jai.pattrens.reversaloflinkedlist.ReverseALinkedList;
import org.junit.jupiter.api.Test;

public class ReverseALinkedListTest {

    @Test
    public void testReverseEmptyLinkedList() {
        // Test case: Reversing an empty LinkedList should return null.
        ReverseALinkedList.LinkedList head = null;
        assertNull(ReverseALinkedList.reverseALinkedList(head));
    }

    @Test
    public void testReverseSingleNodeLinkedList() {
        // Test case: Reversing a single-node LinkedList should result in the same node.
        ReverseALinkedList.LinkedList head = new ReverseALinkedList.LinkedList(1);
        ReverseALinkedList.LinkedList reversed = ReverseALinkedList.reverseALinkedList(head);
        assertEquals(1, reversed.value);
        assertNull(reversed.next);
    }

    @Test
    public void testReverseLinkedList() {
        // Test case: Reversing a regular LinkedList with multiple nodes.
        ReverseALinkedList.LinkedList head = new ReverseALinkedList.LinkedList(1);
        head.next = new ReverseALinkedList.LinkedList(2);
        head.next.next = new ReverseALinkedList.LinkedList(3);
        head.next.next.next = new ReverseALinkedList.LinkedList(4);

        ReverseALinkedList.LinkedList reversed = ReverseALinkedList.reverseALinkedList(head);

        // Verify the reversed LinkedList values.
        assertEquals(4, reversed.value);
        assertEquals(3, reversed.next.value);
        assertEquals(2, reversed.next.next.value);
        assertEquals(1, reversed.next.next.next.value);
        assertNull(reversed.next.next.next.next);
    }

    @Test
    public void testReverseLinkedListWithNegativeValues() {
        // Test case: Reversing a LinkedList with negative values.
        ReverseALinkedList.LinkedList head = new ReverseALinkedList.LinkedList(-1);
        head.next = new ReverseALinkedList.LinkedList(-2);
        head.next.next = new ReverseALinkedList.LinkedList(-3);

        ReverseALinkedList.LinkedList reversed = ReverseALinkedList.reverseALinkedList(head);

        // Verify the reversed LinkedList values.
        assertEquals(-3, reversed.value);
        assertEquals(-2, reversed.next.value);
        assertEquals(-1, reversed.next.next.value);
        assertNull(reversed.next.next.next);
    }

}
