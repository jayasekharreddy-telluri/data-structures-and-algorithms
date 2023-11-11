package org.com.jai.pattrens.topkelements;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class KClosestPointsToTheOrigin {

    // Class representing a point in 2D space
    public static class Point {
        int x;
        int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Method to calculate the distance from the origin
        public int distFromOrigin() {
            return x * x + y * y;
        }
    }

    // Method to find k closest points to the origin
    public static List<Point> findClosestPointsToTheOrigin(Point[] p, int k) {

        // Max heap to store points based on their distance from the origin
        PriorityQueue<Point> maxHeap = new PriorityQueue<>((p1, p2) -> p2.distFromOrigin() - p1.distFromOrigin());

        // Add the first k points to the max heap
        for (int i = 0; i < k; i++) {
            maxHeap.add(p[i]);
        }

        // Iterate through the remaining points
        for (int i = k; i < p.length; i++) {
            // If the distance of the current point is less than the maximum distance in the heap
            if (p[i].distFromOrigin() < maxHeap.peek().distFromOrigin()) {
                // Remove the point with the maximum distance
                maxHeap.poll();
                // Add the current point to the heap
                maxHeap.add(p[i]);
            }
            // Note: There is a redundant 'maxHeap.add(p[i]);' here, it should be removed.
        }

        // Convert the max heap to a list and return
        return new ArrayList<>(maxHeap);
        /*
            Time Complexity: O(N * log(K)) where N is the number of points.
                             Each insertion and extraction in the max heap takes O(log(K)) time.
            Space Complexity: O(K) - The size of the max heap.
         */
    }

    public static void main(String[] args) {

        // Given array of points
        Point[] p = {new Point(1, 3), new Point(3, 4), new Point(2, -1)};

        int k = 1;

        // Print the distance from the origin of the closest point
        System.out.println(findClosestPointsToTheOrigin(p, k).get(0).distFromOrigin());
    }
}
