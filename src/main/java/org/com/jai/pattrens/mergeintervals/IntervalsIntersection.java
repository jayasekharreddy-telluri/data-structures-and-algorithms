package org.com.jai.pattrens.mergeintervals;

import java.util.ArrayList;
import java.util.List;

public class IntervalsIntersection {

    public static Interval[] merge(Interval[] arr1, Interval[] arr2) {
        // Initialize a list to store the interval intersections
        List<Interval> intervalIntersection = new ArrayList<>();

        int i = 0, j = 0;

        // Loop through both input arrays
        while (i < arr1.length && j < arr2.length) {
            if ((arr1[i].start >= arr2[j].start && arr1[i].start <= arr2[j].end)
                    || (arr2[j].start >= arr1[i].start && arr2[j].start <= arr1[i].end)) {
                // If there's an overlap, add the intersection interval to the result
                intervalIntersection.add(new Interval(Math.max(arr1[i].start, arr2[j].start),
                        Math.min(arr1[i].end, arr2[j].end)));
            }

            // Move to the next interval in the array that ends earlier
            if (arr1[i].end < arr2[j].end) {
                i++;
            } else {
                j++;
            }
        }

        return intervalIntersection.toArray(new Interval[intervalIntersection.size()]);

        /*
                time complexity of this algorithm is O(m + n).
                space complexity is O(min(m, n)) in the worst case.
         */
    }

    public static void main(String[] args) {
        Interval[] input1 = new Interval[]{new Interval(1, 3), new Interval(5, 6), new Interval(7, 9)};
        Interval[] input2 = new Interval[]{new Interval(2, 3), new Interval(5, 7)};

        Interval[] result = merge(input1, input2);

        // Merge the intervals and print the results
        for (Interval inter : result) {
            System.out.print("[" + inter.start + "," + inter.end + "]");
        }
        System.out.println();
    }
}
