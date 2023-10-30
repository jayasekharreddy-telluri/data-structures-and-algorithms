package binarysearch;

import org.com.jai.pattrens.binarysearch.MinimumDifferenceElement;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MinimumDifferenceElementTest {

    @Test
    public void testKeyInRange() {
        int[] arr = {1, 3, 8, 10, 15};
        int key = 12;
        assertEquals(10, MinimumDifferenceElement.searchMinimumDifferenceElement(arr, key));
    }

    @Test
    public void testKeySmallerThanAllElements() {
        int[] arr = {1, 3, 8, 10, 15};
        int key = 0;
        assertEquals(1, MinimumDifferenceElement.searchMinimumDifferenceElement(arr, key));
    }

    @Test
    public void testKeyLargerThanAllElements() {
        int[] arr = {1, 3, 8, 10, 15};
        int key = 20;
        assertEquals(15, MinimumDifferenceElement.searchMinimumDifferenceElement(arr, key));
    }

    @Test
    public void testKeyEqualToElement() {
        int[] arr = {1, 3, 8, 10, 15};
        int key = 8;
        assertEquals(8, MinimumDifferenceElement.searchMinimumDifferenceElement(arr, key));
    }

    @Test
    public void testEmptyArray() {
        int[] arr = {};
        int key = 5;
        assertEquals(-1, MinimumDifferenceElement.searchMinimumDifferenceElement(arr, key));
    }

    @Test
    public void testArrayWithOneElement() {
        int[] arr = {7};
        int key = 7;
        assertEquals(7, MinimumDifferenceElement.searchMinimumDifferenceElement(arr, key));
    }
}
