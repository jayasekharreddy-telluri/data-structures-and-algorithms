package topkelements;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class MaximumDistinctElements {

    public static int findMaximumDistinctElements(int[] arr,int k){

        int distinctElementsCount = 0;

        if (arr.length <= k){

            return distinctElementsCount;
        }
        Map<Integer,Integer> numFrequencyMap = new HashMap<>();

        for (int i : arr){

            numFrequencyMap.put(i,numFrequencyMap.getOrDefault(i,0) + 1);
        }

        PriorityQueue<Map.Entry<Integer,Integer>> minHeap = new PriorityQueue<>((e1,e2) -> e1.getValue()- e2.getValue());

        for (Map.Entry<Integer,Integer> entry : numFrequencyMap.entrySet()){

            if (entry.getValue() == 1){

                distinctElementsCount++;
            }else {
                minHeap.add(entry);
            }
        }

        while (k > 0 && !minHeap.isEmpty()){

            Map.Entry<Integer,Integer> entry = minHeap.poll();

            k = k - (entry.getValue() - 1);

            if (k >= 0){
                distinctElementsCount++;
            }
        }

        if (k > 0){

            distinctElementsCount -= k;
        }

        return distinctElementsCount;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 3, 3, 3, 4, 4, 5, 5, 5};

        int k = 2;

        System.out.println(findMaximumDistinctElements(arr,k));

    }
}
