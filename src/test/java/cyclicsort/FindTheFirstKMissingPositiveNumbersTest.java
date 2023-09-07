package cyclicsort;

import org.com.jai.pattrens.cyclicsort.FindTheFirstKMissingPositiveNumbers;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FindTheFirstKMissingPositiveNumbersTest {

    @Test
    public void testPositiveInput() {
        int[] nums = {2, 3, 4};
        int z = 3;
        FindTheFirstKMissingPositiveNumbers instance = new FindTheFirstKMissingPositiveNumbers();
        assertEquals(List.of(1, 5, 6), instance.findTheFirstKMissingPositiveNumbers(nums, z));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-1, -2, -3};
        int z = 3;
        FindTheFirstKMissingPositiveNumbers instance = new FindTheFirstKMissingPositiveNumbers();
        assertEquals(List.of(1, 2, 3), instance.findTheFirstKMissingPositiveNumbers(nums, z));
    }

    @Test
    public void testDuplicateNumbers() {
        int[] nums = {2, 2, 3, 3, 4, 4};
        int z = 3;
        FindTheFirstKMissingPositiveNumbers instance = new FindTheFirstKMissingPositiveNumbers();
        assertEquals(List.of(1, 5, 6), instance.findTheFirstKMissingPositiveNumbers(nums, z));
    }

    @Test
    public void testZeroZValue() {
        int[] nums = {2, 3, 4};
        int z = 0;
        FindTheFirstKMissingPositiveNumbers instance = new FindTheFirstKMissingPositiveNumbers();
        assertEquals(List.of(), instance.findTheFirstKMissingPositiveNumbers(nums, z));
    }

    @Test
    public void testEmptyInput() {
        int[] nums = {};
        int z = 5;
        FindTheFirstKMissingPositiveNumbers instance = new FindTheFirstKMissingPositiveNumbers();
        assertEquals(List.of(1, 2, 3, 4, 5), instance.findTheFirstKMissingPositiveNumbers(nums, z));
    }

    @Test
    public void testNullInput() {
        int[] nums = null;
        int z = 3;
        FindTheFirstKMissingPositiveNumbers instance = new FindTheFirstKMissingPositiveNumbers();
        assertEquals(List.of(), instance.findTheFirstKMissingPositiveNumbers(nums, z));
    }
}
