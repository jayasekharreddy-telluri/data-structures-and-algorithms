package topkelements;

import org.com.jai.pattrens.topkelements.ConnectRopes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConnectRopesTest {

    @Test
    public void testMinCostConnectRopes_GenericCase() {
        int[] arr = {3, 4, 5, 6};
        assertEquals(34, ConnectRopes.minCostConnectRopes(arr));
    }

    @Test
    public void testMinCostConnectRopes_TwoRopes() {
        int[] arr = {8, 5};
        assertEquals(13, ConnectRopes.minCostConnectRopes(arr));
    }

    @Test
    public void testMinCostConnectRopes_ThreeRopes() {
        int[] arr = {1, 2, 3};
        assertEquals(9, ConnectRopes.minCostConnectRopes(arr));
    }

    @Test
    public void testMinCostConnectRopes_EmptyArray() {
        int[] arr = {};
        assertEquals(0, ConnectRopes.minCostConnectRopes(arr));
    }

    @Test
    public void testMinCostConnectRopes_SingleRope() {
        int[] arr = {5};
        assertEquals(0, ConnectRopes.minCostConnectRopes(arr));
    }

    @Test
    public void testMinCostConnectRopes_AllRopesEqual() {
        int[] arr = {4, 4, 4, 4};
        assertEquals(24, ConnectRopes.minCostConnectRopes(arr));
    }

    @Test
    public void testMinCostConnectRopes_DuplicateRopes() {
        int[] arr = {3, 5, 3, 5};
        assertEquals(29, ConnectRopes.minCostConnectRopes(arr));
    }
}
