package subsets;

import org.com.jai.pattrens.subsets.StringPermutationsByChangingCase;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringPermutationsByChangingCaseTest {

    @Test
    public void testFindStringPermutations_NormalCase() {
        String str = "abc";
        List<String> expected = new ArrayList<>();
        expected.add("abc");
        expected.add("Abc");
        expected.add("aBc");
        expected.add("abC");
        expected.add("ABc");
        expected.add("AbC");
        expected.add("aBC");
        expected.add("ABC");

        List<String> result = StringPermutationsByChangingCase.findStringPermutations(str);
        assertEquals(expected, result);
    }

    @Test
    public void testFindStringPermutations_EmptyString() {
        String str = "";
        List<String> expected = new ArrayList<>();
        expected.add(""); // Only an empty string is possible

        List<String> result = StringPermutationsByChangingCase.findStringPermutations(str);
        assertEquals(expected, result);
    }

    @Test
    public void testFindStringPermutations_NoLetters() {
        String str = "123";
        List<String> expected = new ArrayList<>();
        expected.add("123"); // Only the original string is possible

        List<String> result = StringPermutationsByChangingCase.findStringPermutations(str);
        assertEquals(expected, result);
    }

    @Test
    public void testFindStringPermutations_SpecialCharacters() {
        String str = "!@#";
        List<String> expected = new ArrayList<>();
        expected.add("!@#"); // Only the original string is possible

        List<String> result = StringPermutationsByChangingCase.findStringPermutations(str);
        assertEquals(expected, result);
    }

    @Test
    public void testFindStringPermutations_MixedCharacters() {
        String str = "a1B";
        List<String> expected = new ArrayList<>();
        expected.add("a1B");
        expected.add("A1B");
        expected.add("a1b");
        expected.add("A1b");

        List<String> result = StringPermutationsByChangingCase.findStringPermutations(str);
        assertEquals(expected, result);
    }
}
