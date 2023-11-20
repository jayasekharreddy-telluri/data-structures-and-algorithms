package org.com.jai.pattrens.KWayMerge;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KthSmallestNumberInMSortedLists {

    public static int findKthSmallestNumberInMSortedLists(List<Integer[]> lists, int k) {

        // Min heap to store the nodes
        PriorityQueue<Node> minHeap = new PriorityQueue<>
                ((n1, n2) -> lists.get(n1.arrayIndex)[n1.elementIndex] - lists.get(n2.arrayIndex)[n2.elementIndex]);

        // Add the first element of each list to the min heap
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i) != null && lists.get(i).length > 0) {
                minHeap.add(new Node(0, i));
            }
        }

        int numberCount = 0, result = 0;

        while (!minHeap.isEmpty()) {
            Node node = minHeap.poll();

            // Get the smallest element from the heap
            result = lists.get(node.arrayIndex)[node.elementIndex];

            // Increment the count of numbers retrieved
            if (++numberCount == k) {
                break;
            }

            // Move to the next element in the same array if available
            node.elementIndex++;
            if (lists.get(node.arrayIndex).length > node.elementIndex) {
                minHeap.add(node);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Integer[] l1 = new Integer[]{2, 6, 8};
        Integer[] l2 = new Integer[]{3, 6, 7};
        Integer[] l3 = new Integer[]{1, 3, 4};

        List<Integer[]> lists = new ArrayList<>();
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);

        int result = findKthSmallestNumberInMSortedLists(lists, 5);
        System.out.println(result);
    }
}
