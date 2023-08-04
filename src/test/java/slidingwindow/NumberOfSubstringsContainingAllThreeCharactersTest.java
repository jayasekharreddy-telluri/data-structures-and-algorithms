package slidingwindow;

import org.com.jai.pattrens.slidingwindow.NumberOfSubstringsContainingAllThreeCharacters;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberOfSubstringsContainingAllThreeCharactersTest {

    @Test
    public void testOptimalSolutionWithAllThreeCharacters() {
        String s = "aaabc";
        int expectedCount = 3; // Substrings: "aaabc", "aabc", "abc"
        int actualCount = NumberOfSubstringsContainingAllThreeCharacters.optimalSolution(s);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolutionWithFewerCharacters() {
        String s = "abca";
        int expectedCount = 2;
        int actualCount = NumberOfSubstringsContainingAllThreeCharacters.optimalSolution(s);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolutionWithSingleCharacter() {
        String s = "a"; // Only one character present.
        int expectedCount = 0; // No substring can be formed with only one character.
        int actualCount = NumberOfSubstringsContainingAllThreeCharacters.optimalSolution(s);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolutionWithEmptyString() {
        String s = ""; // Empty string.
        int expectedCount = 0; // An empty string has no substrings.
        int actualCount = NumberOfSubstringsContainingAllThreeCharacters.optimalSolution(s);
        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testOptimalSolutionWithAllSameCharacters() {
        String s = "aaa"; // All characters are the same.
        int expectedCount = 0; // No substring can be formed with only one character.
        int actualCount = NumberOfSubstringsContainingAllThreeCharacters.optimalSolution(s);
        Assertions.assertEquals(expectedCount, actualCount);
    }
}
