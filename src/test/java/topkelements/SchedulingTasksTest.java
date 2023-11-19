package topkelements;

import org.com.jai.pattrens.topkelements.SchedulingTasks;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchedulingTasksTest {

    @Test
    public void testSchedulingTasks() {
        char[] tasks1 = {'a', 'a', 'a', 'b', 'c', 'c'};
        assertEquals(7, SchedulingTasks.schedulingTasks(tasks1, 2));

        char[] tasks2 = {'a', 'a', 'a', 'b', 'b', 'b'};
        assertEquals(10, SchedulingTasks.schedulingTasks(tasks2, 2));

        char[] tasks3 = {'a', 'a', 'a', 'b', 'b', 'b'};
        assertEquals(16, SchedulingTasks.schedulingTasks(tasks3, 0));


        char[] tasks4 = {'a', 'b', 'c', 'd'};
        assertEquals(4, SchedulingTasks.schedulingTasks(tasks4, 5));

        char[] tasks5 = {'a', 'a', 'a', 'b', 'b', 'b'};
        assertEquals(6, SchedulingTasks.schedulingTasks(tasks5, 0));

        char[] tasks6 = {};
        assertEquals(0, SchedulingTasks.schedulingTasks(tasks6, 3));

        char[] tasks7 = {'a', 'a', 'b', 'b'};
        assertEquals(4, SchedulingTasks.schedulingTasks(tasks7, -1));
    }
}
