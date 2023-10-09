package subsets;

import org.com.jai.pattrens.subsets.Permutations;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationsTest {

    @Test
    public void testFindPermutations_NormalCase() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 3));
        expected.add(Arrays.asList(1, 3, 2));
        expected.add(Arrays.asList(2, 1, 3));
        expected.add(Arrays.asList(2, 3, 1));
        expected.add(Arrays.asList(3, 1, 2));
        expected.add(Arrays.asList(3, 2, 1));

        List<List<Integer>> result = Permutations.findPermutations(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindPermutations_EmptyArray() {
        int[] nums = {};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(new ArrayList<>()); // Only an empty permutation is possible

        List<List<Integer>> result = Permutations.findPermutations(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindPermutations_SingleElement() {
        int[] nums = {5};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(5)); // Only one permutation with the single element

        List<List<Integer>> result = Permutations.findPermutations(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindPermutations_TwoElements() {
        int[] nums = {1, 2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(2, 1));

        List<List<Integer>> result = Permutations.findPermutations(nums);
        assertEquals(expected, result);
    }

    @Test
    public void testFindPermutations_DuplicateElements() {
        int[] nums = {1, 1, 2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 1, 2));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(2, 1, 1));

        List<List<Integer>> result = Permutations.findPermutations(nums);
        assertEquals(expected, result);
    }
}
