package org.com.jai.pattrens.KWayMerge;

import java.util.PriorityQueue;

public class KthSmallestNumberInASortedMatrix {

    public static int findKthSmallestNumberInASortedMatrix(int[][] matrix, int k) {
        // Create a minHeap PriorityQueue to store NodeTwo objects
        // Comparator sorts nodes based on matrix values at their indices
        PriorityQueue<NodeTwo> minHeap = new PriorityQueue<>((n1, n2) ->
                matrix[n1.row][n1.col] - matrix[n2.row][n2.col]);

        // Add the first column elements' indices (0, 0), (1, 0), (2, 0),... to minHeap
        // Iterate until reaching k or the number of rows, whichever is smaller
        for (int i = 0; i < matrix.length && i < k; i++) {
            minHeap.add(new NodeTwo(i, 0));
        }

        int numberCount = 0, result = 0;

        // Iterate until minHeap is empty or kth smallest number is found
        while (!minHeap.isEmpty()) {
            NodeTwo node = minHeap.poll(); // Extract the minimum node
            result = matrix[node.row][node.col]; // Get the value at the node's position

            numberCount++; // Increment count of retrieved numbers

            if (numberCount == k) {
                break; // If kth smallest is found, exit loop
            }

            node.col++; // Move to the next column in the same row

            // If more columns are available in the current row, add the updated node to minHeap
            if (matrix[0].length > node.col) {
                minHeap.add(node);
            }
        }

        return result; // Return the kth smallest number
    }

    public static void main(String[] args) {
        int[][] matrix = {{2, 6, 8}, {3, 7, 10}, {5, 8, 11}};
        int k = 5;
        System.out.println(findKthSmallestNumberInASortedMatrix(matrix, k));
    }

}
