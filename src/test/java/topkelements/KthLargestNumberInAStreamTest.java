package topkelements;

import org.com.jai.pattrens.topkelements.KthLargestNumberInAStream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KthLargestNumberInAStreamTest {

    @Test
    public void testKthLargestNumberWithBasicUsage() {
        int[] nums = {3, 1, 5, 12, 2, 11};
        KthLargestNumberInAStream kthLargest = new KthLargestNumberInAStream(nums, 4);

        assertEquals(5, kthLargest.add(6), "Adding 6; the 4th largest element should be 5.");
        assertEquals(6, kthLargest.add(13), "Adding 13; the 4th largest element should now be 6.");
        assertEquals(11, kthLargest.add(4), "Adding 4; the 4th largest element should still be 11.");
    }

    @Test
    public void testKthLargestNumberWithSmallK() {
        int[] nums = {3, 1, 5, 12, 2, 11};
        KthLargestNumberInAStream kthLargest = new KthLargestNumberInAStream(nums, 2);

        assertEquals(11, kthLargest.add(6), "Adding 6; the 2nd largest element should be 11.");
        assertEquals(11, kthLargest.add(13), "Adding 13; the 2nd largest element should still be 11.");
        assertEquals(6, kthLargest.add(4), "Adding 4; the 2nd largest element should now be 6.");
    }

    @Test
    public void testKthLargestNumberWithSingleElement() {
        int[] nums = {5};
        KthLargestNumberInAStream kthLargest = new KthLargestNumberInAStream(nums, 1);

        assertEquals(5, kthLargest.add(3), "Adding 3 to a stream with a single element (5); the largest element should be 3.");
    }

    @Test
    public void testKthLargestNumberWithEmptyStream() {
        int[] nums = {};
        KthLargestNumberInAStream kthLargest = new KthLargestNumberInAStream(nums, 1);

        assertEquals(3, kthLargest.add(3), "Adding 3 to an empty stream; the largest element should be 3.");
    }
}
