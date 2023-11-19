package org.com.jai.pattrens.topkelements;

import java.util.*;

public class SchedulingTasks {

    public static int schedulingTasks(char[] chars, int k) {

        int intervalCount = 0;

        // Store character frequencies
        Map<Character, Integer> freqMap = new HashMap<>();

        // Max heap to store characters based on frequency
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());

        // Count frequencies of each character in the input array
        for (char ch : chars) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Add all character frequency entries to the max heap
        maxHeap.addAll(freqMap.entrySet());

        while (!maxHeap.isEmpty()) {

            // Waiting list for characters that need to wait before their next execution
            List<Map.Entry<Character, Integer>> waitingList = new ArrayList<>();

            int n = k + 1; // Interval size

            // Execute tasks within the interval
            for (; n > 0 && !maxHeap.isEmpty(); n--) {
                intervalCount++;

                Map.Entry<Character, Integer> currentEntry = maxHeap.poll();

                if (currentEntry.getValue() > 1) {
                    currentEntry.setValue(currentEntry.getValue() - 1);
                    waitingList.add(currentEntry);
                }
            }

            // Add waiting tasks back to the heap
            maxHeap.addAll(waitingList);

            // If there are still tasks remaining, increment interval count
            if (!maxHeap.isEmpty()) {
                intervalCount = intervalCount + n;
            }
        }

        return intervalCount;
    }

    public static void main(String[] args) {
        char[] chars = {'a', 'a', 'a', 'b', 'c', 'c'};
        int k = 2;
        System.out.println(schedulingTasks(chars, k));
    }
}
