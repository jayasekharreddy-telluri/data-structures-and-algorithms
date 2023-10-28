package binarysearch;

import org.com.jai.pattrens.binarysearch.CeilingOfANumber;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CeilingOfANumberTest {

    @Test
    public void testCeilingFoundInArray() {
        int[] nums = {1, 2, 6, 8, 19};
        int key = 5;
        assertEquals(2, CeilingOfANumber.searchCeilingOfANumber(nums, key));
    }

    @Test
    public void testCeilingFoundAtStart() {
        int[] nums = {1, 2, 6, 8, 19};
        int key = 0;
        assertEquals(0, CeilingOfANumber.searchCeilingOfANumber(nums, key));
    }

    @Test
    public void testCeilingFoundAtEnd() {
        int[] nums = {1, 2, 6, 8, 19};
        int key = 20;
        assertEquals(-1, CeilingOfANumber.searchCeilingOfANumber(nums, key));
    }

    @Test
    public void testCeilingFoundInMiddle() {
        int[] nums = {1, 2, 6, 8, 19};
        int key = 4;
        assertEquals(2, CeilingOfANumber.searchCeilingOfANumber(nums, key));
    }

    @Test
    public void testKeyGreaterThanLargestNumber() {
        int[] nums = {1, 2, 6, 8, 19};
        int key = 25;
        assertEquals(-1, CeilingOfANumber.searchCeilingOfANumber(nums, key));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int key = 10;
        assertEquals(-1, CeilingOfANumber.searchCeilingOfANumber(nums, key));
    }

    @Test
    public void testKeyEqualsNumberInArray() {
        int[] nums = {1, 2, 6, 8, 19};
        int key = 6;
        assertEquals(2, CeilingOfANumber.searchCeilingOfANumber(nums, key));
    }
}
