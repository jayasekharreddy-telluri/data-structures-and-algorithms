package bitwisexor;

import org.com.jai.pattrens.bitwisexor.FlipImage;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class FlipImageTest {

    @Test
    public void testFlipImageAndInvert_3x3Array() {
        int[][] arr = {{1, 0, 1}, {1, 1, 1}, {0, 1, 1}};
        int[][] expected = {{0, 1, 0}, {0, 0, 0}, {0, 0, 1}};
        FlipImage.flipImageAndInvert(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testFlipImageAndInvert_AllOnes() {
        int[][] arr = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        int[][] expected = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        FlipImage.flipImageAndInvert(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testFlipImageAndInvert_AllZeros() {
        int[][] arr = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};
        int[][] expected = {{1, 1, 1}, {1, 1, 1}, {1, 1, 1}};
        FlipImage.flipImageAndInvert(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testFlipImageAndInvert_SingleElementArray() {
        int[][] arr = {{1}};
        int[][] expected = {{0}};
        FlipImage.flipImageAndInvert(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    public void testFlipImageAndInvert_EmptyArray() {
        int[][] arr = {};
        int[][] expected = {};
        FlipImage.flipImageAndInvert(arr);
        assertArrayEquals(expected, arr);
    }
}
