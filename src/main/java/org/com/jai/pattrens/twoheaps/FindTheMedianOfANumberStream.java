package org.com.jai.pattrens.twoheaps;

import java.util.PriorityQueue;

public class FindTheMedianOfANumberStream {

    // Max heap for the left half of the numbers (lower values).
    PriorityQueue<Integer> maxHeap;

    // Min heap for the right half of the numbers (higher values).
    PriorityQueue<Integer> minHeap;

    public FindTheMedianOfANumberStream(){
        // Initialize the max heap with a comparator that reverses the natural order.
        maxHeap = new PriorityQueue<>((a,b) -> b - a);

        // Initialize the min heap with the default natural order.
        minHeap = new PriorityQueue<>((a,b) -> a - b);
    }

    public void insertNum(int num){

        if (maxHeap.isEmpty() || maxHeap.peek() >= num){
            // If maxHeap is empty or the current number is less than or equal to the maximum value in maxHeap,
            // add it to maxHeap.
            maxHeap.add(num);
        }else{
            // Otherwise, add it to minHeap.
            minHeap.add(num);
        }

        if (maxHeap.size() > minHeap.size() + 1){
            // If the size of maxHeap is more than one greater than the size of minHeap,
            // move the maximum value from maxHeap to minHeap.
            minHeap.add(maxHeap.poll());
        } else if (maxHeap.size() < minHeap.size()) {
            // If the size of maxHeap is less than the size of minHeap,
            // move the minimum value from minHeap to maxHeap.
            maxHeap.add(minHeap.poll());
        }
    }

    public Double findMedian(){
        if (maxHeap.size() == minHeap.size()){
            // If both heaps have the same size, return the average of the top elements.
            return maxHeap.peek() / 2.0 + minHeap.peek() / 2.0;
        }

        // Otherwise, return the top element of maxHeap (the median).
        return Double.valueOf(maxHeap.peek());
    }

    public static void main(String[] args) {
        FindTheMedianOfANumberStream numberStream = new FindTheMedianOfANumberStream();

        numberStream.insertNum(3);
        numberStream.insertNum(1);

        // Expected median: (3 + 1) / 2 = 2.0
        System.out.println(numberStream.findMedian());

        numberStream.insertNum(5);

        // Expected median: 3.0
        System.out.println(numberStream.findMedian());
    }
}
