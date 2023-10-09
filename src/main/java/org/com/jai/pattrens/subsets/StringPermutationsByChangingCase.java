package org.com.jai.pattrens.subsets;

import java.util.ArrayList;
import java.util.List;

public class StringPermutationsByChangingCase {

    public static List<String> findStringPermutations(String str) {

        // Initialize the result list to store string permutations
        List<String> result = new ArrayList<>();

        // Add the original string as the first permutation
        result.add(str);

        // Iterate through each character in the input string
        for (int i = 0; i < str.length(); i++) {

            // Check if the character is a letter (uppercase or lowercase)
            if (Character.isLetter(str.charAt(i))) {

                // Get the current size of the result list
                int n = result.size();

                // Iterate through the existing permutations
                for (int j = 0; j < n; j++) {

                    // Convert the current permutation to a character array
                    char[] chars = result.get(j).toCharArray();

                    // Toggle the case of the current character
                    if (Character.isUpperCase(chars[i])) {
                        chars[i] = Character.toLowerCase(chars[i]);
                    } else {
                        chars[i] = Character.toUpperCase(chars[i]);
                    }

                    // Add the new permutation to the result list
                    result.add(String.valueOf(chars));
                }
            }
        }

        return result;

        /*
                Time Complexity: O(N * N!)
                Space Complexity: O(N * N!)
         */
    }

    public static void main(String[] args) {

        String str = "er32";

        // Call the findStringPermutations method and print the result
        System.out.println(findStringPermutations(str));
    }
}
