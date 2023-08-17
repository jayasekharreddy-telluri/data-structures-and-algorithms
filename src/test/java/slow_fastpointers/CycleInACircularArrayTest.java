package slow_fastpointers;

import org.com.jai.pattrens.slow_fastpointers.CycleInACircularArray;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CycleInACircularArrayTest {

    @Test
    void testCircularArrayWithPositiveLoop() {
        int[] arr = {2, 1, -1, -2};
        assertTrue(CycleInACircularArray.checkIfCircularArrayHasCycle(arr));
    }

    @Test
    void testCircularArrayWithNegativeLoop() {
        int[] arr = {-2, -1, 1, 2};
        assertTrue(CycleInACircularArray.checkIfCircularArrayHasCycle(arr));
    }

    @Test
    void testNonCircularArray() {
        int[] arr = {1, 2, 3, 4};
        assertFalse(CycleInACircularArray.checkIfCircularArrayHasCycle(arr));
    }

    @Test
    void testSingleElementArray() {
        int[] arr = {0};
        assertFalse(CycleInACircularArray.checkIfCircularArrayHasCycle(arr));
    }

    @Test
    void testZeroElementArray() {
        int[] arr = {};
        assertFalse(CycleInACircularArray.checkIfCircularArrayHasCycle(arr));
    }

    @Test
    void testArrayWithZeroValues() {
        int[] arr = {0, 0, 0, 0};
        assertFalse(CycleInACircularArray.checkIfCircularArrayHasCycle(arr));
    }

    @Test
    void testArrayWithPositiveAndNegativeZeros() {
        int[] arr = {0, 1, -1, 0};
        assertFalse(CycleInACircularArray.checkIfCircularArrayHasCycle(arr));
    }

    @Test
    void testArrayWithMixedDirections() {
        int[] arr = {-1, 2, -3, 4};
        assertFalse(CycleInACircularArray.checkIfCircularArrayHasCycle(arr));
    }

    // Add more test cases to cover different scenarios, like larger arrays, more complex loops, etc.
}
