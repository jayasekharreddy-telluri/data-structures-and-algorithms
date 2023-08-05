package slidingwindow;

import org.com.jai.pattrens.slidingwindow.MaximumNumberOfVowelsInASubstringOfGivenLength;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MaximumNumberOfVowelsInASubstringOfGivenLengthTest {

    @Test
    void testOptimalSolutionWithValidInput() {
        // Test case with a valid input string and k value
        String s = "abciiidef";
        int k = 3;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.optimalSolution(s, k);
        assertEquals(3, result); // Expected output: Maximum 2 vowels in any substring of length 3
    }

    @Test
    void testOptimalSolutionWithKGreaterThanStringLength() {
        // Test case where k is greater than the input string length
        String s = "hello";
        int k = 10;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.optimalSolution(s, k);
        assertEquals(2, result); // Expected output: Maximum 2 vowels in any substring of length 5 (the whole string)
    }

    @Test
    void testOptimalSolutionWithAllVowels() {
        // Test case where the input string contains all vowels
        String s = "aeiou";
        int k = 3;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.optimalSolution(s, k);
        assertEquals(3, result); // Expected output: Maximum 3 vowels in any substring of length 3
    }

    @Test
    void testOptimalSolutionWithNoVowels() {
        // Test case where the input string contains no vowels
        String s = "xyz";
        int k = 2;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.optimalSolution(s, k);
        assertEquals(0, result); // Expected output: Maximum 0 vowels in any substring of length 2
    }

    @Test
    void testOptimalSolutionWithEmptyString() {
        // Test case with an empty input string
        String s = "";
        int k = 3;
        int result = MaximumNumberOfVowelsInASubstringOfGivenLength.optimalSolution(s, k);
        assertEquals(0, result); // Expected output: Maximum 0 vowels in any substring (as there are no substrings in an empty string)
    }
}
