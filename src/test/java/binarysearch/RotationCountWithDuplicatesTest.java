package binarysearch;

import com.binarysearch.RotationCountWithDuplicates;
import org.junit.Test;

public class RotationCountWithDuplicatesTest {

    @Test
    public void testRotatedArrayWithDuplicates() {
        int[] arr = {4, 5, 5, 6, 6, 7, 0, 0, 1, 2, 2};
        assertEquals(6, RotationCountWithDuplicates.countRotations(arr));
    }

    @Test
    public void testNoRotation() {
        int[] arr = {1, 2, 3, 4, 5};
        assertEquals(0, RotationCountWithDuplicates.countRotations(arr));
    }

    @Test
    public void testSingleElementArray() {
        int[] arr = {9};
        assertEquals(0, RotationCountWithDuplicates.countRotations(arr));
    }

    @Test
    public void testCompletelyRotatedArrayWithDuplicates() {
        int[] arr = {3, 3, 4, 5, 1, 1, 2, 2};
        assertEquals(4, RotationCountWithDuplicates.countRotations(arr));
    }

    @Test
    public void testArrayWithOnlyDuplicates() {
        int[] arr = {7, 7, 7, 7, 7, 7, 7};
        assertEquals(0, RotationCountWithDuplicates.countRotations(arr));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        assertEquals(0, RotationCountWithDuplicates.countRotations(arr));
    }

    @Test
    public void testLargerRotatedArrayWithDuplicates() {
        int[] arr = {5, 5, 6, 6, 7, 8, 9, 9, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(8, RotationCountWithDuplicates.countRotations(arr));
    }
}
