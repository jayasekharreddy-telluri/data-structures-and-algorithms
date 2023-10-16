package org.com.jai.pattrens.subsets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BalancedParentheses {

    public static List<String> genarativeValideParenthesis(int num) {
        // Initialize the list to store valid combinations
        List<String> result = new ArrayList<>();

        if (num == 0){
            return result;
        }

        // Initialize a queue for BFS
        Queue<BalancedParenthesis> queue = new LinkedList<>();

        // Start with an empty string and counts of open and close parentheses set to 0
        queue.add(new BalancedParenthesis("", 0, 0));

        while (!queue.isEmpty()) {
            // Dequeue the current balanced parenthesis state
            BalancedParenthesis bp = queue.poll();

            // If both open and close counts reach the desired number, add the combination to the result
            if (bp.openCount == num && bp.closeCount == num) {
                result.add(bp.str);
            } else {
                // If open count is less than the desired number, add an open parenthesis
                if (bp.openCount < num) {
                    queue.add(new BalancedParenthesis(bp.str + "(", bp.openCount + 1, bp.closeCount));
                }

                // If open count is greater than close count, add a close parenthesis
                if (bp.openCount > bp.closeCount) {
                    queue.add(new BalancedParenthesis(bp.str + ")", bp.openCount, bp.closeCount + 1));
                }
            }
        }

        // Return the list of valid combinations
        return result;

        /*
                Time Complexity: O(2^N)

                Space Complexity: O(N)
         */
    }

    public static void main(String[] args) {
        // Test the function with input 3
        List<String> combinations = genarativeValideParenthesis(3);

        // Print the generated combinations
        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}
