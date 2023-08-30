package mergeintervals;

import static org.junit.jupiter.api.Assertions.*;

import org.com.jai.pattrens.mergeintervals.Interval;
import org.com.jai.pattrens.mergeintervals.IntervalsIntersection;
import org.junit.jupiter.api.Test;

class IntervalsIntersectionTest {

    @Test
    void testIntervalIntersection() {
        IntervalsIntersection intervalsIntersection = new IntervalsIntersection();

        Interval[] input1 = {new Interval(1, 3), new Interval(5, 6), new Interval(7, 9)};
        Interval[] input2 = {new Interval(2, 3), new Interval(5, 7)};
        Interval[] expected = {new Interval(2, 3), new Interval(5, 6), new Interval(7, 7)};

        Interval[] result = intervalsIntersection.merge(input1, input2);
        assertArrayEquals(expected, result);
    }

    @Test
    void testNoOverlap() {
        IntervalsIntersection intervalsIntersection = new IntervalsIntersection();

        Interval[] input1 = {new Interval(1, 2), new Interval(4, 6)};
        Interval[] input2 = {new Interval(7, 8), new Interval(10, 12)};
        Interval[] expected = {};

        Interval[] result = intervalsIntersection.merge(input1, input2);
        assertArrayEquals(expected, result);
    }

    @Test
    void testEmptyArrays() {
        IntervalsIntersection intervalsIntersection = new IntervalsIntersection();

        Interval[] input1 = {};
        Interval[] input2 = {};
        Interval[] expected = {};

        Interval[] result = intervalsIntersection.merge(input1, input2);
        assertArrayEquals(expected, result);
    }

    @Test
    void testOneArrayEmpty() {
        IntervalsIntersection intervalsIntersection = new IntervalsIntersection();

        Interval[] input1 = {new Interval(1, 3)};
        Interval[] input2 = {};
        Interval[] expected = {};

        Interval[] result = intervalsIntersection.merge(input1, input2);
        assertArrayEquals(expected, result);
    }

    @Test
    void testNullInput() {
        IntervalsIntersection intervalsIntersection = new IntervalsIntersection();

        Interval[] result = intervalsIntersection.merge(null, null);
        assertNull(result);
    }
}
