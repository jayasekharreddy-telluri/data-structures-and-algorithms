package binarysearch;

import com.binarysearch.RotationCount;
import org.junit.Test;

public class RotationCountTest {

    @Test
    public void testRotatedArray() {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        assertEquals(4, RotationCount.countRotations(arr));
    }

    @Test
    public void testNoRotation() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, RotationCount.countRotations(arr));
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {9};
        assertEquals(0, RotationCount.countRotations(arr));
    }

    @Test
    public void testCompletelyRotatedArray() {
        int[] arr = {3, 4, 5, 1, 2};
        assertEquals(3, RotationCount.countRotations(arr));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(0, RotationCount.countRotations(arr));
    }

    @Test
    public void testLargerRotatedArray() {
        int[] arr = {7, 8, 9, 10, 1, 2, 3, 4, 5, 6};
        assertEquals(4, RotationCount.countRotations(arr));
    }
}
