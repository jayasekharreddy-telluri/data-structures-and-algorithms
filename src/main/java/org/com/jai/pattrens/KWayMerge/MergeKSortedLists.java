package org.com.jai.pattrens.KWayMerge;

import java.util.PriorityQueue;

public class MergeKSortedLists {

    public static ListNode merge(ListNode[] lists) {
        // Create a min heap to store the list nodes
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>((n1, n2) -> n1.value - n2.value);

        // Add the heads of all lists to the min heap
        for (ListNode root : lists) {
            if (root != null) {
                minHeap.add(root);
            }
        }

        ListNode resultHead = null, resultTail = null;

        // Merge nodes from the min heap
        while (!minHeap.isEmpty()) {
            ListNode node = minHeap.poll();

            // Initialize the result linked list or append to it
            if (resultHead == null) {
                resultHead = resultTail = node;
            } else {
                resultTail.next = node;
                resultTail = resultTail.next;
            }

            // Add the next node of the merged list to the min heap
            if (node.next != null) {
                minHeap.add(node.next);
            }
        }

        return resultHead;
    }

    public static void main(String[] args) {
        // Test case: Create three sorted linked lists
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(6);
        l1.next.next = new ListNode(8);

        ListNode l2 = new ListNode(3);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(7);

        ListNode l3 = new ListNode(1);
        l3.next = new ListNode(3);
        l3.next.next = new ListNode(4);

        // Merge the lists and print the merged result
        ListNode result = merge(new ListNode[]{l1, l2, l3});
        System.out.println("Elements from Merged list:");
        while (result != null) {
            System.out.print(result.value + " ");
            result = result.next;
        }
    }
}
