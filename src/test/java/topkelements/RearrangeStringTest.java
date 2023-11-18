package topkelements;

import org.com.jai.pattrens.topkelements.RearrangeString;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RearrangeStringTest {

    @Test
    public void testRearrangeString_GenericCase() {
        String str = "abcdaf";
        String expected = "abadcf";
        assertEquals(expected, RearrangeString.rearrangeString(str));
    }

    @Test
    public void testRearrangeString_EmptyString() {
        String str = "";
        String expected = "empty";
        assertEquals(expected, RearrangeString.rearrangeString(str));
    }

    @Test
    public void testRearrangeString_SingleCharacter() {
        String str = "aaaaa";
        String expected = "empty";
        assertEquals(expected, RearrangeString.rearrangeString(str));
    }

    @Test
    public void testRearrangeString_NoRearrangementPossible() {
        String str = "aaaabbbbcc";
        String expected = "empty";
        assertEquals(expected, RearrangeString.rearrangeString(str));
    }

    @Test
    public void testRearrangeString_LargeInput() {
        String str = "aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzz";
        String expected = "empty";
        assertEquals(expected, RearrangeString.rearrangeString(str));
    }

    @Test
    public void testRearrangeString_GenericCase2() {
        String str = "programming";
        String expected = "gmrpiroangm";
        assertEquals(expected, RearrangeString.rearrangeString(str));
    }
}
