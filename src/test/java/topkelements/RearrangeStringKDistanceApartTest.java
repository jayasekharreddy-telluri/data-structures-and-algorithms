package topkelements;

import org.com.jai.pattrens.topkelements.RearrangeStringKDistanceApart;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RearrangeStringKDistanceApartTest {

    @Test
    public void testRearrangeStringKDistanceApart() {
        // Test case: Valid input with rearrangement possible
        assertEquals("abacabad", RearrangeStringKDistanceApart.rearrangeStringKDistanceApart("aaadbbcc", 2));

        // Test case: Valid input with rearrangement possible for k = 3
        assertEquals("abcabcab", RearrangeStringKDistanceApart.rearrangeStringKDistanceApart("aaabbcc", 3));

        // Test case: Valid input with rearrangement possible for k = 1
        assertEquals("aabbcc", RearrangeStringKDistanceApart.rearrangeStringKDistanceApart("aabbcc", 1));

        // Test case: Edge case - k is greater than the string length
        assertEquals("empty", RearrangeStringKDistanceApart.rearrangeStringKDistanceApart("abc", 4));

        // Test case: Edge case - k is equal to 1
        assertEquals("aabbcc", RearrangeStringKDistanceApart.rearrangeStringKDistanceApart("aabbcc", 1));

        // Test case: Edge case - k is less than or equal to 0
        assertEquals("xyz", RearrangeStringKDistanceApart.rearrangeStringKDistanceApart("xyz", 0));
        assertEquals("abc", RearrangeStringKDistanceApart.rearrangeStringKDistanceApart("abc", -1));

        // Test case: Empty string input
        assertEquals("", RearrangeStringKDistanceApart.rearrangeStringKDistanceApart("", 3));
    }
}
