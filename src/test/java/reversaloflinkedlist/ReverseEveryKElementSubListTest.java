package reversaloflinkedlist;
import static org.junit.jupiter.api.Assertions.*;

import org.com.jai.pattrens.reversaloflinkedlist.ReverseEveryKElementSubList;
import org.junit.jupiter.api.Test;

public class ReverseEveryKElementSubListTest {

    @Test
    public void testReverse_NormalCase() {
        // Create a linked list: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        ReverseEveryKElementSubList.ListNode head = new ReverseEveryKElementSubList.ListNode(1);
        head.next = new ReverseEveryKElementSubList.ListNode(2);
        head.next.next = new ReverseEveryKElementSubList.ListNode(3);
        head.next.next.next = new ReverseEveryKElementSubList.ListNode(4);
        head.next.next.next.next = new ReverseEveryKElementSubList.ListNode(5);
        head.next.next.next.next.next = new ReverseEveryKElementSubList.ListNode(6);

        // Reverse every 2 elements
        ReverseEveryKElementSubList.ListNode result = ReverseEveryKElementSubList.reverse(head, 2);

        // Convert the reversed LinkedList to an array for comparison
        int[] expected = {2, 1, 4, 3, 6, 5};
        int[] actual = linkedListToArray(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverse_SingleElement() {
        // Create a linked list with a single element: 1
        ReverseEveryKElementSubList.ListNode head = new ReverseEveryKElementSubList.ListNode(1);

        // Reverse every 2 elements (no effect)
        ReverseEveryKElementSubList.ListNode result = ReverseEveryKElementSubList.reverse(head, 2);

        // Convert the reversed LinkedList to an array for comparison
        int[] expected = {1};
        int[] actual = linkedListToArray(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverse_NullList() {
        // Create a null linked list
        ReverseEveryKElementSubList.ListNode head = null;

        // Reverse every 2 elements (no effect)
        ReverseEveryKElementSubList.ListNode result = ReverseEveryKElementSubList.reverse(head, 2);

        assertNull(result);
    }

    @Test
    public void testReverse_KGreaterThanListSize() {
        // Create a linked list: 1 -> 2 -> 3
        ReverseEveryKElementSubList.ListNode head = new ReverseEveryKElementSubList.ListNode(1);
        head.next = new ReverseEveryKElementSubList.ListNode(2);
        head.next.next = new ReverseEveryKElementSubList.ListNode(3);

        // Reverse every 4 elements (no effect)
        ReverseEveryKElementSubList.ListNode result = ReverseEveryKElementSubList.reverse(head, 4);

        // Convert the reversed LinkedList to an array for comparison
        int[] expected = {1, 2, 3};
        int[] actual = linkedListToArray(result);
        assertArrayEquals(expected, actual);
    }

    // Helper method to convert a LinkedList to an array
    private int[] linkedListToArray(ReverseEveryKElementSubList.ListNode head) {
        if (head == null) {
            return new int[0];
        }

        int size = 0;
        ReverseEveryKElementSubList.ListNode current = head;
        while (current != null) {
            size++;
            current = current.next;
        }

        int[] result = new int[size];
        current = head;
        int index = 0;
        while (current != null) {
            result[index++] = current.value;
            current = current.next;
        }

        return result;
    }
}
