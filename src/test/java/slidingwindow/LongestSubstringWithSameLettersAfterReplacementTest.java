package slidingwindow;

import org.com.jai.pattrens.slidingwindow.LongestSubstringWithSameLettersAfterReplacement;
import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithSameLettersAfterReplacementTest {

    @Test
    public void testOptimalSolution_RegularCase() {
        String s = "aabccbb";
        int k = 2;
        int expected = 5;
        int result = LongestSubstringWithSameLettersAfterReplacement.optimalSolution(s, k);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimalSolution_AllSameLetters() {
        String s = "aaaaaa";
        int k = 2;
        int expected = 6;
        int result = LongestSubstringWithSameLettersAfterReplacement.optimalSolution(s, k);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimalSolution_EmptyString() {
        String s = "";
        int k = 2;
        int expected = 0;
        int result = LongestSubstringWithSameLettersAfterReplacement.optimalSolution(s, k);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimalSolution_SingleCharacter() {
        String s = "a";
        int k = 0;
        int expected = 1;
        int result = LongestSubstringWithSameLettersAfterReplacement.optimalSolution(s, k);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimalSolution_KGreaterThanStringLength() {
        String s = "abc";
        int k = 5;
        int expected = 3;
        int result = LongestSubstringWithSameLettersAfterReplacement.optimalSolution(s, k);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimalSolution_KEqualToZero() {
        String s = "abcaabb";
        int k = 0;
        int expected = 1;
        int result = LongestSubstringWithSameLettersAfterReplacement.optimalSolution(s, k);
        Assert.assertEquals(expected, result);
    }
}
