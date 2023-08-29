package org.com.jai.pattrens.mergeintervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertInterval {

    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // If the list is empty or null, simply add the newInterval and return
        if (intervals == null || intervals.isEmpty()) {
            if (newInterval != null) {
                return Arrays.asList(newInterval);
            } else {
                return new ArrayList<>(); // Return an empty list for null newInterval
            }
        }

        // If newInterval is null, return the original intervals list
        if (newInterval == null) {
            return intervals;
        }

        List<Interval> mergedIntervals = new ArrayList<>();

        int i = 0;

        // Add intervals before the newInterval
        while (i < intervals.size() && intervals.get(i).end < newInterval.start) {
            mergedIntervals.add(intervals.get(i++));
        }

        // Merge overlapping intervals with newInterval
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
            newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
            i++;
        }

        // Add the merged newInterval
        mergedIntervals.add(newInterval);

        // Add remaining intervals
        while (i < intervals.size()) {
            mergedIntervals.add(intervals.get(i++));
        }

        return mergedIntervals;
    }

    public static void main(String[] args) {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));

        Interval newInterval = new Interval(6, 8);

        // Insert the newInterval and print the results
        for (Interval inter : insert(input, newInterval)) {
            System.out.print("[" + inter.start + "," + inter.end + "]");
        }
        System.out.println();
    }
}
