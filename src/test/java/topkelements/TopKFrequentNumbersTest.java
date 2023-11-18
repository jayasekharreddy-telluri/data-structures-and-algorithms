package topkelements;

import org.com.jai.pattrens.topkelements.TopKFrequentNumbers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TopKFrequentNumbersTest {

    @Test
    public void testFindTopFrequentNumbersWithSmallK() {
        int[] arr = {5, 12, 11, 3, 11};
        int k = 2;
        assertEquals(List.of(11, 5), TopKFrequentNumbers.findTopFrequentNumbers(arr, k),
                "Top 2 frequent numbers for {5, 12, 11, 3, 11} should be {11, 5}.");
    }

    @Test
    public void testFindTopFrequentNumbersWithEqualK() {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 2;
        assertEquals(List.of(1, 2), TopKFrequentNumbers.findTopFrequentNumbers(arr, k),
                "Top 2 frequent numbers for {1, 1, 1, 2, 2, 3} should be {1, 2}.");
    }

    @Test
    public void testFindTopFrequentNumbersWithGreaterK() {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 3;
        assertEquals(List.of(1, 2, 3), TopKFrequentNumbers.findTopFrequentNumbers(arr, k),
                "Top 3 frequent numbers for {1, 1, 1, 2, 2, 3} should be {1, 2, 3}.");
    }

    @Test
    public void testFindTopFrequentNumbersWithUniqueNumbers() {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 5;
        assertEquals(List.of(1, 2, 3, 4, 5), TopKFrequentNumbers.findTopFrequentNumbers(arr, k),
                "All numbers are unique; top 5 frequent numbers should be the same as the input array.");
    }

    @Test
    public void testFindTopFrequentNumbersWithEmptyArray() {
        int[] arr = {};
        int k = 0;
        assertEquals(List.of(), TopKFrequentNumbers.findTopFrequentNumbers(arr, k),
                "Empty array; top 0 frequent numbers should be an empty list.");
    }

    @Test
    public void testFindTopFrequentNumbersWithZeroK() {
        int[] arr = {1, 1, 1, 2, 2, 3};
        int k = 0;
        assertEquals(List.of(), TopKFrequentNumbers.findTopFrequentNumbers(arr, k),
                "Non-empty array; top 0 frequent numbers should be an empty list.");
    }
}
