package subsets;

import org.com.jai.pattrens.subsets.Subsets;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubsetsTest {

    @Test
    public void testFindSubsets_NormalCase() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>()); // Empty subset
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(1, 2, 3));

        List<List<Integer>> result = Subsets.findSubsets(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindSubsets_EmptyArray() {
        int[] nums = {};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>()); // Only an empty subset is possible

        List<List<Integer>> result = Subsets.findSubsets(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindSubsets_SingleElement() {
        int[] nums = {5};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>()); // Empty subset
        expected.add(Arrays.asList(5)); // Subset with the single element

        List<List<Integer>> result = Subsets.findSubsets(nums);
        assertEquals(expected, result);
    }
}