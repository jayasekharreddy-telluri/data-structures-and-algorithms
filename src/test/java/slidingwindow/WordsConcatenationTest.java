package slidingwindow;

import org.com.jai.pattrens.slidingwindow.WordsConcatenation;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordsConcatenationTest {

    @Test
    void testOptimalSolutionBasic() {
        String s = "barfoothefoobarman";
        String[] words = {"foo", "bar"};
        List<Integer> expected = List.of(0, 9); // Substrings "barfoo" and "foobar" match the words
        List<Integer> result = WordsConcatenation.optimalSolution(s, words);
        assertEquals(expected, result);
    }

    @Test
    void testOptimalSolutionEmptyWords() {
        String s = "wordwordword";
        String[] words = {};
        List<Integer> expected = List.of(); // No words to match, so no indices should be found
        List<Integer> result = WordsConcatenation.optimalSolution(s, words);
        assertEquals(expected, result);
    }

    @Test
    void testOptimalSolutionNoMatching() {
        String s = "abcd";
        String[] words = {"efg", "hij"};
        List<Integer> expected = List.of(); // No substring matches the words
        List<Integer> result = WordsConcatenation.optimalSolution(s, words);
        assertEquals(expected, result);
    }

    @Test
    void testOptimalSolutionEmptyString() {
        String s = "";
        String[] words = {"abc", "def"};
        List<Integer> expected = List.of(); // No substrings in an empty string
        List<Integer> result = WordsConcatenation.optimalSolution(s, words);
        assertEquals(expected, result);
    }

    @Test
    void testOptimalSolutionSingleWord() {
        String s = "word";
        String[] words = {"word"};
        List<Integer> expected = List.of(0); // Only one possible substring, which matches the word
        List<Integer> result = WordsConcatenation.optimalSolution(s, words);
        assertEquals(expected, result);
    }
}
