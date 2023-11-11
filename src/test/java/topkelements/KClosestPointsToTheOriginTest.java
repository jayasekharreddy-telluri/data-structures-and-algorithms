package topkelements;

import org.com.jai.pattrens.topkelements.KClosestPointsToTheOrigin;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KClosestPointsToTheOriginTest {

    @Test
    public void testFindClosestPointsToTheOrigin_GenericCase() {
        KClosestPointsToTheOrigin.Point[] points = {
                new KClosestPointsToTheOrigin.Point(1, 3),
                new KClosestPointsToTheOrigin.Point(3, 4),
                new KClosestPointsToTheOrigin.Point(2, -1)
        };
        int k = 1;
        assertEquals(10, KClosestPointsToTheOrigin.findClosestPointsToTheOrigin(points, k).get(0).distFromOrigin());
    }

    @Test
    public void testFindClosestPointsToTheOrigin_AllPointsClosest() {
        KClosestPointsToTheOrigin.Point[] points = {
                new KClosestPointsToTheOrigin.Point(1, 1),
                new KClosestPointsToTheOrigin.Point(2, 2),
                new KClosestPointsToTheOrigin.Point(3, 3)
        };
        int k = 3;
        assertEquals(2, KClosestPointsToTheOrigin.findClosestPointsToTheOrigin(points, k).size());
    }

    @Test
    public void testFindClosestPointsToTheOrigin_KEqualsArraySize() {
        KClosestPointsToTheOrigin.Point[] points = {
                new KClosestPointsToTheOrigin.Point(1, 3),
                new KClosestPointsToTheOrigin.Point(3, 4),
                new KClosestPointsToTheOrigin.Point(2, -1)
        };
        int k = 3;
        assertEquals(3, KClosestPointsToTheOrigin.findClosestPointsToTheOrigin(points, k).size());
    }

    @Test
    public void testFindClosestPointsToTheOrigin_EmptyArray() {
        KClosestPointsToTheOrigin.Point[] points = {};
        int k = 3;
        assertEquals(0, KClosestPointsToTheOrigin.findClosestPointsToTheOrigin(points, k).size());
    }

    @Test
    public void testFindClosestPointsToTheOrigin_KGreaterThanArraySize() {
        KClosestPointsToTheOrigin.Point[] points = {
                new KClosestPointsToTheOrigin.Point(1, 3),
                new KClosestPointsToTheOrigin.Point(3, 4),
                new KClosestPointsToTheOrigin.Point(2, -1)
        };
        int k = 5;
        assertEquals(3, KClosestPointsToTheOrigin.findClosestPointsToTheOrigin(points, k).size());
    }
}
