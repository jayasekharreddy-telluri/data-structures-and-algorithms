package org.com.jai.pattrens.reversaloflinkedlist;

public class ReverseALinkedList {

    // Definition of a LinkedList node
    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
        }
    }

    // Function to reverse a LinkedList
    public static LinkedList reverseALinkedList(LinkedList head) {

        LinkedList current = head; // Current node initially points to the head of the list

        LinkedList previous = null; // Previous node initially set to null

        LinkedList next = null; // Next node initially set to null

        while (current != null) {
            next = current.next; // Save the next node temporarily
            current.next = previous; // Reverse the link to the previous node
            previous = current; // Move previous to the current node
            current = next; // Move current to the next node
        }

        // At this point, 'previous' will be the new head of the reversed LinkedList
        return previous;

        /*
                 time complexity  is O(n)

                 space complexity is O(1)
         */
    }

    public static void main(String[] args) {

        LinkedList head = new LinkedList(2);
        head.next = new LinkedList(3);
        head.next.next = new LinkedList(4);
        head.next.next.next = new LinkedList(5);

        LinkedList result = reverseALinkedList(head);

        // Print the reversed LinkedList
        while (result != null) {
            System.out.print(result.value + "  ");
            result = result.next;
        }
    }
}
