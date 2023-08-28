package mergeintervals;

import static org.junit.jupiter.api.Assertions.*;

import org.com.jai.pattrens.mergeintervals.Interval;
import org.com.jai.pattrens.mergeintervals.MergeIntervals;
import org.junit.jupiter.api.Test;
import java.util.List;

class MergeIntervalsTest {

    @Test
    void testBasicMerge() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        List<Interval> input = List.of(new Interval(1, 4), new Interval(2, 5), new Interval(7, 9));
        List<Interval> merged = mergeIntervals.merge(input);
        List<Interval> expected = List.of(new Interval(1, 5), new Interval(7, 9));
        assertEquals(expected, merged);
    }

    @Test
    void testNoMergeNeeded() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        List<Interval> input = List.of(new Interval(1, 3), new Interval(5, 7), new Interval(9, 11));
        List<Interval> merged = mergeIntervals.merge(input);
        assertEquals(input, merged);
    }

    @Test
    void testEmptyInput() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        List<Interval> input = List.of();
        List<Interval> merged = mergeIntervals.merge(input);
        assertEquals(input, merged);
    }

    @Test
    void testSingleInterval() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        List<Interval> input = List.of(new Interval(1, 5));
        List<Interval> merged = mergeIntervals.merge(input);
        assertEquals(input, merged);
    }

    @Test
    void testOverlappingIntervals() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        List<Interval> input = List.of(new Interval(1, 4), new Interval(2, 6), new Interval(5, 8));
        List<Interval> merged = mergeIntervals.merge(input);
        List<Interval> expected = List.of(new Interval(1, 8));
        assertEquals(expected, merged);
    }

    @Test
    void testNullInput() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        List<Interval> merged = mergeIntervals.merge(null);
        assertNull(merged);  // Assuming your code returns null for null input
    }

    @Test
    void testIntervalSpanningZero() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        List<Interval> input = List.of(new Interval(0, 5));
        List<Interval> merged = mergeIntervals.merge(input);
        assertEquals(input, merged);
    }

    @Test
    void testLargeIntervals() {
        MergeIntervals mergeIntervals = new MergeIntervals();

        List<Interval> input = List.of(new Interval(1, 1000), new Interval(500, 1500), new Interval(1200, 2000));
        List<Interval> merged = mergeIntervals.merge(input);
        List<Interval> expected = List.of(new Interval(1, 2000));
        assertEquals(expected, merged);
    }
}
