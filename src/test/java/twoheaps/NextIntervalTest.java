package twoheaps;

import org.com.jai.pattrens.twoheaps.Intervals;
import org.com.jai.pattrens.twoheaps.NextInterval;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class NextIntervalTest {

    @Test
    public void testFindNextInterval_NormalCase() {
        Intervals[] Intervals = {new Intervals(3, 4), new Intervals(1, 5), new Intervals(4, 6)};
        int[] expected = {2, -1, -1}; // Expected results for each interval

        int[] result = NextInterval.findNextInterval(Intervals);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindNextInterval_SingleInterval() {
        Intervals[] Intervals = {new Intervals(1, 5)};
        int[] expected = {-1}; // Only one interval, so there's no next interval

        int[] result = NextInterval.findNextInterval(Intervals);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindNextInterval_NoNextInterval() {
        Intervals[] Intervals = {new Intervals(5, 10), new Intervals(1, 4)};
        int[] expected = {-1, -1}; // No next intervals for both intervals

        int[] result = NextInterval.findNextInterval(Intervals);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindNextInterval_DuplicateStartTimes() {
        Intervals[] Intervals = {new Intervals(1, 3), new Intervals(1, 5), new Intervals(2, 4)};
        int[] expected = {1, 2, -1}; // Next intervals for each interval

        int[] result = NextInterval.findNextInterval(Intervals);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testFindNextInterval_DuplicateEndTimes() {
        Intervals[] Intervals = {new Intervals(1, 3), new Intervals(2, 4), new Intervals(3, 4)};
        int[] expected = {1, -1, -1}; // Next intervals for each interval

        int[] result = NextInterval.findNextInterval(Intervals);
        assertArrayEquals(expected, result);
    }
}
