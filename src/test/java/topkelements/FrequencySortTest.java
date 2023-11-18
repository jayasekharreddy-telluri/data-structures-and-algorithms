package topkelements;

import org.com.jai.pattrens.topkelements.FrequencySort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FrequencySortTest {

    @Test
    public void testSortCharacterByFrequencyWithNormalString() {
        String input = "Programming";
        assertEquals("ggmmniorPra", FrequencySort.sortCharacterByFrequency(input),
                "Characters in 'Programming' sorted by frequency should be 'ggmmniorPra'.");
    }

    @Test
    public void testSortCharacterByFrequencyWithEmptyString() {
        String input = "";
        assertEquals("", FrequencySort.sortCharacterByFrequency(input),
                "Sorting characters in an empty string should result in an empty string.");
    }

    @Test
    public void testSortCharacterByFrequencyWithSingleCharacterString() {
        String input = "a";
        assertEquals("a", FrequencySort.sortCharacterByFrequency(input),
                "Sorting characters in a string with a single character should result in the same character.");
    }

    @Test
    public void testSortCharacterByFrequencyWithAllSameCharacters() {
        String input = "aaaa";
        assertEquals("aaaa", FrequencySort.sortCharacterByFrequency(input),
                "Sorting characters in a string with all same characters should result in the same string.");
    }

    @Test
    public void testSortCharacterByFrequencyWithMixedCaseString() {
        String input = "aAabB";
        assertEquals("aAbBaB", FrequencySort.sortCharacterByFrequency(input),
                "Characters in 'aAabB' sorted by frequency should be 'aAbBaB'.");
    }

    @Test
    public void testSortCharacterByFrequencyWithNumbersAndSpecialCharacters() {
        String input = "a!2b#3c";
        assertEquals("a!2b#3c", FrequencySort.sortCharacterByFrequency(input),
                "Sorting characters in a string with numbers and special characters should preserve the original order.");
    }
}
