package binarysearch;


import org.com.jai.pattrens.binarysearch.SearchInRotatedArray;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchInRotatedArrayTest {

    @Test
    public void testKeyFoundInRotatedArray() {
        int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int key = 6;
        int expectedIndex = 2;
        int actualIndex = SearchInRotatedArray.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testKeyNotFoundInRotatedArray() {
        int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int key = 10;
        int expectedIndex = -1;
        int actualIndex = SearchInRotatedArray.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testKeyFoundAtStartOfRotatedArray() {
        int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int key = 4;
        int expectedIndex = 0;
        int actualIndex = SearchInRotatedArray.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testKeyFoundAtEndOfRotatedArray() {
        int[] arr = {4, 5, 6, 7, 8, 9, 1, 2, 3};
        int key = 3;
        int expectedIndex = 8;
        int actualIndex = SearchInRotatedArray.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int key = 5;
        int expectedIndex = -1;
        int actualIndex = SearchInRotatedArray.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testArrayWithSingleElement() {
        int[] arr = {6};
        int key = 6;
        int expectedIndex = 0;
        int actualIndex = SearchInRotatedArray.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testKeyNotFoundInSortedArray() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int key = 9;
        int expectedIndex = -1;
        int actualIndex = SearchInRotatedArray.search(arr, key);
        assertEquals(expectedIndex, actualIndex);
    }
}
