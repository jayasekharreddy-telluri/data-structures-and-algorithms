package org.com.jai.pattrens.slow_fastpointers;

/*
        https://leetcode.com/problems/palindrome-linked-list/
*/
public class PalindromeLinkedList {

    public static boolean isPalindrome(ListNode head) {

        // Edge case: If the list is empty or has only one element, it's a palindrome.
        if (head == null || head.next == null) {
            return true;
        }

        ListNode slowPointer = head;
        ListNode fastPointer = head;

        // Move the fast pointer twice as fast as the slow pointer to find the middle.
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
        }

        // If the list has an odd number of nodes, move the slow pointer one step further.
        if (fastPointer != null) {
            slowPointer = slowPointer.next;
        }

        // Reverse the second half of the linked list.
        ListNode revHead = reverseList(slowPointer);

        // Compare values of the first and reversed second halves of the linked list.
        while (revHead != null) {
            if (revHead.value != head.value) {
                return false;
            } else {
                revHead = revHead.next;
                head = head.next;
            }
        }

        return true;

        /*
                time complexity -- O(n)

                space complexity -- 0(1)
         */
    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(4);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(2);

        System.out.println(isPalindrome(head));
    }
}
