package org.com.jai.pattrens.recursion;

import java.util.ArrayList;
import java.util.List;

public class FindArrayIsSortedOrNot {

    public static void main(String[] args) {

        int[] arr = {0, 1, 1, 3, 3, 2};

        System.out.println(find(arr, 0, Integer.MIN_VALUE));


        System.out.println(findTarget(arr, 8, 0));


        System.out.println(findTargetIndex(arr, 8, 0));

        List<Integer> list = new ArrayList<>();

        System.out.println(findAllTargetIndexes(arr, 1, 0, list));


    }

    private static List<Integer> findAllTargetIndexes(int[] arr, int target, int index, List<Integer> list) {


        if (arr.length - 1 == index) {

            return list;
        }

        if (arr[index] == target) {

            list.add(index);
            //return list.add(index);

        }

        return findAllTargetIndexes(arr, target, index + 1, list);


    }

    private static int findTargetIndex(int[] arr, int target, int index) {

        if (arr.length - 1 == index) {

            return -1;
        }

        if (arr[index] == target) {

            return index;
        } else {

            return findTargetIndex(arr, target, index + 1);
        }


    }

    private static boolean findTarget(int[] arr, int target, int index) {

        if (arr.length - 1 == index) {

            return false;
        }

        return arr[index] == target || findTarget(arr, target, index + 1);

    }

    private static boolean find(int[] arr, int index, int previous) {

        if (arr.length - 1 == index) {

            return true;
        }

        return previous < arr[index] && find(arr, index + 1, arr[index]);


    }
}
