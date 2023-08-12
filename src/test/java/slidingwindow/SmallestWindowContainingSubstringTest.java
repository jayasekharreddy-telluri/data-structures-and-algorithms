package slidingwindow;


import org.com.jai.pattrens.slidingwindow.SmallestWindowContainingSubstring;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SmallestWindowContainingSubstringTest {

    @Test
    void testEmptyPattern() {
        String s = "abcde";
        String pattern = "";
        String result = SmallestWindowContainingSubstring.optimalSolution(s, pattern);
        assertEquals("", result, "Empty pattern should result in an empty string");
    }

    @Test
    void testPatternNotFound() {
        String s = "abcdef";
        String pattern = "xyz";
        String result = SmallestWindowContainingSubstring.optimalSolution(s, pattern);
        assertEquals("", result, "Pattern not found in the string should result in an empty string");
    }

    @Test
    void testPatternFoundInString() {
        String s = "aaabdecabcf";
        String pattern = "abc";
        String result = SmallestWindowContainingSubstring.optimalSolution(s, pattern);
        assertEquals("abcf", result, "Smallest window containing the pattern should be 'abcf'");
    }

    @Test
    void testPatternAtStartOfString() {
        String s = "abcdef";
        String pattern = "abc";
        String result = SmallestWindowContainingSubstring.optimalSolution(s, pattern);
        assertEquals("abc", result, "Pattern found at the start should return the pattern itself");
    }

    @Test
    void testPatternAtEndOfString() {
        String s = "abcdef";
        String pattern = "def";
        String result = SmallestWindowContainingSubstring.optimalSolution(s, pattern);
        assertEquals("def", result, "Pattern found at the end should return the pattern itself");
    }

    @Test
    void testPatternWithRepeatingCharacters() {
        String s = "aaabbabca";
        String pattern = "abc";
        String result = SmallestWindowContainingSubstring.optimalSolution(s, pattern);
        assertEquals("bca", result, "Smallest window containing the pattern should be 'bca'");
    }
}
