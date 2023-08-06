package slidingwindow;

import org.com.jai.pattrens.slidingwindow.NoRepeatSubstring;
import org.junit.Assert;
import org.junit.Test;

public class NoRepeatSubstringTest {

    @Test
    public void testOptimalSolution_RegularCase() {
        String s = "abcabcbb";
        int expected = 3;
        int result = NoRepeatSubstring.optimalSolution(s);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimalSolution_AllRepeatingCharacters() {
        String s = "aaaaa";
        int expected = 1;
        int result = NoRepeatSubstring.optimalSolution(s);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimalSolution_EmptyString() {
        String s = "";
        int expected = 0;
        int result = NoRepeatSubstring.optimalSolution(s);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimalSolution_SingleCharacter() {
        String s = "a";
        int expected = 1;
        int result = NoRepeatSubstring.optimalSolution(s);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimalSolution_LongestSubstringAtEnd() {
        String s = "pwwkew";
        int expected = 3;
        int result = NoRepeatSubstring.optimalSolution(s);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testOptimalSolution_LongestSubstringInMiddle() {
        String s = "abcdabcdefg";
        int expected = 7;
        int result = NoRepeatSubstring.optimalSolution(s);
        Assert.assertEquals(expected, result);
    }
}
