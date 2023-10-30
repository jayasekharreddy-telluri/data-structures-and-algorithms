package binarysearch;

import org.com.jai.pattrens.binarysearch.ArrayReader;
import org.com.jai.pattrens.binarysearch.SearchInASortedInfiniteArray;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SearchInASortedInfiniteArrayTest {

    @Test
    public void testKeyFoundInArray() {
        int[] data = {1, 3, 8, 10, 15};
        int key = 10;
        ArrayReader reader = new ArrayReader(data);
        int result = SearchInASortedInfiniteArray.search(reader, key);
        assertEquals(3, result);
    }

    @Test
    public void testKeyNotFoundInArray() {
        int[] data = {1, 3, 8, 10, 15};
        int key = 5;
        ArrayReader reader = new ArrayReader(data);
        int result = SearchInASortedInfiniteArray.search(reader, key);
        assertEquals(-1, result);
    }

    @Test
    public void testKeySmallerThanAllElements() {
        int[] data = {1, 3, 8, 10, 15};
        int key = 0;
        ArrayReader reader = new ArrayReader(data);
        int result = SearchInASortedInfiniteArray.search(reader, key);
        assertEquals(-1, result);
    }

    @Test
    public void testKeyLargerThanAllElements() {
        int[] data = {1, 3, 8, 10, 15};
        int key = 20;
        ArrayReader reader = new ArrayReader(data);
        int result = SearchInASortedInfiniteArray.search(reader, key);
        assertEquals(-1, result);
    }

    @Test
    public void testEmptyArray() {
        int[] data = {};
        int key = 5;
        ArrayReader reader = new ArrayReader(data);
        int result = SearchInASortedInfiniteArray.search(reader, key);
        assertEquals(-1, result);
    }

    @Test
    public void testArrayWithOneElement() {
        int[] data = {7};
        int key = 7;
        ArrayReader reader = new ArrayReader(data);
        int result = SearchInASortedInfiniteArray.search(reader, key);
        assertEquals(0, result);
    }
}
