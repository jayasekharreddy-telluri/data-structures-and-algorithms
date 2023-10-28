package binarysearch;

import org.com.jai.pattrens.binarysearch.OrderAgnosticBinarySearch;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderAgnosticBinarySearchTest {

    @Test
    public void testAscendingOrder() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        int key = 5;
        assertEquals(4, OrderAgnosticBinarySearch.search(nums, key));
    }

    @Test
    public void testDescendingOrder() {
        int[] nums = {8, 7, 6, 5, 4, 3, 2, 1};
        int key = 6;
        assertEquals(2, OrderAgnosticBinarySearch.search(nums, key));
    }

    @Test
    public void testUnsortedArray() {
        int[] nums = {4, 7, 1, 8, 2, 6, 3, 5};
        int key = 8;
        assertEquals(-1, OrderAgnosticBinarySearch.search(nums, key));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int key = 10;
        assertEquals(-1, OrderAgnosticBinarySearch.search(nums, key));
    }

    @Test
    public void testKeyNotFound() {
        int[] nums = {1, 3, 5, 7, 9};
        int key = 8;
        assertEquals(-1, OrderAgnosticBinarySearch.search(nums, key));
    }

    @Test
    public void testKeyFoundAtStart() {
        int[] nums = {10, 20, 30, 40, 50};
        int key = 10;
        assertEquals(0, OrderAgnosticBinarySearch.search(nums, key));
    }

    @Test
    public void testKeyFoundAtEnd() {
        int[] nums = {10, 20, 30, 40, 50};
        int key = 50;
        assertEquals(4, OrderAgnosticBinarySearch.search(nums, key));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-5, -3, -1, 0, 2, 4, 6};
        int key = -3;
        assertEquals(1, OrderAgnosticBinarySearch.search(nums, key));
    }
}
