package slidingwindow;

import org.com.jai.pattrens.slidingwindow.FruitsIntoBaskets;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FruitsIntoBasketsTest {

    @Test
    void testValidInput() {
        char[] array = {'A', 'B', 'C', 'B', 'B', 'C'};
        int expected = 5; // Longest subarray containing at most 2 different fruits: {'B', 'C', 'B', 'B', 'C'}
        int result = FruitsIntoBaskets.optimalSolution(array);
        assertEquals(expected, result);
    }

    @Test
    void testAllSameFruit() {
        char[] array = {'A', 'A', 'A', 'A', 'A'};
        int expected = 5; // All fruits are the same, so we can pick all of them
        int result = FruitsIntoBaskets.optimalSolution(array);
        assertEquals(expected, result);
    }

    @Test
    void testEmptyArray() {
        char[] array = {};
        int expected = 0; // Empty array, no fruits to pick
        int result = FruitsIntoBaskets.optimalSolution(array);
        assertEquals(expected, result);
    }

    @Test
    void testNullArray() {
        char[] array = null;
        int expected = 0; // Null array, no fruits to pick
        int result = FruitsIntoBaskets.optimalSolution(array);
        assertEquals(expected, result);
    }

    @Test
    void testTwoFruitsOnly() {
        char[] array = {'A', 'B', 'A', 'B', 'A', 'B'};
        int expected = 6; // All fruits are either 'A' or 'B', we can pick all of them
        int result = FruitsIntoBaskets.optimalSolution(array);
        assertEquals(expected, result);
    }

    @Test
    void testAllFruitsUnique() {
        char[] array = {'A', 'B', 'C', 'D', 'E', 'F'};
        int expected = 2; // Only two fruits can be picked, e.g., {'A', 'B'}
        int result = FruitsIntoBaskets.optimalSolution(array);
        assertEquals(expected, result);
    }
}
