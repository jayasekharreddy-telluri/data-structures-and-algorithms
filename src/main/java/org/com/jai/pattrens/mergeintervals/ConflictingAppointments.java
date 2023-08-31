package org.com.jai.pattrens.mergeintervals;

import java.util.Arrays;
import java.util.Collections;

public class ConflictingAppointments {

    public static boolean canAttendAllApoinments(Interval[] intervals) {

        if (intervals == null || intervals.length < 2) {
            return true;
        }
        // Sort the intervals based on their start time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a.start, b.start));

        // Check if any two intervals overlap
        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i].start < intervals[i - 1].end) {
                return false;
            }
        }

        return true;
        // Time complexity: O(n log n) due to sorting
        // Space complexity: O(n) due to the use of an array to store the intervals

    }

    public static void main(String[] args) {

        // Test case 1
        Interval[] input1 = new Interval[]{new Interval(6, 7), new Interval(2, 4), new Interval(8, 12)};
        boolean result1 = canAttendAllApoinments(input1);
        System.out.println(result1); // false

        // Test case 2
        Interval[] input2 = new Interval[]{new Interval(1, 3), new Interval(2, 4), new Interval(5, 7)};
        boolean result2 = canAttendAllApoinments(input2);
        System.out.println(result2); // false


    }
}

