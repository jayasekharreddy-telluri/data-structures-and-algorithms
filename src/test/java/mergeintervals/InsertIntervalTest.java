package mergeintervals;


import static org.junit.jupiter.api.Assertions.*;

import org.com.jai.pattrens.mergeintervals.InsertInterval;
import org.com.jai.pattrens.mergeintervals.Interval;
import org.junit.jupiter.api.Test;
import java.util.List;

class InsertIntervalTest {

    @Test
    void testInsertIntoEmptyList() {
        InsertInterval insertInterval = new InsertInterval();

        List<Interval> intervals = List.of();
        Interval newInterval = new Interval(1, 5);

        List<Interval> merged = insertInterval.insert(intervals, newInterval);
        assertEquals(List.of(new Interval(1, 5)), merged);
    }

    @Test
    void testInsertNullIntoEmptyList() {
        InsertInterval insertInterval = new InsertInterval();

        List<Interval> intervals = List.of();
        List<Interval> merged = insertInterval.insert(intervals, null);
        assertEquals(intervals, merged);
    }

    @Test
    void testInsertIntoNonEmptyList() {
        InsertInterval insertInterval = new InsertInterval();

        List<Interval> intervals = List.of(new Interval(1, 3), new Interval(6, 9));
        Interval newInterval = new Interval(4, 7);

        List<Interval> merged = insertInterval.insert(intervals, newInterval);
        assertEquals(List.of(new Interval(1, 3), new Interval(4, 9)), merged);
    }

    @Test
    void testInsertNullIntoNonEmptyList() {
        InsertInterval insertInterval = new InsertInterval();

        List<Interval> intervals = List.of(new Interval(1, 3), new Interval(6, 9));
        List<Interval> merged = insertInterval.insert(intervals, null);
        assertEquals(intervals, merged);
    }

    @Test
    void testInsertWithNoOverlap() {
        InsertInterval insertInterval = new InsertInterval();

        List<Interval> intervals = List.of(new Interval(1, 3), new Interval(6, 9));
        Interval newInterval = new Interval(10, 12);

        List<Interval> merged = insertInterval.insert(intervals, newInterval);
        assertEquals(List.of(new Interval(1, 3), new Interval(6, 9), new Interval(10, 12)), merged);
    }

    @Test
    void testInsertWithNullInterval() {
        InsertInterval insertInterval = new InsertInterval();

        List<Interval> intervals = List.of(new Interval(1, 3), new Interval(6, 9));
        Interval newInterval = null;

        List<Interval> merged = insertInterval.insert(intervals, newInterval);
        assertEquals(intervals, merged);
    }

    @Test
    void testInsertNullIntoEmptyListTwice() {
        InsertInterval insertInterval = new InsertInterval();

        List<Interval> intervals = List.of();
        List<Interval> merged = insertInterval.insert(intervals, null);
        merged = insertInterval.insert(merged, null);
        assertEquals(intervals, merged);
    }
}
