package slidingwindow;


import org.com.jai.pattrens.slidingwindow.LongestSubstringWithKDistinctCharacters;
import org.junit.Assert;
import org.junit.Test;

public class LongestSubstringWithKDistinctCharactersTest {

    @Test
    public void test_One(){
        String word = "";
        int k = 1;
        int expected = 0;

        Assert.assertEquals(expected, LongestSubstringWithKDistinctCharacters.optimalSolution(word,k));

    }

    @Test
    public void test_Two(){
        String word = "cbbebi";
        int k = 3;
        int expected = 5;
        Assert.assertEquals(expected, LongestSubstringWithKDistinctCharacters.optimalSolution(word,k));

    }

    @Test
    public void test_Three(){
        String word = "aabbccc";
        int k = 4;
        int expected = 7;
        Assert.assertEquals(expected, LongestSubstringWithKDistinctCharacters.optimalSolution(word,k));

    }

    @Test
    public void test_Four(){
        String word = "abcdefgh";
        int k = 5;
        int expected = 5;
        Assert.assertEquals(expected,LongestSubstringWithKDistinctCharacters.optimalSolution(word,k));
    }

    public void test_Five(){
        String word = "abc";
        int k = 4;
        int expected = 3;
        Assert.assertEquals(expected,LongestSubstringWithKDistinctCharacters.optimalSolution(word,k));

    }

}
