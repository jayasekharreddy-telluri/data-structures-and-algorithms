package twopointeres;

import org.com.jai.pattrens.twopointers.SubarrayProductLessThanK;
import org.junit.Test;
import static org.junit.Assert.*;

public class SubarrayProductLessThanKTest {

    @Test
    public void testRegularInput() {
        int[] nums = {10, 5, 2, 6};
        int k = 100;
        int expected = 8; // There are 8 subarrays with product less than 100
        assertEquals(expected, SubarrayProductLessThanK.optimalApproach(nums, k));
    }

    @Test
    public void testAllElementsLessThanK() {
        int[] nums = {1, 2, 3, 4, 5};
        int k = 10;
        int expected = 15; // There are 15 subarrays with product less than 10
        assertEquals(expected, SubarrayProductLessThanK.optimalApproach(nums, k));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int k = 5;
        int expected = 0; // There are no subarrays in an empty array
        assertEquals(expected, SubarrayProductLessThanK.optimalApproach(nums, k));
    }

    @Test
    public void testArrayWithNegativeNumbers() {
        int[] nums = {-2, 3, -4, -5};
        int k = 20;
        int expected = 10; // There are 10 subarrays with product less than 20
        assertEquals(expected, SubarrayProductLessThanK.optimalApproach(nums, k));
    }

    @Test
    public void testArrayWithSingleElement() {
        int[] nums = {5};
        int k = 2;
        int expected = 0; // There are no subarrays with product less than 2
        assertEquals(expected, SubarrayProductLessThanK.optimalApproach(nums, k));
    }
}
