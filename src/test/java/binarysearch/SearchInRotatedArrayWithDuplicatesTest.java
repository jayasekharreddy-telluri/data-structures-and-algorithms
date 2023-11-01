package binarysearch;

import org.com.jai.pattrens.binarysearch.SearchInRotatedArrayWithDuplicates;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedArrayWithDuplicatesTest {

    @Test
    public void testKeyFoundInRotatedArrayWithDuplicates() {
        int[] arr = {3, 7, 3, 3, 3};
        int key = 7;
        int expectedIndex = 1;
        int actualIndex = SearchInRotatedArrayWithDuplicates.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testKeyNotFoundInRotatedArrayWithDuplicates() {
        int[] arr = {3, 7, 3, 3, 3};
        int key = 5;
        int expectedIndex = -1;
        int actualIndex = SearchInRotatedArrayWithDuplicates.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testKeyFoundAtStartOfRotatedArrayWithDuplicates() {
        int[] arr = {3, 3, 3, 7, 3};
        int key = 3;
        int expectedIndex = 0;
        int actualIndex = SearchInRotatedArrayWithDuplicates.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testKeyFoundAtEndOfRotatedArrayWithDuplicates() {
        int[] arr = {3, 7, 3, 3, 3};
        int key = 3;
        int expectedIndex = 3;
        int actualIndex = SearchInRotatedArrayWithDuplicates.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int key = 5;
        int expectedIndex = -1;
        int actualIndex = SearchInRotatedArrayWithDuplicates.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testArrayWithSingleElement() {
        int[] arr = {6};
        int key = 6;
        int expectedIndex = 0;
        int actualIndex = SearchInRotatedArrayWithDuplicates.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }
}
