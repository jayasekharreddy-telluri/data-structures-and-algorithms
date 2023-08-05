package org.com.jai.pattrens.slidingwindow;

/*
        https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/
        https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/discuss/3488620/JavaororFull-ExplainationororCommentsororBeginner-Friendly
 */

public class MaximumNumberOfVowelsInASubstringOfGivenLength {

    public static int optimalSolution(String s, int k) {

        int vowelCount = 0;
        int maxCount = 0;

        // Count the number of vowels in the first substring of length 'k'
        for (int i = 0; i < k; i++) {
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }
        }

        // Initialize the maxCount with the vowel count of the first substring
        maxCount = Math.max(vowelCount, maxCount);

        // Start sliding the window from k to the end of the string
        for (int i = k; i < s.length(); i++) {

            // If maxCount is already equal to 'k', we don't need to check further
            if (maxCount == k) {
                return k;
            }

            // Remove the leftmost character of the current window from the vowel count
            if (isVowel(s.charAt(i - k))) {
                vowelCount--;
            }

            // Add the rightmost character of the current window to the vowel count
            if (isVowel(s.charAt(i))) {
                vowelCount++;
            }

            // Update the maxCount with the maximum vowel count seen so far
            maxCount = Math.max(maxCount, vowelCount);
        }

        return maxCount;
    }

    // Helper function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static void main(String[] args) {
        String s = "abciiidef";
        int k = 3;
        int res = optimalSolution(s, k);
        System.out.println(res);
    }

    /*
        time complexity - O(n)
        space complexity - O(1)
     */
}