package org.com.jai.pattrens.topkelements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencyStack {

    int sequenceNumber = 0;

    // Max heap to store elements based on frequency and sequence
    PriorityQueue<Element> maxHeap = new PriorityQueue<>(new ElementComparator());

    // Map to store the frequency of each element
    Map<Integer, Integer> freqMap = new HashMap<>();

    // Method to push an element into the stack
    public void push(int num) {
        // Increment the frequency of the element in the map
        freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);

        // Add the element with its frequency and sequence number to the max heap
        maxHeap.add(new Element(num, freqMap.get(num), sequenceNumber++));
    }

    // Method to pop the element with the highest frequency
    public int pop() {
        // Retrieve the element with the highest frequency and sequence
        int num = maxHeap.poll().number;

        // Decrease the frequency of the element in the map or remove it if frequency becomes 0
        if (freqMap.get(num) > 1) {
            freqMap.put(num, freqMap.get(num) - 1);
        } else {
            freqMap.remove(num);
        }

        return num;
    }

    public static void main(String[] args) {
        FrequencyStack frequencyStack = new FrequencyStack();

        // Pushing elements into the stack
        frequencyStack.push(1);
        frequencyStack.push(2);
        frequencyStack.push(3);
        frequencyStack.push(2);
        frequencyStack.push(1);
        frequencyStack.push(2);
        frequencyStack.push(5);

        // Popping elements from the stack and printing them
        System.out.println(frequencyStack.pop());
        System.out.println(frequencyStack.pop());
        System.out.println(frequencyStack.pop());
    }
}
