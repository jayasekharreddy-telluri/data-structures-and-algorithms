package org.com.jai.pattrens.reversaloflinkedlist;

public class RotateALinkedList {

    public static class ListNode {
        public int value;
        public ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public static ListNode rotateByK(ListNode head, int rotation) {
        // Check for edge cases: empty list, list with only one node, or rotation <= 0
        if (head == null || head.next == null || rotation <= 0) {
            return head;
        }

        ListNode temp = head;
        int listLength = 1;

        // Calculate the length of the linked list
        while (temp.next != null) {
            temp = temp.next;
            listLength++;
        }

        // Make the linked list circular by connecting the tail to the head
        temp.next = head;

        // Calculate the effective rotation amount based on list length
        rotation = rotation % listLength;

        // Calculate the number of nodes to skip to find the new head
        int skipLength = listLength - rotation;

        // Find the last node of the rotated list
        ListNode lastNodeOfRotatedList = head;
        for (int i = 0; i < skipLength - 1; i++) {
            lastNodeOfRotatedList = lastNodeOfRotatedList.next;
        }

        // Update the head to the new node
        head = lastNodeOfRotatedList.next;

        // Disconnect the last node of the rotated list
        lastNodeOfRotatedList.next = null;

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

        // Rotate the linked list by 6 positions
        ListNode result = rotateByK(head, 6);

        // Print the rotated LinkedList
        while (result != null) {
            System.out.print(result.value + "  ");
            result = result.next;
        }
    }
}
