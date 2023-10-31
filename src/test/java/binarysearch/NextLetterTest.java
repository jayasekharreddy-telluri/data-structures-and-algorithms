package binarysearch;

import org.com.jai.pattrens.binarysearch.NextLetter;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NextLetterTest {

    @Test
    public void testNextLetterFoundInArray() {
        char[] letters = {'a', 'c', 'f', 'h'};
        char key = 'd';
        assertEquals('f', NextLetter.searchNextLetter(letters, key));
    }

    @Test
    public void testNextLetterNotFoundInArray() {
        char[] letters = {'a', 'c', 'f', 'h'};
        char key = 'z';
        assertEquals('a', NextLetter.searchNextLetter(letters, key));
    }

    @Test
    public void testKeySmallerThanAllLetters() {
        char[] letters = {'a', 'c', 'f', 'h'};
        char key = '!';
        assertEquals('a', NextLetter.searchNextLetter(letters, key));
    }

    @Test
    public void testKeyLargerThanAllLetters() {
        char[] letters = {'a', 'c', 'f', 'h'};
        char key = 'z';
        assertEquals('a', NextLetter.searchNextLetter(letters, key));
    }

    @Test
    public void testEmptyArray() {
        char[] letters = {};
        char key = 'd';
        assertEquals('\0', NextLetter.searchNextLetter(letters, key)); // Assuming '\0' represents an empty result.
    }

    @Test
    public void testWrapAroundArray() {
        char[] letters = {'y', 'z', 'a', 'c', 'f'};
        char key = 'b';
        assertEquals('c', NextLetter.searchNextLetter(letters, key));
    }

    @Test
    public void testKeyEqualsLetterInArray() {
        char[] letters = {'a', 'c', 'f', 'h'};
        char key = 'f';
        assertEquals('h', NextLetter.searchNextLetter(letters, key));
    }
}
