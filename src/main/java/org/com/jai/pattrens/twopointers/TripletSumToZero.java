package org.com.jai.pattrens.twopointers;


import java.util.*;

/*
    Problem: Given an array of integers, find all unique triplets in the array that add up to zero.

    LeetCode Problem Link: https://leetcode.com/problems/3sum/
    Solution Discussion Link: https://leetcode.com/problems/3sum/discuss/3109452/C%2B%2B-Easiest-Beginner-friendly-Sol-oror-Set-%2B-Two-Pointer-Approach-oror-O(n2-logn)-time-and-O(n)-space
*/
public class TripletSumToZero {

    public static List<List<Integer>> optimalSolution(int[] nums){

        Set<List<Integer>> triplet = new HashSet<>(); // Set to store unique triplets

        List<Integer> list;

        Arrays.sort(nums); // Sorting the array in ascending order

        for (int i = 0; i < nums.length - 2; i++){

            int left = i + 1; // Pointer at the leftmost element after nums[i]
            int right = nums.length - 1; // Pointer at the rightmost element

            while(left < right){

                int sum = nums[i] + nums[right] + nums[left]; // Calculate the sum of three elements

                if (sum == 0){
                    triplet.add(Arrays.asList(nums[i] , nums[right] ,nums[left])); // Add triplet to the set
                    left ++;
                    right --;
                } else if(sum > 0){
                    right--; // If sum is greater than 0, move the right pointer towards the left
                } else{
                    left++; // If sum is less than 0, move the left pointer towards the right
                }

            }

        }
        System.out.println(triplet);
        return new ArrayList<>(triplet);

        /*
            time complexity of this solution is O(n^2)
            space complexity is O(n)
         */
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};

        optimalSolution(nums);
    }
}
