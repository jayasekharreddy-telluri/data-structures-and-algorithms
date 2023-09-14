package reversaloflinkedlist;

import org.com.jai.pattrens.reversaloflinkedlist.RotateALinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class RotateALinkedListTest {

    @Test
    public void testRotateByZero() {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        RotateALinkedList.ListNode head = new RotateALinkedList.ListNode(1);
        head.next = new RotateALinkedList.ListNode(2);
        head.next.next = new RotateALinkedList.ListNode(3);
        head.next.next.next = new RotateALinkedList.ListNode(4);
        head.next.next.next.next = new RotateALinkedList.ListNode(5);
        head.next.next.next.next.next = new RotateALinkedList.ListNode(6);

        // Rotate by 0 positions, the list should remain the same
        RotateALinkedList.ListNode result = RotateALinkedList.rotateByK(head, 0);

        for (int i = 1; i <= 6; i++) {
            assertEquals(i, result.value);
            result = result.next;
        }
    }

    @Test
    public void testRotateByPositiveK() {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        RotateALinkedList.ListNode head = new RotateALinkedList.ListNode(1);
        head.next = new RotateALinkedList.ListNode(2);
        head.next.next = new RotateALinkedList.ListNode(3);
        head.next.next.next = new RotateALinkedList.ListNode(4);
        head.next.next.next.next = new RotateALinkedList.ListNode(5);
        head.next.next.next.next.next = new RotateALinkedList.ListNode(6);

        // Rotate by 3 positions, expect: 4 -> 5 -> 6 -> 1 -> 2 -> 3
        RotateALinkedList.ListNode result = RotateALinkedList.rotateByK(head, 3);

        for (int i = 4; i <= 6; i++) {
            assertEquals(i, result.value);
            result = result.next;
        }
        for (int i = 1; i <= 3; i++) {
            assertEquals(i, result.value);
            result = result.next;
        }
    }

    @Test
    public void testRotateByNegativeK() {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        RotateALinkedList.ListNode head = new RotateALinkedList.ListNode(1);
        head.next = new RotateALinkedList.ListNode(2);
        head.next.next = new RotateALinkedList.ListNode(3);
        head.next.next.next = new RotateALinkedList.ListNode(4);
        head.next.next.next.next = new RotateALinkedList.ListNode(5);
        head.next.next.next.next.next = new RotateALinkedList.ListNode(6);

        // Rotate by -2 positions, expect: 3 -> 4 -> 5 -> 6 -> 1 -> 2
        RotateALinkedList.ListNode result = RotateALinkedList.rotateByK(head, -2);

        for (int i = 3; i <= 6; i++) {
            assertEquals(i, result.value);
            result = result.next;
        }
        for (int i = 1; i <= 2; i++) {
            assertEquals(i, result.value);
            result = result.next;
        }
    }

    @Test
    public void testRotateEmptyList() {
        // Test with an empty linked list, the result should also be an empty list
        RotateALinkedList.ListNode result = RotateALinkedList.rotateByK(null, 5);
        assertNull(result);
    }

    @Test
    public void testRotateSingleElementList() {
        // Test with a linked list containing only one element, the result should be the same list
        RotateALinkedList.ListNode head = new RotateALinkedList.ListNode(1);
        RotateALinkedList.ListNode result = RotateALinkedList.rotateByK(head, 3);
        assertEquals(1, result.value);
        assertNull(result.next);
    }
}
