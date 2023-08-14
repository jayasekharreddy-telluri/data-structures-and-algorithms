package org.com.jai.pattrens.slow_fastpointers;

/*
           https://leetcode.com/problems/linked-list-cycle/
   */
public class LinkedListCycle {

    public static boolean hasCycle(ListNode head) {

        ListNode slowPointer = head;

        ListNode fastPointer = head;

        while (fastPointer != null && fastPointer.next != null) {

            slowPointer = slowPointer.next;

            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer) {

                return true;
            }


        }

        return false;

        /*
                time complexity -- O(n)

                space complexity -- O(1)
         */

    }

    public static void main(String[] args) {

        ListNode head = new ListNode(1);

        head.next = new ListNode(2);

        head.next.next = new ListNode(3);

        head.next.next.next = new ListNode(4);

        head.next.next.next.next = new ListNode(5);

        head.next.next.next.next.next = new ListNode(6);

        System.out.println(hasCycle(head));

        head.next.next.next.next.next.next = head.next.next;

        System.out.println(hasCycle(head));

    }

}



