package cyclicsort;
import static org.junit.jupiter.api.Assertions.*;

import org.com.jai.pattrens.cyclicsort.FindAllMissingNumbers;
import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Arrays;
public class FindAllMissingNumbersTest {

    @Test
    public void testFindAllMissingNumbersBasic() {
        int[] nums = {2, 3, 2, 1};
        List<Integer> expected = Arrays.asList(4);
        List<Integer> result = FindAllMissingNumbers.findAllMissingNumbers(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindAllMissingNumbersEmptyArray() {
        int[] nums = {};
        List<Integer> expected = Arrays.asList();
        List<Integer> result = FindAllMissingNumbers.findAllMissingNumbers(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindAllMissingNumbersNullArray() {
        int[] nums = null;
        List<Integer> expected = Arrays.asList();
        List<Integer> result = FindAllMissingNumbers.findAllMissingNumbers(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindAllMissingNumbersNoMissing() {
        int[] nums = {1, 2, 3, 4, 5};
        List<Integer> expected = Arrays.asList();
        List<Integer> result = FindAllMissingNumbers.findAllMissingNumbers(nums);
        assertEquals(expected, result);
    }

}
