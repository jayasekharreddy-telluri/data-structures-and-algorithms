package org.com.jai.pattrens.slidingwindow;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordsConcatenation {

    public static List<Integer> optimalSolution(String s, String[] words) {

        if(s == null || words == null || s.length() == 0 || words.length == 0){

            return new ArrayList<>();
        }


        Map<String, Integer> wordFrequency = new HashMap<>();

        // Count the frequency of each word in the words array.
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        List<Integer> result = new ArrayList<>();

        int wordLength = words[0].length(); // Length of each word.
        int wordCount = words.length;       // Total number of words.

        for (int i = 0; i <= s.length() - wordLength * wordCount; i++) {

            Map<String, Integer> wordSeen = new HashMap<>();

            // Check if the current substring matches the concatenated words.
            for (int j = 0; j < wordCount; j++) {

                int nextWord = i + j * wordLength; // Index of the next word's start in the substring.

                String word = s.substring(nextWord, nextWord + wordLength); // Extract the next word.

                // If the word is not part of the words array, break the loop.
                if (!wordFrequency.containsKey(word)) {
                    break;
                }

                wordSeen.put(word, wordSeen.getOrDefault(word, 0) + 1);

                // If the frequency of the current word in the substring exceeds its frequency in words array, break.
                if (wordSeen.get(word) > wordFrequency.getOrDefault(word, 0)) {
                    break;
                }

                // If all words are found in the substring, add the starting index to the result.
                if (j + 1 == wordCount) {
                    result.add(i);
                }
            }
        }

        return result;

        /*
                Time Complexity:
                The time complexity of this solution is O(N * M * K),
                where N is the length of the string s, M is the average length of words in the words array,
                and K is the length of the words array.

                Space Complexity: The space complexity is O(K + N),
                where K is the space used for the wordFrequency and wordSeen maps,
                and N is the space required for the result list.
         */
    }

    public static void main(String[] args) {
        String s = "catcatfox";
        String[] words = {"cat", "fox"};

        System.out.println(optimalSolution(s, words)); // Print the list of starting indices.
    }
}
