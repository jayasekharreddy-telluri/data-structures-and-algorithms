package KWayMerge;

import org.com.jai.pattrens.KWayMerge.KthSmallestNumberInASortedMatrix;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class KthSmallestNumberInASortedMatrixTest {

    @Test
    public void testKthSmallestNumber() {
        // Example matrix
        int[][] matrix = {{2, 6, 8}, {3, 7, 10}, {5, 8, 11}};

        // Test for the smallest element in the matrix (k = 1)
        assertEquals(2, KthSmallestNumberInASortedMatrix.findKthSmallestNumberInASortedMatrix(matrix, 1));

        // Test for the largest element in the matrix (k = rows * cols)
        assertEquals(11, KthSmallestNumberInASortedMatrix.findKthSmallestNumberInASortedMatrix(matrix, 9));

        // Test for a random kth element within the matrix
        assertEquals(7, KthSmallestNumberInASortedMatrix.findKthSmallestNumberInASortedMatrix(matrix, 6));

        // Test for k exceeding the total elements in the matrix
        assertEquals(11, KthSmallestNumberInASortedMatrix.findKthSmallestNumberInASortedMatrix(matrix, 10));

        // Test for an empty matrix
        int[][] emptyMatrix = {};
        assertEquals(0, KthSmallestNumberInASortedMatrix.findKthSmallestNumberInASortedMatrix(emptyMatrix, 1));

        // Test for a single-element matrix
        int[][] singleElementMatrix = {{1}};
        assertEquals(1, KthSmallestNumberInASortedMatrix.findKthSmallestNumberInASortedMatrix(singleElementMatrix, 1));
    }
}
