package org.com.jai.pattrens.reversaloflinkedlist;

public class ReverseAlternatingKElementSublist {

    public static class ListNode {

        public int value;

        public ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public static ListNode reverse(ListNode head, int k) {

        if (head == null || k <= 1) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (true) {

            // Store the last node of the previous part
            ListNode lastNodeOfPreviousPart = previous;

            // Store the last node of the sublist
            ListNode lastNodeOfSublist = current;

            ListNode next = null;

            // Reverse k nodes in the sublist
            for (int i = 0; current != null && i < k; i++) {
                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }

            // Connect the previous part's last node to the new sublist head
            if (lastNodeOfPreviousPart != null) {
                lastNodeOfPreviousPart.next = previous;
            } else {
                head = previous; // If there's no previous part, update the head
            }

            // Connect the last node of the sublist to the next part
            lastNodeOfSublist.next = current;

            // Move to the next sublist
            for (int i = 0; current != null && i < k; ++i) {
                previous = current;
                current = current.next;
            }

            // If there are no more elements to reverse, break
            if (current == null) {
                break;
            }
        }

        return head;

        /*
                    Time Complexity: O(N);
                    Space Complexity: O(1);
         */
    }

    public static void main(String[] args) {

        // Create a sample linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = new ListNode(6);

        // Reverse every 2 elements
        ListNode result = reverse(head, 2);

        // Print the reversed LinkedList
        while (result != null) {
            System.out.print(result.value + "  ");
            result = result.next;
        }
    }
}
