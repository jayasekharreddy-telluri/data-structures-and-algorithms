package org.com.jai.pattrens.slow_fastpointers;


/*
            https://leetcode.com/problems/reorder-list/
     */
public class RearrangeALinkedList {

    public static void reorderList(ListNode head) {

        ListNode slowPointer = head;

        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {

            slowPointer = slowPointer.next;

            fastPointer = fastPointer.next.next;

        }

        ListNode headOfSecondHalf = reverseList(slowPointer);

        ListNode headOfFirstHalf = head;

        while (headOfFirstHalf != null & headOfSecondHalf != null) {

            ListNode temp = headOfFirstHalf.next;

            headOfFirstHalf.next = headOfSecondHalf;

            headOfFirstHalf = temp;

            temp = headOfSecondHalf.next;

            headOfSecondHalf.next = headOfFirstHalf;

            headOfSecondHalf = temp;

        }

        if (headOfFirstHalf != null) {

            headOfFirstHalf.next = null;
        }

        if (head == null) {
            System.out.println("single linkedlist doesnt exist");
            return;
        } else {
            ListNode tempNode = head;
            while (tempNode != null) {
                System.out.print(tempNode.value + "--->");

                tempNode = tempNode.next;
            }
        }

    }

    public static ListNode reverseList(ListNode head) {

        ListNode prev = null;

        while (head != null) {

            ListNode next = head.next;

            head.next = prev;

            prev = head;
            head = next;
        }
        return prev;
    }

        /*
            Time complexity: O(n)
            Space complexity: O(1)
         */


    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        reorderList(head);

    }
}
