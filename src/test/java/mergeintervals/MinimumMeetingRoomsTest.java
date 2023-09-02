package mergeintervals;

import org.com.jai.pattrens.mergeintervals.MinimumMeetingRooms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

public class MinimumMeetingRoomsTest {

    @Test
    public void testBasicCase() {
        // Create a list of intervals for a basic case
        List<MinimumMeetingRooms.Interval> input = new ArrayList<>();
        input.add(new MinimumMeetingRooms.Interval(4, 5));
        input.add(new MinimumMeetingRooms.Interval(2, 3));
        input.add(new MinimumMeetingRooms.Interval(2, 4));
        input.add(new MinimumMeetingRooms.Interval(3, 5));

        int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);

        // Expecting 2 meeting rooms will be required (2,3) and (3,5) overlap, so they need separate rooms
        assertEquals(2, result);
    }

    @Test
    public void testNoMeetings() {
        // Test when there are no meetings
        List<MinimumMeetingRooms.Interval> input = new ArrayList<>();

        int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);

        // Expecting 0 meeting rooms required because there are no meetings
        assertEquals(0, result);
    }

    @Test
    public void testOneMeeting() {
        // Test when there is only one meeting
        List<MinimumMeetingRooms.Interval> input = new ArrayList<>();
        input.add(new MinimumMeetingRooms.Interval(2, 5));

        int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);

        // Expecting 1 meeting room required because there is only one meeting
        assertEquals(1, result);
    }

    @Test
    public void testOverlappingMeetings() {
        // Test when there are overlapping meetings
        List<MinimumMeetingRooms.Interval> input = new ArrayList<>();
        input.add(new MinimumMeetingRooms.Interval(1, 3));
        input.add(new MinimumMeetingRooms.Interval(2, 4));
        input.add(new MinimumMeetingRooms.Interval(3, 5));

        int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);

        // Expecting 3 meeting rooms required as all meetings overlap and need separate rooms
        assertEquals(3, result);
    }

    @Test
    public void testMeetingsWithSameStartAndEnd() {
        // Test when there are meetings with the same start and end times
        List<MinimumMeetingRooms.Interval> input = new ArrayList<>();
        input.add(new MinimumMeetingRooms.Interval(1, 1));
        input.add(new MinimumMeetingRooms.Interval(2, 2));
        input.add(new MinimumMeetingRooms.Interval(3, 3));

        int result = MinimumMeetingRooms.findMinimumMeetingRooms(input);

        // Expecting 3 meeting rooms required because all meetings have the same start and end times
        assertEquals(3, result);
    }

}
