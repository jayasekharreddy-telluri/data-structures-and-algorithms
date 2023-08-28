package org.com.jai.pattrens.mergeintervals;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;


public class MergeIntervals {

    public static List<Interval> merge(List<Interval> intervals) {
        // If there are less than 2 intervals, no merging needed
        if (intervals.size() < 2) {
            return intervals;
        }

        // Sort intervals based on their start values
        Collections.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        List<Interval> mergedIntervals = new ArrayList<>();

        Iterator<Interval> iteratorIntervals = intervals.iterator();

        Interval interval = iteratorIntervals.next();

        int start = interval.start;
        int end = interval.end;

        while (iteratorIntervals.hasNext()) {
            interval = iteratorIntervals.next();

            if (interval.start <= end) {
                // Merge overlapping intervals
                end = Math.max(end, interval.end);
            } else {
                // Add the merged interval and reset the start and end
                mergedIntervals.add(new Interval(start, end));
                start = interval.start;
                end = interval.end;
            }
        }

        // Add the last merged interval
        mergedIntervals.add(new Interval(start, end));

        return mergedIntervals;
    }

    public static void main(String[] args) {
        List<Interval> input = new ArrayList<>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));

        // Merge the intervals and print the results
        for (Interval inter : merge(input)) {
            System.out.print("[" + inter.start + "," + inter.end + "]");
        }
        System.out.println();
    }
}
