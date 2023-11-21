package org.com.jai.pattrens.KWayMerge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SmallestNumberRange {

    public static int[] findSmallestNumberRange(List<Integer[]> lists){

        // Min heap to track the smallest element among all lists
        PriorityQueue<Node> minHeap = new PriorityQueue<>((n1, n2) ->
                lists.get(n1.arrayIndex)[n1.elementIndex] - lists.get(n2.arrayIndex)[n2.elementIndex]);

        // Variables to track the range
        int rangeStart = 0, rangeEnd = Integer.MAX_VALUE, currentMax = Integer.MIN_VALUE;

        // Initialization phase
        for (int i = 0; i < lists.size(); i++){
            if (lists.get(i) != null){
                minHeap.add(new Node(0, i)); // Add the first element of each list to the min heap
                currentMax = Math.max(currentMax, lists.get(i)[0]); // Track the maximum element among the first elements
            }
        }

        // Main logic to find the smallest range
        while (minHeap.size() == lists.size()){
            Node node = minHeap.poll(); // Extract the smallest element from minHeap

            // Update the range if a smaller range is found
            if (rangeEnd - rangeStart > currentMax - lists.get(node.arrayIndex)[node.elementIndex]){
                rangeStart = lists.get(node.arrayIndex)[node.elementIndex];
                rangeEnd = currentMax;
            }

            node.elementIndex++; // Move to the next element in the same list

            // If there are more elements in the current list, add the next element to the minHeap
            if (lists.get(node.arrayIndex).length > node.elementIndex){
                minHeap.add(node);
                currentMax = Math.max(currentMax, lists.get(node.arrayIndex)[node.elementIndex]);
            }
        }

        return new int[] {rangeStart, rangeEnd}; // Return the smallest range
    }

    public static void main(String[] args) {
        Integer[] L1= new Integer[] {1, 5, 8};
        Integer[] L2= new Integer[]{4, 12};
        Integer[] L3= new Integer[] {7, 8, 10};

        List<Integer[]> lists = new ArrayList<>();
        lists.add(L1);
        lists.add(L2);
        lists.add(L3);

        System.out.println(Arrays.toString(findSmallestNumberRange(lists)));
    }
}
