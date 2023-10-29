package binarysearch;

public class NextLetter {

    public static char searchNextLetter(char[] letters, char key) {
        if (key < letters[0] || key > letters[letters.length - 1]) {
            return letters[0]; // If the key is smaller than the smallest letter or greater than the largest letter, return the smallest letter.
        }

        int start = 0; // Initialize the start index.
        int end = letters.length - 1; // Initialize the end index.

        while (start <= end) { // While the search range is valid.
            int mid = start + (end - start) / 2; // Calculate the middle index.

            if (key < letters[mid]) {
                end = mid - 1; // If the key is smaller, search the left half.
            } else {
                start = mid + 1; // If the key is greater or equal, search the right half.
            }
        }
        // To account for the wrap-around in the circular array, use modulo.
        return letters[start % letters.length];


        /*

                Time Complexity: O(log N)
                Space Complexity: O(1)

         */
    }

    public static void main(String[] args) {
        char[] letters = {'a', 'c', 'f', 'h'};
        char key = 'f';
        System.out.println(searchNextLetter(letters, key));
    }
}
