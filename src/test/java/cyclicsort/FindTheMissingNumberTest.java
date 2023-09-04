package cyclicsort;


import static org.junit.jupiter.api.Assertions.*;

import org.com.jai.pattrens.cyclicsort.FindTheMissingNumber;
import org.junit.jupiter.api.Test;

public class FindTheMissingNumberTest {

    @Test
    public void testFindMissingNumberBasic() {
        int[] arr = {3, 2, 4, 6, 1};
        int expected = 5;
        int result = FindTheMissingNumber.findMissingNumber(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testFindMissingNumberEmptyArray() {
        int[] arr = {};
        int expected = -1; // No missing number in an empty array
        int result = FindTheMissingNumber.findMissingNumber(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testFindMissingNumberSingleElementArray() {
        int[] arr = {1};
        int expected = -1; // No missing number in an array with a single element
        int result = FindTheMissingNumber.findMissingNumber(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testFindMissingNumberNoMissing() {
        int[] arr = {1, 2, 3, 4, 5};
        int expected = -1; // No missing number in the sequence
        int result = FindTheMissingNumber.findMissingNumber(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testFindMissingNumberMissingAtEnd() {
        int[] arr = {1, 2, 3, 4, 6};
        int expected = 5;
        int result = FindTheMissingNumber.findMissingNumber(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testFindMissingNumberMissingAtStart() {
        int[] arr = {2, 3, 4, 5, 6};
        int expected = 1;
        int result = FindTheMissingNumber.findMissingNumber(arr);
        assertEquals(expected, result);
    }

    @Test
    public void testFindMissingNumberNegativeValues() {
        int[] arr = {-3, -2, 0, 1};
        int expected = -1; // No missing number in the sequence with negative values
        int result = FindTheMissingNumber.findMissingNumber(arr);
        assertEquals(expected, result);
    }
}
