
import org.jai.pattrens.twopointers.RemoveElement;
import org.junit.Assert;
import org.junit.Test;

public class RemoveElementTest {

    @Test
    public void testOptimalSolution() {
        int[] nums = {2, 11, 2, 2, 1};
        int value = 2;

        int result = RemoveElement.optimalSolution(nums, value);

        // After removing all instances of value 2, the new length of the array should be 2
        Assert.assertEquals(2, result);
    }

    @Test
    public void testOptimalSolution_AllElementsRemoved() {
        int[] nums = {2, 2, 2, 2, 2};
        int value = 2;

        int result = RemoveElement.optimalSolution(nums, value);

        // Since all elements are removed, the new length of the array should be 0
        Assert.assertEquals(0, result);
    }

    @Test
    public void testOptimalSolution_NoElementRemoved() {
        int[] nums = {1, 3, 5, 7, 9};
        int value = 0;

        int result = RemoveElement.optimalSolution(nums, value);

        // No elements are removed, so the new length of the array should be the same as the original length
        Assert.assertEquals(nums.length, result);
    }
}
