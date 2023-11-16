package topkelements;

import org.com.jai.pattrens.topkelements.KClosestNumbers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KClosestNumbersTest {

    @Test
    public void testFindClosestNumbers_GenericCase() {
        int[] arr = {1, 3, 6, 7, 9};
        int k = 3;
        int x = 5;
        List<Integer> expected = Arrays.asList(3, 6, 7);
        assertEquals(expected, KClosestNumbers.findClosestNumbers(arr, k, x));
    }

    @Test
    public void testFindClosestNumbers_AllEqualToX() {
        int[] arr = {5, 5, 5, 5, 5};
        int k = 3;
        int x = 5;
        List<Integer> expected = Arrays.asList(5, 5, 5);
        assertEquals(expected, KClosestNumbers.findClosestNumbers(arr, k, x));
    }

    @Test
    public void testFindClosestNumbers_KGreaterThanArraySize() {
        int[] arr = {1, 2, 4, 5, 7};
        int k = 10;
        int x = 6;
        List<Integer> expected = Arrays.asList(4, 5, 7, 1, 2);
        assertEquals(expected, KClosestNumbers.findClosestNumbers(arr, k, x));
    }

    @Test
    public void testFindClosestNumbers_EmptyArray() {
        int[] arr = {};
        int k = 3;
        int x = 5;
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, KClosestNumbers.findClosestNumbers(arr, k, x));
    }

    @Test
    public void testFindClosestNumbers_SingleElementArray() {
        int[] arr = {7};
        int k = 1;
        int x = 7;
        List<Integer> expected = Arrays.asList(7);
        assertEquals(expected, KClosestNumbers.findClosestNumbers(arr, k, x));
    }

    @Test
    public void testFindClosestNumbers_XSmallerThanAllElements() {
        int[] arr = {8, 9, 10};
        int k = 2;
        int x = 5;
        List<Integer> expected = Arrays.asList(8, 9);
        assertEquals(expected, KClosestNumbers.findClosestNumbers(arr, k, x));
    }
}
