import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {

    @Test
    public void testOptimalSolution() {
        int[] nums = {1, 1, 2};
        int expectedLength = 2;
        int[] expectedArray = {1, 2};

        int result = RemoveDuplicates.optimalSolution(nums);
        Assertions.assertEquals(expectedLength, result);

        for (int i = 0; i < expectedLength; i++) {
            Assertions.assertEquals(expectedArray[i], nums[i]);
        }
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        int expectedLength = 0;

        int result = RemoveDuplicates.optimalSolution(nums);
        Assertions.assertEquals(expectedLength, result);
    }

    @Test
    public void testArrayWithNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        int expectedLength = 5;
        int[] expectedArray = {1, 2, 3, 4, 5};

        int result = RemoveDuplicates.optimalSolution(nums);
        Assertions.assertEquals(expectedLength, result);

    }

    @Test
    public void testArrayWithAllDuplicates() {
        int[] nums = {1, 1, 1, 1, 1};
        int expectedLength = 1;
        int[] expectedArray = {1};

        int result = RemoveDuplicates.optimalSolution(nums);
        Assertions.assertEquals(expectedLength, result);

    }

    @Test
    public void testArrayWithMultipleDuplicates() {
        int[] nums = {1, 2, 2, 3, 4, 4, 4, 5};
        int expectedLength = 5;
        int[] expectedArray = {1, 2, 3, 4, 5};

        int result = RemoveDuplicates.optimalSolution(nums);
        Assertions.assertEquals(expectedLength, result);

    }
}
