package org.com.jai.pattrens.KWayMerge;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KPairsWithLargestSums {

    public static List<int[]> findKPairsWithLargestSums(int[] nums1, int[] nums2, int k) {
        // Min heap to store pairs based on the sum of elements
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((p1, p2) ->
                (p1[0] + p1[1]) - (p2[0] + p2[1]));

        // Loop through nums1 and nums2
        for (int i = 0; i < nums1.length && i < k; i++) {
            for (int j = 0; j < nums2.length && j < k; j++) {
                // If the heap size is less than k, add the pair directly
                if (minHeap.size() < k) {
                    minHeap.add(new int[]{nums1[i], nums2[j]});
                } else {
                    // If the sum of the current pair is less than the smallest sum in the heap, break
                    if (nums1[i] + nums2[j] < minHeap.peek()[0] + minHeap.peek()[1]) {
                        break;
                    } else {
                        // Replace the smallest sum pair with the current pair
                        minHeap.poll();
                        minHeap.add(new int[]{nums1[i], nums2[j]});
                    }
                }
            }
        }

        // Convert the heap to a list
        return new ArrayList<>(minHeap);
    }

    public static void main(String[] args) {
        int[] l1 = new int[]{9, 8, 2};
        int[] l2 = new int[]{6, 3, 1};

        // Find 3 pairs with the largest sums
        List<int[]> result = findKPairsWithLargestSums(l1, l2, 3);

        // Print the result
        System.out.println(result);
        for (int[] p : result) {
            System.out.println(p[0] + " " + p[1]);
        }
    }
}
