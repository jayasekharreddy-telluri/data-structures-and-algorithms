package org.com.jai.pattrens.slidingwindow;


/*
    Problem: https://leetcode.com/problems/maximize-the-confusion-of-an-exam/
    You are given a string answerKey representing the original answer key for an exam.
    The string has only the characters 'T' and 'F', representing the correct and incorrect answers, respectively.
    You are also given an integer k, which is the maximum number of times you may perform the following operation:
    Change the answer key at any position to 'T' or 'F'.
    Return the maximum length of the resulting sequence of 'T's and 'F's.

    Reference: https://leetcode.com/problems/maximize-the-confusion-of-an-exam/discuss/3729656/Video-Solution-or-Sliding-Window-2-Pointers
 */

public class MaximizeTheConfusionOfAnExam {

    public static int optimalSolution(String answerKey, int k) {

        if(answerKey.length() == 0 || k < 0){

            return 0;
        }

        int countT = 0; // Count of 'T's
        int countF = 0; // Count of 'F's
        int windowStart = 0; // Sliding window start
        int windowEnd = 0; // Sliding window end
        int result = 0; // Maximum length of the resulting sequence of 'T's and 'F's

        while (windowEnd < answerKey.length()) {
            // Expand the window and update counts based on the current character
            if (answerKey.charAt(windowEnd) == 'F') {
                countF++;
            } else {
                countT++;
            }

            // Shrink the window if the number of changes required (min(countT, countF)) exceeds k
            while (Math.min(countT, countF) > k) {
                if (answerKey.charAt(windowStart) == 'F') {
                    countF--;
                } else {
                    countT--;
                }
                windowStart++;
            }

            // Update the result with the maximum length of the resulting sequence so far
            result = Math.max(result, countT + countF);
            windowEnd++;
        }

        System.out.println("Maximum length of resulting sequence: " + result);
        return result;

        /*
                Time Complexity: O(n)
                Space Complexity: O(1)
         */
    }

    public static void main(String[] args) {
        String answerKey = "TTFTTFTT";
        int k = 1;
        optimalSolution(answerKey, k);
    }
}
