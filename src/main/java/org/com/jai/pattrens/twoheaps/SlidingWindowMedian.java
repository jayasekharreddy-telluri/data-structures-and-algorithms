package org.com.jai.pattrens.twoheaps;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindowMedian {

    static PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    public static Double[] findSlidingWindowMedian(int[] nums, int k) {
        Double[] result = new Double[nums.length - k + 1];

        for (int i = 0; i < nums.length; i++) {
            if (maxHeap.size() == 0 || maxHeap.peek() >= nums[i]) {
                maxHeap.add(nums[i]);
            } else {
                minHeap.add(nums[i]);
            }

            rebalanceHeaps();

            if (i - k + 1 >= 0) {
                if (maxHeap.size() == minHeap.size()) {
                    result[i - k + 1] = maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
                } else {
                    result[i - k + 1] = Double.valueOf(maxHeap.peek());
                }

                int valueToBeRemoved = nums[i - k + 1];

                if (valueToBeRemoved <= maxHeap.peek()) {
                    maxHeap.remove(valueToBeRemoved);
                } else {
                    minHeap.remove(valueToBeRemoved);
                }

                rebalanceHeaps();
            }
        }

        return result;
    }

    private static void rebalanceHeaps() {
        if (maxHeap.size() > minHeap.size() + 1) {
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            maxHeap.add(minHeap.poll());
        }
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, -1, 3, 5 };
        int k = 2;
        System.out.println(Arrays.toString(findSlidingWindowMedian(nums, k)));
    }
}
