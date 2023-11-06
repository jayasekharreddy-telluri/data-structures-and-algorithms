package bitwisexor;

import org.com.jai.pattrens.bitwisexor.ComplementOfBase10Number;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ComplementOfBase10NumberTest {

    @Test
    public void testBitWiseCompliment_PositiveNumber() {
        int num = 5;
        int expected = 2;
        assertEquals(expected, ComplementOfBase10Number.bitWiseCompliment(num));
    }

    @Test
    public void testBitWiseCompliment_NegativeNumber() {
        int num = -8;
        int expected = 7;
        assertEquals(expected, ComplementOfBase10Number.bitWiseCompliment(num));
    }

    @Test
    public void testBitWiseCompliment_Zero() {
        int num = 0;
        int expected = 1;
        assertEquals(expected, ComplementOfBase10Number.bitWiseCompliment(num));
    }

    @Test
    public void testBitWiseCompliment_LargeNumber() {
        int num = 1023; // All bits set except the sign bit
        int expected = 0;
        assertEquals(expected, ComplementOfBase10Number.bitWiseCompliment(num));
    }

    @Test
    public void testBitWiseCompliment_MaxInteger() {
        int num = Integer.MAX_VALUE; // Largest positive integer
        int expected = 0;
        assertEquals(expected, ComplementOfBase10Number.bitWiseCompliment(num));
    }
}
