package subsets;

import org.com.jai.pattrens.subsets.BalancedParentheses;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class BalancedParenthesesTest {

    @Test
    public void testGenerateValidParentheses_0() {
        List<String> result = BalancedParentheses.genarativeValideParenthesis(0);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGenerateValidParentheses_1() {
        List<String> result = BalancedParentheses.genarativeValideParenthesis(1);
        assertEquals(1, result.size());
        assertTrue(result.contains("()"));
    }

    @Test
    public void testGenerateValidParentheses_2() {
        List<String> result = BalancedParentheses.genarativeValideParenthesis(2);
        assertEquals(2, result.size());
        assertTrue(result.contains("()()"));
        assertTrue(result.contains("(())"));
    }

    @Test
    public void testGenerateValidParentheses_3() {
        List<String> result = BalancedParentheses.genarativeValideParenthesis(3);
        assertEquals(5, result.size());
        assertTrue(result.contains("()()()"));
        assertTrue(result.contains("()(())"));
        assertTrue(result.contains("(())()"));
        assertTrue(result.contains("((()))"));
        assertTrue(result.contains("(()())"));
    }

    @Test
    public void testGenerateValidParentheses_Negative() {
        List<String> result = BalancedParentheses.genarativeValideParenthesis(-1);
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGenerateValidParentheses_LargeValue() {
        List<String> result = BalancedParentheses.genarativeValideParenthesis(10);
        // You can validate the size or specific combinations as needed.
        assertEquals(16796, result.size());
    }
}
