package org.com.jai.pattrens.twoheaps;
import java.util.Arrays;
import java.util.PriorityQueue;

public class NextInterval {

    public static int[] findNextInterval(Intervals[] intervals) {

        int n = intervals.length;

        // Create a max heap based on the start times of intervals
        PriorityQueue<Integer> maxStartHeap = new PriorityQueue<>(n, (i1, i2) -> intervals[i2].start - intervals[i1].start);

        // Create a max heap based on the end times of intervals
        PriorityQueue<Integer> maxEndHeap = new PriorityQueue<>(n, (i1, i2) -> intervals[i2].end - intervals[i1].end);

        int[] result = new int[n];

        // Initialize the max start and end heaps with interval indices
        for (int i = 0; i < intervals.length; i++) {
            maxStartHeap.offer(i);
            maxEndHeap.offer(i);
        }

        // Loop through each interval
        for (int i = 0; i < n; i++) {
            // Get the interval with the maximum end time
            int topEnd = maxEndHeap.poll();

            // Initialize the result for the current interval to -1 (no next interval found)
            result[topEnd] = -1;

            // Check if there is a next interval with a start time greater than or equal to the current interval's end time
            if (intervals[maxStartHeap.peek()].start >= intervals[topEnd].end) {
                // Get the next interval's index
                int topStart = maxStartHeap.poll();

                // Keep checking for the next interval if there are multiple intervals with start times >= current interval's end time
                while (!maxStartHeap.isEmpty() && intervals[maxStartHeap.peek()].start >= intervals[topEnd].end) {
                    topStart = maxStartHeap.poll();
                }

                // Update the result for the current interval with the index of the next interval found
                result[topEnd] = topStart;

                // Add the current interval back to the max start heap for future iterations
                maxStartHeap.add(topStart);
            }
        }

        return result;

        /*
            Time Complexity: O(n * log(n)).
            Space Complexity: O(n).
         */
    }

    public static void main(String[] args) {
        // Example intervals
        Intervals[] intervals = new Intervals[]{new Intervals(3, 4), new Intervals(1, 5), new Intervals(4, 6)};

        // Call the function to find next intervals and print the result
        System.out.println(Arrays.toString(findNextInterval(intervals)));
    }
}
