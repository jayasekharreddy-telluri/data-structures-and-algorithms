package binarysearch;

import org.com.jai.pattrens.binarysearch.BitonicArrayMaximum;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitonicArrayMaximumTest {

    @Test
    public void testBitonicArrayMaximum() {
        int[] arr = {1, 3, 8, 12, 4, 2};
        assertEquals(12, BitonicArrayMaximum.findMax(arr));
    }

    @Test
    public void testBitonicArrayMaximumDescending() {
        int[] arr = {9, 7, 5, 4, 2, 1};
        assertEquals(9, BitonicArrayMaximum.findMax(arr));
    }

    @Test
    public void testBitonicArrayMaximumAscending() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(9, BitonicArrayMaximum.findMax(arr));
    }

    @Test
    public void testBitonicArrayMaximumSingleElement() {
        int[] arr = {6};
        assertEquals(6, BitonicArrayMaximum.findMax(arr));
    }

    @Test
    public void testBitonicArrayMaximumEmptyArray() {
        int[] arr = {};
        assertEquals(Integer.MIN_VALUE, BitonicArrayMaximum.findMax(arr));
    }

    @Test
    public void testBitonicArrayMaximumEqualElements() {
        int[] arr = {5, 5, 5, 5, 5};
        assertEquals(5, BitonicArrayMaximum.findMax(arr));
    }
}
