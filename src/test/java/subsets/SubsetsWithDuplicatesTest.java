package subsets;

import org.com.jai.pattrens.subsets.SubsetsWithDuplicates;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SubsetsWithDuplicatesTest {

    @Test
    public void testFindSubsets_NormalCase() {
        int[] nums = {1, 2, 2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>()); // Empty subset
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(2, 2));
        expected.add(Arrays.asList(1, 2, 2));

        List<List<Integer>> result = SubsetsWithDuplicates.findSubsets(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindSubsets_EmptyArray() {
        int[] nums = {};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>());

        List<List<Integer>> result = SubsetsWithDuplicates.findSubsets(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindSubsets_SingleElement() {
        int[] nums = {5};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>());
        expected.add(Arrays.asList(5));

        List<List<Integer>> result = SubsetsWithDuplicates.findSubsets(nums);
        assertEquals(expected, result);
    }
}