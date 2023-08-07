package slidingwindow;

import org.com.jai.pattrens.slidingwindow.PermutationInAString;
import org.junit.Assert;
import org.junit.Test;

public class PermutationInAStringTest {

    @Test
    public void testOptimalSolution_ValidPermutation_ReturnsTrue() {
        String s = "aaacb";
        String pattern = "abc";
        boolean result = PermutationInAString.optimalSolution(s, pattern);
        Assert.assertTrue(result);
    }

    @Test
    public void testOptimalSolution_InvalidPermutation_ReturnsFalse() {
        String s = "aaacb";
        String pattern = "abd";
        boolean result = PermutationInAString.optimalSolution(s, pattern);
        Assert.assertFalse(result);
    }

    @Test
    public void testOptimalSolution_EmptyInputString_ReturnsFalse() {
        String s = "";
        String pattern = "abc";
        boolean result = PermutationInAString.optimalSolution(s, pattern);
        Assert.assertFalse(result);
    }
}
