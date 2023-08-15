package slow_fastpointers;

import org.com.jai.pattrens.slow_fastpointers.ListNode;
import org.com.jai.pattrens.slow_fastpointers.PalindromeLinkedList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PalindromeLinkedListTest {

    @Test
    void testPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);
        assertTrue(PalindromeLinkedList.isPalindrome(head));
    }

    @Test
    void testEvenLengthPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);
        assertTrue(PalindromeLinkedList.isPalindrome(head));
    }

    @Test
    void testNonPalindrome() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        assertFalse(PalindromeLinkedList.isPalindrome(head));
    }

    @Test
    void testSingleElementPalindrome() {
        ListNode head = new ListNode(5);
        assertTrue(PalindromeLinkedList.isPalindrome(head));
    }

    @Test
    void testEmptyList() {
        assertTrue(PalindromeLinkedList.isPalindrome(null));
    }

}
