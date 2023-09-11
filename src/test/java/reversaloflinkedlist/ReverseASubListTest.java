package reversaloflinkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.com.jai.pattrens.reversaloflinkedlist.ReverseASubList;
import org.junit.jupiter.api.Test;

public class ReverseASubListTest {

    @Test
    public void testReverseSubList_NormalCase() {
        ReverseASubList.LinkedList head = new ReverseASubList.LinkedList(1);
        head.next = new ReverseASubList.LinkedList(2);
        head.next.next = new ReverseASubList.LinkedList(3);
        head.next.next.next = new ReverseASubList.LinkedList(4);
        head.next.next.next.next = new ReverseASubList.LinkedList(5);

        ReverseASubList.LinkedList result = ReverseASubList.reverseSubList(head, 2, 4);

        // Convert the reversed LinkedList to an array for comparison
        int[] expected = {1, 4, 3, 2, 5};
        int[] actual = linkedListToArray(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverseSubList_SingleElement() {
        ReverseASubList.LinkedList head = new ReverseASubList.LinkedList(1);

        ReverseASubList.LinkedList result = ReverseASubList.reverseSubList(head, 1, 1);

        int[] expected = {1};
        int[] actual = linkedListToArray(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverseSubList_NullList() {
        ReverseASubList.LinkedList head = null;

        ReverseASubList.LinkedList result = ReverseASubList.reverseSubList(head, 2, 4);

        assertNull(result);
    }

    @Test
    public void testReverseSubList_PEqualsQ() {
        ReverseASubList.LinkedList head = new ReverseASubList.LinkedList(1);
        head.next = new ReverseASubList.LinkedList(2);
        head.next.next = new ReverseASubList.LinkedList(3);

        ReverseASubList.LinkedList result = ReverseASubList.reverseSubList(head, 2, 2);

        int[] expected = {1, 2, 3};
        int[] actual = linkedListToArray(result);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverseSubList_PGreaterThanQ() {
        ReverseASubList.LinkedList head = new ReverseASubList.LinkedList(1);
        head.next = new ReverseASubList.LinkedList(2);
        head.next.next = new ReverseASubList.LinkedList(3);

        ReverseASubList.LinkedList result = ReverseASubList.reverseSubList(head, 3, 2);

        int[] expected = {1, 2, 3};
        int[] actual = linkedListToArray(result);
        assertArrayEquals(expected, actual);
    }

    // Helper method to convert a LinkedList to an array
    private int[] linkedListToArray(ReverseASubList.LinkedList head) {
        if (head == null) {
            return new int[0];
        }

        int size = 0;
        ReverseASubList.LinkedList current = head;
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

