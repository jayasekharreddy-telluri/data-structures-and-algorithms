package org.com.jai.pattrens.slow_fastpointers;

/*
    https://leetcode.com/problems/linked-list-cycle-ii/
*/
public class LinkedListCycleStart {

    public static ListNode findCycle(ListNode head){

        int cycleLength = 0;

        ListNode slowPointer = head;

        ListNode fastPointer = head;

        while(fastPointer != null && fastPointer.next != null){

            slowPointer = slowPointer.next;

            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer){

                cycleLength = findcycleLength(slowPointer);

                break;

            }

        }

        return findStart(head,cycleLength);


        /*
                time complexity -- O(n)

                space complexity -- O(1)
         */

    }

    private static ListNode findStart(ListNode head, int cycleLength) {

        ListNode pointerOne = head;

        ListNode pointerTwo = head;

        while(cycleLength > 0){

            pointerTwo = pointerTwo.next;
            cycleLength--;
        }

        while(pointerTwo != pointerOne){

            pointerOne = pointerOne.next;

            pointerTwo = pointerTwo.next;

        }

        return pointerOne;

    }

    private static int findcycleLength(ListNode slowPointer) {

        ListNode currentPointer = slowPointer;

        int cycleLength = 0;

        do{
            currentPointer = currentPointer.next;

            cycleLength++;

        }while(slowPointer != currentPointer);

        return cycleLength;
    }

    public static void main(String[] args) {


        ListNode head = new ListNode(1);

        head.next = new ListNode(2);

        head.next.next = new ListNode(3);

        head.next.next.next = new ListNode(4);

        head.next.next.next.next = new ListNode(5);

        head.next.next.next.next.next = new ListNode(6);

        head.next.next.next.next.next.next = head.next.next.next;

        System.out.println(findCycle(head).value);

    }

}
