package cyclicsort;

import static org.junit.jupiter.api.Assertions.*;

import org.com.jai.pattrens.cyclicsort.FindAllDuplicateNumbers;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;

public class FindAllDuplicateNumbersTest {

    @Test
    public void testFindAllDuplicateNumbersBasic() {
        int[] nums = {3, 4, 4, 5, 5};
        List<Integer> expected = Arrays.asList(4, 5);
        List<Integer> result = FindAllDuplicateNumbers.findAllDuplicateNumbers(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindAllDuplicateNumbersEmptyArray() {
        int[] nums = {};
        List<Integer> expected = Arrays.asList();
        List<Integer> result = FindAllDuplicateNumbers.findAllDuplicateNumbers(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindAllDuplicateNumbersNullArray() {
        int[] nums = null;
        List<Integer> expected = Arrays.asList();
        List<Integer> result = FindAllDuplicateNumbers.findAllDuplicateNumbers(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindAllDuplicateNumbersNoDuplicates() {
        int[] nums = {1, 2, 3, 4, 5};
        List<Integer> expected = Arrays.asList();
        List<Integer> result = FindAllDuplicateNumbers.findAllDuplicateNumbers(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindAllDuplicateNumbersSingleDuplicate() {
        int[] nums = {1, 2, 2, 4, 5};
        List<Integer> expected = Arrays.asList(2);
        List<Integer> result = FindAllDuplicateNumbers.findAllDuplicateNumbers(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindAllDuplicateNumbersMultipleDuplicates() {
        int[] nums = {1, 2, 2, 4, 4, 5, 5};
        List<Integer> expected = Arrays.asList(2, 4, 5);
        List<Integer> result = FindAllDuplicateNumbers.findAllDuplicateNumbers(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindAllDuplicateNumbersNegativeValues() {
        int[] nums = {-3, -2, -2, 1, 1};
        List<Integer> expected = Arrays.asList(-2, 1);
        List<Integer> result = FindAllDuplicateNumbers.findAllDuplicateNumbers(nums);
        assertEquals(expected, result);
    }
}
