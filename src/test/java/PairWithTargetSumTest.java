import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PairWithTargetSumTest {

    @Test
    public void testBruteForceSolution() {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] expected = {0, 1};
        int[] result = PairWithTargetSum.bruteForceSolution(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testOptimalSolution() {
        int[] nums = {};
        int target = 9;
        int[] expected = {};
        int[] result = PairWithTargetSum.optimalSolution(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }

    @Test
    public void testNoPairFound() {
        int[] nums = {2, 7, 11, 15};
        int target = 5;
        int[] expected = {};
        int[] result = PairWithTargetSum.optimalSolution(nums, target);
        Assertions.assertArrayEquals(expected, result);
    }

}
