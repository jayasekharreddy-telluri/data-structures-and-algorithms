package org.com.jai.pattrens.reversaloflinkedlist;

public class ReverseEveryKElementSubList {

    public static class ListNode {
        public int value;
        public ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    /**
     * Reverses every k elements in the linked list.
     *
     * @param head The head of the linked list.
     * @param k    The number of elements to reverse at a time.
     * @return The head of the reversed linked list.
     */
    public static ListNode reverse(ListNode head, int k) {

        // Check for invalid input cases
        if (head == null || k <= 1) {
            return head;
        }

        ListNode current = head;
        ListNode previous = null;

        while (true) {

            // Keep track of the last node of the previous part
            ListNode lastNodeOfPreviousPart = previous;

            // Keep track of the last node of the current sublist
            ListNode lastNodeOfSubList = current;
            ListNode next = null;

            // Reverse k elements
            for (int i = 0; i < k; i++) {

                next = current.next;
                current.next = previous;
                previous = current;
                current = next;
            }

            // Connect the previous part to the reversed sublist
            if (lastNodeOfPreviousPart != null) {
                lastNodeOfPreviousPart.next = previous;
            } else {
                // If the previous part is null, update the head of the entire list
                head = previous;
            }

            // Connect the end of the reversed sublist to the next part
            lastNodeOfSubList.next = current;

            // If the current is null, we have reached the end of the list
            if (current == null) {
                break;
            }

            // Update the previous to the last node of the current sublist
            previous = lastNodeOfSubList;
        }

        return head;

        /*
            time complexity - O(N)

            space complexity - O(1)
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
