package twoheaps;

import org.com.jai.pattrens.twoheaps.FindTheMedianOfANumberStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheMedianOfANumberStreamTest {

    @Test
    public void testMedianWithAscendingValues() {
        FindTheMedianOfANumberStream numberStream = new FindTheMedianOfANumberStream();
        numberStream.insertNum(3);
        numberStream.insertNum(1);
        numberStream.insertNum(5);

        // Expected median: (1 + 3 + 5) / 3 = 3.0
        assertEquals(3.0, numberStream.findMedian(), 0.001);
    }

    @Test
    public void testMedianWithDescendingValues() {
        FindTheMedianOfANumberStream numberStream = new FindTheMedianOfANumberStream();

        numberStream.insertNum(5);
        numberStream.insertNum(3);
        numberStream.insertNum(1);

        // Expected median: (1 + 3 + 5) / 3 = 3.0
        assertEquals(3.0, numberStream.findMedian(), 0.001);
    }

    @Test
    public void testMedianWithRandomOrder() {
        FindTheMedianOfANumberStream numberStream = new FindTheMedianOfANumberStream();

        numberStream.insertNum(3);
        numberStream.insertNum(5);
        numberStream.insertNum(1);

        // Expected median: (1 + 3 + 5) / 3 = 3.0
        assertEquals(3.0, numberStream.findMedian(), 0.001);
    }

    @Test
    public void testMedianWithOddNumberOfElements() {
        FindTheMedianOfANumberStream numberStream = new FindTheMedianOfANumberStream();

        numberStream.insertNum(2);
        numberStream.insertNum(3);
        numberStream.insertNum(1);

        // Expected median: 2.0 (middle element)
        assertEquals(2.0, numberStream.findMedian(), 0.001);
    }

    @Test
    public void testMedianWithEvenNumberOfElements() {
        FindTheMedianOfANumberStream numberStream = new FindTheMedianOfANumberStream();

        numberStream.insertNum(2);
        numberStream.insertNum(3);
        numberStream.insertNum(1);
        numberStream.insertNum(4);

        // Expected median: (2 + 3) / 2 = 2.5
        assertEquals(2.5, numberStream.findMedian(), 0.001);
    }
}
