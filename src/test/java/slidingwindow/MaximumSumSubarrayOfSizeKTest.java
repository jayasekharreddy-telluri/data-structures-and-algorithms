package slidingwindow;


import org.com.jai.pattrens.slidingwindow.MaximumSumSubarrayOfSizeK;
import org.junit.Assert;
import org.junit.Test;

public class MaximumSumSubarrayOfSizeKTest {

    @Test
    public void testOne(){
        int[] nums = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int expected = 9;
        Assert.assertEquals(9, MaximumSumSubarrayOfSizeK.optimalSolution(nums,k));
    }

    @Test
    public void testTwo(){
        int[] nums = {-2, -5, -1, -3, -4};
        int k = 2;
        int expected = -3;
        Assert.assertEquals(expected, MaximumSumSubarrayOfSizeK.optimalSolution(nums,k));
    }

    @Test
    public void testThree() {
        int[] nums = {5};
        int k = 1;
        int expected = 5;
        Assert.assertEquals(expected, MaximumSumSubarrayOfSizeK.optimalSolution(nums, k));
    }
}
