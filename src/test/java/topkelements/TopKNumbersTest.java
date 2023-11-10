package topkelements;

import org.com.jai.pattrens.topkelements.TopKNumbers;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TopKNumbersTest {

    @Test
    public void testTopKNumbers_GenericCase() {
        int[] arr = {1, 5, 3, 7, 2};
        int k = 3;
        List<Integer> expected = Arrays.asList(3, 5, 7);
        assertEquals(expected, TopKNumbers.topKNumbers(arr, k));
    }

    @Test
    public void testTopKNumbers_KEqualsArraySize() {
        int[] arr = {1, 5, 3, 7, 2};
        int k = 5;
        List<Integer> expected = Arrays.asList(1, 2, 3, 5, 7);
        assertEquals(expected, TopKNumbers.topKNumbers(arr, k));
    }

    @Test
    public void testTopKNumbers_KGreaterThanArraySize() {
        int[] arr = {1, 5, 3, 7, 2};
        int k = 10;
        List<Integer> expected = Arrays.asList(1, 2, 3, 5, 7);
        assertEquals(expected, TopKNumbers.topKNumbers(arr, k));
    }

    @Test
    public void testTopKNumbers_ArrayWithDuplicates() {
        int[] arr = {3, 1, 5, 3, 2};
        int k = 3;
        List<Integer> expected = Arrays.asList(3, 3, 5);
        assertEquals(expected, TopKNumbers.topKNumbers(arr, k));
    }

    @Test
    public void testTopKNumbers_NegativeNumbers() {
        int[] arr = {-1, -5, -3, -7, -2};
        int k = 3;
        List<Integer> expected = Arrays.asList(-3, -2, -1);
        assertEquals(expected, TopKNumbers.topKNumbers(arr, k));
    }

    @Test
    public void testTopKNumbers_AllNegativeNumbers() {
        int[] arr = {-1, -5, -3, -7, -2};
        int k = 5;
        List<Integer> expected = Arrays.asList(-7, -5, -3, -2, -1);
        assertEquals(expected, TopKNumbers.topKNumbers(arr, k));
    }

    @Test
    public void testTopKNumbers_EmptyArray() {
        int[] arr = {};
        int k = 3;
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, TopKNumbers.topKNumbers(arr, k));
    }
}
