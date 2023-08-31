package mergeintervals;


import org.com.jai.pattrens.mergeintervals.ConflictingAppointments;
import org.com.jai.pattrens.mergeintervals.Interval;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConflictingAppointmentsTest {

    @Test
    void testCanAttendAllApoinmentsWithOverlappingIntervals() {
        Interval[] input = new Interval[]{new Interval(6, 7), new Interval(2, 4), new Interval(8, 12)};
        boolean result = ConflictingAppointments.canAttendAllApoinments(input);
        assertFalse(result);
    }

    @Test
    void testCanAttendAllApoinmentsWithNonOverlappingIntervals() {
        Interval[] input = new Interval[]{new Interval(1, 2), new Interval(3, 4), new Interval(5, 6)};
        boolean result = ConflictingAppointments.canAttendAllApoinments(input);
        assertTrue(result);
    }


    @Test
    void testCanAttendAllApoinmentsWithEmptyInput() {
        Interval[] input = new Interval[]{};
        assertTrue(ConflictingAppointments.canAttendAllApoinments(input));
    }

    @Test
    void testCanAttendAllApoinmentsWithOneInterval() {
        Interval[] input = new Interval[]{new Interval(1, 2)};
        assertTrue(ConflictingAppointments.canAttendAllApoinments(input));
    }

}
