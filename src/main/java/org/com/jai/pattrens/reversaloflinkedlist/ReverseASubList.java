package org.com.jai.pattrens.reversaloflinkedlist;

public class ReverseASubList {

    public static class LinkedList {
        public int value;
        public LinkedList next;

        public LinkedList(int value) {
            this.value = value;
        }
    }

    // Function to reverse a sublist of a LinkedList from position p to q
    public static LinkedList reverseSubList(LinkedList node, int p, int q) {
        // Check for invalid input cases
        if (node == null || node.next == null || p >= q || p < 1 || q < 1) {
            return node;
        }

        LinkedList head = node; // Store the head of the original list
        LinkedList previous = null;

        // Traverse the list until position p
        for (int i = 1; node != null && i < p; i++) {
            previous = node;
            node = node.next;
        }

        // If p is greater than the length of the list, return the original list
        if (node == null) {
            return head;
        }

        LinkedList firstSubListEnd = previous;
        LinkedList secondSubListStart = node;
        LinkedList next = null;

        // Reverse the sublist from p to q
        for (int i = 0; node != null && i <= q - p; i++) {
            next = node.next;
            node.next = previous;
            previous = node;
            node = next;
        }

        // Connect the reversed sublist to the original list
        if (p != 1) {
            firstSubListEnd.next = previous;
        }
        secondSubListStart.next = node;

        // If p is 1, the new head is the start of the reversed sublist; otherwise, it's still the original head
        return p == 1 ? previous : head;
    }

    public static void main(String[] args) {
        LinkedList head = new LinkedList(2);
        head.next = new LinkedList(3);
        head.next.next = new LinkedList(4);
        head.next.next.next = new LinkedList(5);

        LinkedList result = reverseSubList(head, 2, 3);

        // Print the reversed LinkedList
        while (result != null) {
            System.out.print(result.value + "  ");
            result = result.next;
        }
    }
}

// Time Complexity: O(q) - We iterate through the list from position p to q.
// Space Complexity: O(1) - We use a constant amount of extra space for variables.

