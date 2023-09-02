package org.com.jai.pattrens.mergeintervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MinimumMeetingRooms {

    // Define a class to represent an interval
    public static class Interval {
        int start;
        int end;

        public Interval(int start, int end) {
            this.start = start;
            this.end = end;
        }
    }

    // Function to find the minimum meeting rooms required
    public static int findMinimumMeetingRooms(List<Interval> meetings) {

        // Handle edge case: If the input list is empty or null, return 0
        if (meetings == null || meetings.size() == 0) {
            return 0;
        }

        // Sort the intervals based on their start times
        Collections.sort(meetings, (a, b) -> Integer.compare(a.start, b.start));

        // Create a min heap (priority queue) to track the end times of ongoing meetings
        PriorityQueue<Interval> minHeap = new PriorityQueue<>(
                meetings.size(), (a, b) -> Integer.compare(a.end, b.end));

        int minRooms = 0; // Initialize the minimum rooms required

        for (Interval meeting : meetings) {
            // Check if there are any meetings that have ended before the current meeting starts
            while (!minHeap.isEmpty() && meeting.start >= minHeap.peek().end) {
                minHeap.poll(); // Remove the meeting that has ended
            }

            minHeap.offer(meeting); // Add the current meeting to the heap
            minRooms = Math.max(minRooms, minHeap.size()); // Update the minimum rooms required
        }

        return minRooms; // Return the minimum rooms required

        /*
                time complexity is O(n log n)
                space complexity is O(n)
         */
    }

    public static void main(String[] args) {

        // Create a list of intervals to represent meetings
        List<Interval> input = new ArrayList<Interval>() {
            {
                add(new Interval(4, 5));
                add(new Interval(2, 3));
                add(new Interval(2, 4));
                add(new Interval(3, 5));
            }
        };

        // Call the function to find the minimum meeting rooms required and print the result
        System.out.println(findMinimumMeetingRooms(input));
    }
}
