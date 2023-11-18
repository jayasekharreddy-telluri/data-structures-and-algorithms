package topkelements;

import org.com.jai.pattrens.topkelements.SumOfElements;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfElementsTest {

    @Test
    public void testFindSumOfElements_GenericCase() {
        int[] arr = {3, 5, 8, 7};
        int k1 = 1;
        int k2 = 4;
        assertEquals(20, SumOfElements.findSumOfElements(arr, k1, k2));
    }

    @Test
    public void testFindSumOfElements_K1EqualToK2() {
        int[] arr = {3, 5, 8, 7};
        int k1 = 2;
        int k2 = 2;
        assertEquals(0, SumOfElements.findSumOfElements(arr, k1, k2));
    }

    @Test
    public void testFindSumOfElements_EmptyArray() {
        int[] arr = {};
        int k1 = 0;
        int k2 = 2;
        assertEquals(0, SumOfElements.findSumOfElements(arr, k1, k2));
    }

    @Test
    public void testFindSumOfElements_K2GreaterThanArrayLength() {
        int[] arr = {3, 5, 8, 7};
        int k1 = 1;
        int k2 = 5;
        assertEquals(0, SumOfElements.findSumOfElements(arr, k1, k2));
    }

    @Test
    public void testFindSumOfElements_K1GreaterThanArrayLength() {
        int[] arr = {3, 5, 8, 7};
        int k1 = 5;
        int k2 = 8;
        assertEquals(0, SumOfElements.findSumOfElements(arr, k1, k2));
    }

    @Test
    public void testFindSumOfElements_AllElementsSame() {
        int[] arr = {4, 4, 4, 4};
        int k1 = 1;
        int k2 = 4;
        assertEquals(4, SumOfElements.findSumOfElements(arr, k1, k2));
    }
}
