package slidingwindow;


import org.com.jai.pattrens.slidingwindow.SmallestSubarrayWithAGivenSum;
import org.junit.Assert;
import org.junit.Test;

public class SmallestSubarrayWithAGivenSumTest {

    @Test
    public void testOne(){
        int[] nums = {2, 1, 5, 2, 8};
        int sum = 7;
        int expected = 1;
        Assert.assertEquals(expected, SmallestSubarrayWithAGivenSum.optimalSolution(nums,sum));
    }
    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int sum = 5;
        int expected = 0;
        Assert.assertEquals(expected, SmallestSubarrayWithAGivenSum.optimalSolution(nums, sum));
    }
}
