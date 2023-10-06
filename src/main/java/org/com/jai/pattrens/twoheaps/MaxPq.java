package org.com.jai.pattrens.twoheaps;

import java.util.Arrays;

public class MaxPq {

    Integer[] heap;
    int n;

    public MaxPq(Integer capacity) {

        heap = new Integer[capacity + 1];
        n = 0;
    }

    public boolean isEmpty() {

        return n == 0;

    }

    public int size() {
        return n;
    }

    public void insert(int x) {

        if (n == heap.length - 1) {

            resizee(2 * heap.length);
        }
        n++;
        heap[n] = x;
        swim(n);
    }

    private void swim(int k) {
        // checking parent is less than child if yes swap
        while (k > 1 && heap[k / 2] < heap[k]) {

            int temp = heap[k / 2];

            heap[k / 2] = heap[k];

            heap[k] = temp;

            // traversing to parent again to check re-heapify property
            k = k / 2;
        }

    }

    public int deleteMax() {

        int max = heap[1];

        swapp(1, n);

        n--;
        sink(1);
        heap[n + 1] = null;

        if (n > 0 && (n == (heap.length - 1) / 4)) {
            resizee(heap.length/2);
        }
        return max;


    }

    private void sink(int k) {

        while (2 * k <= n) { // if true means we have a child for that parent

            int j = 2 * k;

            // if it is true means we have right child also and we check left or right child which is big
            // if left child < right child, we increase the j -> j++
            if (j < n && heap[j] < heap[j + 1]) {
                j++;
            }

            // if parent >= child then we break

            if (heap[k] >= heap[j]) {

                break;
            }

            swapp(k, j);

            // here we take child as parent to do sink process
            k = j;

        }

    }

    private void swapp(int a, int b) {

        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    private void resizee(Integer capacity) {

        Integer[] temp = new Integer[capacity];
        for (int i = 0; i < heap.length; i++) {
            temp[i] = heap[i];
        }
        heap = temp;
    }

    public static void main(String[] args) {

        MaxPq maxPq = new MaxPq(3);

        System.out.println(maxPq.isEmpty());

        System.out.println(maxPq.size());

        maxPq.insert(3);
        maxPq.insert(4);
        maxPq.insert(7);
        maxPq.insert(8);

        System.out.println(Arrays.toString(maxPq.heap));


        System.out.println(maxPq.deleteMax());

        System.out.println(maxPq.deleteMax());

        System.out.println(maxPq.deleteMax());

        System.out.println(Arrays.toString(maxPq.heap));


    }


}
