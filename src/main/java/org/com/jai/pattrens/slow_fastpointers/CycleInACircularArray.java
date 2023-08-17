package org.com.jai.pattrens.slow_fastpointers;

public class CycleInACircularArray {

    /*
     * This function checks if there is a circular loop in the given circular array.
     * It uses the "slow" and "fast" pointer technique to determine if there is a cycle.
     */
    public static boolean checkIfCircularArrayHasCycle(int[] arr) {
        if (arr.length <= 1) {
            return false; // A circular loop is not possible with 0 or 1 elements.
        }

        for (int i = 0; i < arr.length; i++) {
            int slow, fast;
            slow = fast = i;
            boolean ifForward = arr[i] > 0;

            while (true) {
                slow = getNextPosition(arr, slow, ifForward);
                if (slow == -1) {
                    break;
                }

                fast = getNextPosition(arr, fast, ifForward);
                if (fast == -1) {
                    break;
                }

                fast = getNextPosition(arr, fast, ifForward);
                if (fast == -1) {
                    break;
                }

                if (slow == fast) {
                    return true; // Found a circular loop.
                }
            }
        }

        return false; // No circular loop was found.
    }

    /*
     * This function calculates the next position to move in the circular array.
     * Returns -1 if moving in the current direction is not possible.
     */
    private static int getNextPosition(int[] arr, int index, boolean ifForward) {
        boolean direction = arr[index] >= 0;

        if (direction != ifForward) {
            return -1; // Can't move in the given direction.
        }

        int nextIndex = (index + arr[index]) % arr.length;

        if (nextIndex < 0) {
            nextIndex = nextIndex + arr.length; // Handle negative index wraparound.
        }

        if (nextIndex == index) {
            return -1; // Moving to the same index means we're stuck.
        }

        return nextIndex;

        /*
                time complexity of this code is O(n^2);
                space complexity is O(1)
         */
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, -1, -2};

        System.out.println(checkIfCircularArrayHasCycle(arr));
    }
}
