package bitwisexor;

import org.com.jai.pattrens.bitwisexor.SingleNumber;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberTest {

    @Test
    public void testSingleNumberInMiddle() {
        int[] arr = {1, 4, 2, 1, 3, 2, 3};
        int expected = 4;
        int actual = SingleNumber.findSingleNumber(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleNumberAtStart() {
        int[] arr = {5, 3, 3, 2, 2, 4, 4};
        int expected = 5;
        int actual = SingleNumber.findSingleNumber(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testSingleNumberAtEnd() {
        int[] arr = {3, 3, 2, 2, 4, 4, 6};
        int expected = 6;
        int actual = SingleNumber.findSingleNumber(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int expected = 0; // No single number in an empty array
        int actual = SingleNumber.findSingleNumber(arr);
        assertEquals(expected, actual);
    }

    @Test
    public void testArrayWithSingleElement() {
        int[] arr = {7};
        int expected = 7; // Single number is the only element in the array
        int actual = SingleNumber.findSingleNumber(arr);
        assertEquals(expected, actual);
    }
}
