package binarysearch;

import org.com.jai.pattrens.binarysearch.SearchBitonicArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchBitonicArrayTest {

    @Test
    public void testBitonicArrayMaxInAscendingPart() {
        int[] arr = {1, 3, 6, 8, 10, 7, 4};
        int key = 8;
        assertEquals(3, SearchBitonicArray.search(arr, key));
    }

    @Test
    public void testBitonicArrayMaxInDescendingPart() {
        int[] arr = {10, 9, 8, 7, 6, 5, 4};
        int key = 9;
        assertEquals(1, SearchBitonicArray.search(arr, key));
    }

    @Test
    public void testBitonicArrayMaxInSingleElement() {
        int[] arr = {5};
        int key = 5;
        assertEquals(0, SearchBitonicArray.search(arr, key));
    }

    @Test
    public void testBitonicArrayMaxNotInArray() {
        int[] arr = {1, 3, 6, 8, 10, 7, 4};
        int key = 12;
        assertEquals(-1, SearchBitonicArray.search(arr, key));
    }

    @Test
    public void testBitonicArrayMaxInEmptyArray() {
        int[] arr = {};
        int key = 5;
        assertEquals(-1, SearchBitonicArray.search(arr, key));
    }

    @Test
    public void testNonBitonicArray() {
        int[] arr = {1, 2, 3, 4, 5};
        int key = 3;
        assertEquals(2, SearchBitonicArray.search(arr, key));
    }
}
